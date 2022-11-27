// This is a generated file. Not intended for manual editing.
package com.example.demo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.demo.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.demo.psi.*;

public class CobolByStatementImpl extends ASTWrapperPsiElement implements CobolByStatement {

  public CobolByStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitByStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataName getDataName() {
    return findChildByClass(CobolDataName.class);
  }

  @Override
  @Nullable
  public CobolLiteral getLiteral() {
    return findChildByClass(CobolLiteral.class);
  }

}
