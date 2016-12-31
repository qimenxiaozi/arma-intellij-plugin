// This is a generated file. Not intended for manual editing.
package com.kaylerrenslow.a3plugin.lang.header.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kaylerrenslow.a3plugin.lang.header.psi.HeaderTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kaylerrenslow.a3plugin.lang.header.psi.*;

public class HeaderFileEntryImpl extends ASTWrapperPsiElement implements HeaderFileEntry {

  public HeaderFileEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HeaderVisitor visitor) {
    visitor.visitFileEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HeaderVisitor) accept((HeaderVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HeaderAssignment getAssignment() {
    return findChildByClass(HeaderAssignment.class);
  }

  @Override
  @Nullable
  public HeaderClassDeclaration getClassDeclaration() {
    return findChildByClass(HeaderClassDeclaration.class);
  }

  @Override
  @Nullable
  public HeaderDefinedText getDefinedText() {
    return findChildByClass(HeaderDefinedText.class);
  }

  @Override
  @Nullable
  public HeaderMacroFunction getMacroFunction() {
    return findChildByClass(HeaderMacroFunction.class);
  }

  @Override
  @Nullable
  public HeaderPreprocessorGroup getPreprocessorGroup() {
    return findChildByClass(HeaderPreprocessorGroup.class);
  }

}
