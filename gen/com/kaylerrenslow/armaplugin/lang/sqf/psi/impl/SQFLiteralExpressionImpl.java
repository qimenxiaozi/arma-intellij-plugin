// This is a generated file. Not intended for manual editing.
package com.kaylerrenslow.armaplugin.lang.sqf.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kaylerrenslow.armaplugin.lang.sqf.psi.SQFTypes.*;
import com.kaylerrenslow.armaplugin.lang.sqf.psi.*;

public class SQFLiteralExpressionImpl extends SQFExpressionImpl implements SQFLiteralExpression {

  public SQFLiteralExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SQFVisitor visitor) {
    visitor.visitLiteralExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SQFVisitor) accept((SQFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SQFArray getArray() {
    return findChildByClass(SQFArray.class);
  }

  @Override
  @Nullable
  public SQFString getString() {
    return findChildByClass(SQFString.class);
  }

  @Override
  @Nullable
  public SQFVariable getVariable() {
    return findChildByClass(SQFVariable.class);
  }

}