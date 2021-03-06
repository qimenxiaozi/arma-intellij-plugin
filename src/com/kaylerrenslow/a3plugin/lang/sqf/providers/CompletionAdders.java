package com.kaylerrenslow.a3plugin.lang.sqf.providers;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.kaylerrenslow.a3plugin.Plugin;
import com.kaylerrenslow.a3plugin.PluginIcons;
import com.kaylerrenslow.a3plugin.lang.header.psi.HeaderConfigFunction;
import com.kaylerrenslow.a3plugin.lang.header.psi.HeaderPsiUtil;
import com.kaylerrenslow.a3plugin.lang.sqf.SQFStatic;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFPsiUtil;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFTypes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * @author Kayler
 * @since 06/07/2016
 */
public interface CompletionAdders {
	/**
	 * Adds all Description.ext functions to the completion result
	 */
	static void addFunctions(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
		try {
			ArrayList<HeaderConfigFunction> configFunctions = HeaderPsiUtil.getAllConfigFunctionsFromDescriptionExt(parameters.getOriginalFile());
			String tailTextFormat = " " + Plugin.resources.getString("lang.sqf.completion.tail_text.function");
			for (HeaderConfigFunction configFunction : configFunctions) {
				result.addElement(LookupElementBuilder.create(configFunction, configFunction.getCallableName()).withTailText(String.format(tailTextFormat, configFunction.getFullRelativePath()), true).withIcon
						(HeaderConfigFunction.getIcon()));
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	/**
	 * Adds all SQF commands to the completion result
	 */
	static void addCommands(@NotNull Project project, @NotNull CompletionResultSet result) {
		String trailText = Plugin.resources.getString("lang.sqf.completion.tail_text.command");
		for (String command : SQFStatic.LIST_COMMANDS) {
			result.addElement(LookupElementBuilder.createWithSmartPointer(command, SQFPsiUtil.createElement(project, command, SQFTypes.COMMAND)).withIcon(PluginIcons.ICON_SQF_COMMAND).appendTailText(" " + trailText, true));
		}
	}

	/**
	 * Adds all SQF BIS functions to the result
	 */
	static void addBISFunctions(@NotNull Project project, @NotNull CompletionResultSet result) {
		String tailText = Plugin.resources.getString("lang.sqf.completion.tail_text.bis_function");
		for (String functionName : SQFStatic.LIST_BIS_FUNCTIONS) {
			result.addElement(LookupElementBuilder.createWithSmartPointer(functionName, SQFPsiUtil.createElement(project, functionName, SQFTypes.GLOBAL_VAR)).withIcon(PluginIcons.ICON_SQF_FUNCTION).appendTailText(" " + tailText, true));
		}
	}
}
