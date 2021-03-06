package com.kaylerrenslow.a3plugin.components.versionChecker;

import com.intellij.ide.BrowserUtil;
import com.intellij.json.JsonLanguage;
import com.intellij.json.psi.JsonFile;
import com.intellij.json.psi.JsonObject;
import com.intellij.json.psi.JsonProperty;
import com.intellij.json.psi.JsonStringLiteral;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationListener;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.kaylerrenslow.a3plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.event.HyperlinkEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Checks if the Arma Intellij Plugin has a new release available at the github repo.
 *
 * @author Kayler
 * @since 05/13/2016
 */
public class PluginVersionChecker implements ProjectComponent {
    private final Project project;

    public PluginVersionChecker(Project project) {
        this.project = project;
    }

    @Override
    public void initComponent() {

    }

    @Override
    public void disposeComponent() {

    }

    @Override
    @NotNull
    public String getComponentName() {
        return "ArmaPluginVersionCheckerComponent";
    }

    @Override
    public void projectOpened() {
        checkIfUpdate(this.project);
    }

    @Override
    public void projectClosed() {

    }

    /**
     * Checks if the plugin has a new version available. If it does, a notification will popup telling the user. If at any point the check fails, an error notification will popup as well.
     *
     * @param project project instance
     */
    private static void checkIfUpdate(@NotNull Project project) {
        String newPluginVersion;
        try {
            newPluginVersion = newPluginVersion(project);
        } catch (Exception e) {
            PluginVersionNotification.showNewNotification("Arma Intellij Plugin Error", e.getMessage(), NotificationType.ERROR, null, project);
            return;
        }
        if (newPluginVersion == null) {
            return;
        }
        String msg = "Version " + newPluginVersion + " has been released. Get the newest version <a href='" + Plugin.resources.getString("plugin.repo.latest_version.url") + "'>here</a>.";
        PluginVersionNotification.showNewNotification("Arma Intellij Plugin Notification", msg, NotificationType.INFORMATION, new NotificationListener() {
            @Override
            public void hyperlinkUpdate(@NotNull Notification notification, @NotNull HyperlinkEvent event) {
                BrowserUtil.browse(event.getURL());
            }
        }, project);
    }

    private static String newPluginVersion(@NotNull Project project) throws Exception {
        String json = getLatestVersionJSON();
        String couldntRead = "Couldn't read the latest version info.";

        if (json == null) {
            throw new Exception(couldntRead);
        }
        JsonFile jsonFile;
        try {
            jsonFile = (JsonFile) PsiFileFactory.getInstance(project).createFileFromText(JsonLanguage.INSTANCE, json);
            if (jsonFile == null) {
                throw new Exception(couldntRead);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new Exception(couldntRead);
        }

        return newVersionAvailable(jsonFile);
    }

    @Nullable
    private static String getLatestVersionJSON() {
        String received;
        try {
            URL url = new URL(Plugin.resources.getString("plugin.repo.latest_version.json"));
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            received = reader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }
        return received;
    }

    private static String newVersionAvailable(@NotNull JsonFile latestVersionJson) throws Exception {
        JsonObject object;
        String apiChange = "Apparently GitHub changed their API";
        try {
            object = (JsonObject) latestVersionJson.getFirstChild();
        } catch (Exception e) {
            throw new Exception(apiChange);
        }
        String searchProperty = "tag_name";
        List<JsonProperty> propertyList = object.getPropertyList();
        for (JsonProperty property : propertyList) {
            if (property.getName().equals(searchProperty)) {
                if (property.getValue() instanceof JsonStringLiteral) {
                    String releasedVersion = ((JsonStringLiteral) property.getValue()).getValue();
                    if (!releasedVersion.equals(Plugin.VERSION)) {
                        return releasedVersion;
                    } else {
                        return null;
                    }
                } else {
                    throw new Exception(apiChange);
                }
            }
        }
        throw new Exception(apiChange);
    }
}
