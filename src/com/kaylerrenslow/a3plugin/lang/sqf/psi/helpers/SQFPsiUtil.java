package com.kaylerrenslow.a3plugin.lang.sqf.psi.helpers;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.kaylerrenslow.a3plugin.lang.shared.PsiUtil;
import com.kaylerrenslow.a3plugin.lang.sqf.SQFFileType;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kayler on 03/20/2016.
 */
public class SQFPsiUtil{

	/** Gets the current scope of the psi element
	 * @param element element to get scope of
	 * @return scope
	 */
	public static SQFScope getCurrentScope(PsiElement element){
		PsiElement parent = element;
		while(parent != null && !PsiUtil.isOfElementType(parent, SQFTypes.SCOPE)){
			parent = parent.getParent();
		}
		return (SQFScope) parent;
	}

	/** Adds all SQFVariables in the entire project that is equal to findVar into a list and returns it
	 * @param project project
	 * @param findVar variable text to look for
	 * @return list
	 */
	public static List<SQFVariable> findGlobalVariables(Project project, String findVar){
		List<SQFVariable> result = new ArrayList<>();
		Collection<VirtualFile> files = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, SQFFileType.INSTANCE, GlobalSearchScope.allScope(project));
		for(VirtualFile virtualFile : files){
			SQFFile sqfFile = (SQFFile) PsiManager.getInstance(project).findFile(virtualFile);
			if(sqfFile == null){
				continue;
			}
			SQFVariable[] vars = PsiTreeUtil.getChildrenOfType(sqfFile, SQFVariable.class);
			if(vars == null){
				continue;
			}
			for(SQFVariable var : vars){
				IElementType type = var.getVariableType();
				if(type != SQFTypes.GLOBAL_VAR){
					continue;
				}
				if(findVar == null){
					result.add(var);
				}else{
					if(findVar.equals(var.getText())){
						result.add(var);
					}
				}
			}
		}
		return result;
	}

	/** Adds all SQFVariables in the entire project into a list and returns it
	 * @param project project
	 * @return list
	 */
	public static List<SQFVariable> findGlobalVariables(Project project){
		return findGlobalVariables(project, null);
	}

	public static SQFPrivateDeclVar createPrivateDeclVar(Project project, String text){
		SQFFile file = createFile(project, text);
		return (SQFPrivateDeclVar) PsiUtil.findChildElements(file, SQFTypes.PRIVATE_DECL_VAR, null).get(0).getPsi();
	}

	public static SQFVariable createVariable(Project project, String text){
		SQFFile file = createFile(project, text);
		return (SQFVariable) PsiUtil.findChildElements(file, SQFTypes.VARIABLE, null).get(0).getPsi();
	}

	public static SQFFile createFile(Project project, String text){
		String fileName = "sqfDummy.sqf";
		return (SQFFile) PsiFileFactory.getInstance(project).createFileFromText(fileName, SQFFileType.INSTANCE, text);
	}

}