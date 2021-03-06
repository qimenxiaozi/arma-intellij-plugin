package com.kaylerrenslow.a3plugin.lang.shared.stringtable;

import com.intellij.openapi.util.Key;
import com.intellij.psi.SmartPointerManager;
import com.intellij.psi.SmartPsiElementPointer;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.Nullable;

/**
 * @author Kayler
 * @since 04/25/2016
 */
public class StringTableLookupElementDataObject {
	private final SmartPsiElementPointer<XmlTag> target;
	public static final Key<Boolean> KEY_IS_STRINGTABLE_XML = new Key<>("KEY_IS_STRINGTABLE_XML");

	public StringTableLookupElementDataObject(XmlTag targetTag) {
		this.target = SmartPointerManager.getInstance(targetTag.getProject()).createSmartPsiElementPointer(targetTag);
		this.target.getElement().putUserData(KEY_IS_STRINGTABLE_XML, true);
	}

	@Nullable
	public XmlTag getTargetTag() {
		return target.getElement();
	}
}
