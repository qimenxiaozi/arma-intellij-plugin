// This is a generated file. Not intended for manual editing.
package com.kaylerrenslow.a3plugin.lang.sqf.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kaylerrenslow.a3plugin.lang.sqf.psi.*;

public class SQFAssignmentImpl extends ASTWrapperPsiElement implements SQFAssignment {

  public SQFAssignmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SQFVisitor visitor) {
    visitor.visitAssignment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SQFVisitor) accept((SQFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SQFExpression getExpression() {
    return findChildByClass(SQFExpression.class);
  }

  @Override
  @Nullable
  public SQFPrivateCommand getPrivateCommand() {
    return findChildByClass(SQFPrivateCommand.class);
  }

  @Override
  @NotNull
  public SQFVariable getVariable() {
    return findNotNullChildByClass(SQFVariable.class);
  }

  @NotNull
  public SQFVariable getAssigningVariable() {
    return SQFPsiImplUtilForGrammar.getAssigningVariable(this);
  }

  public boolean isDeclaredPrivate() {
    return SQFPsiImplUtilForGrammar.isDeclaredPrivate(this);
  }

}
