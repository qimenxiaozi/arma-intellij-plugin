// This is a generated file. Not intended for manual editing.
package com.kaylerrenslow.a3plugin.lang.header.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HeaderArrayEntry extends PsiElement {

  @Nullable
  HeaderArray getArray();

  @Nullable
  HeaderExpression getExpression();

  @Nullable
  HeaderMacroFunction getMacroFunction();

  @Nullable
  HeaderStringtableKey getStringtableKey();

}
