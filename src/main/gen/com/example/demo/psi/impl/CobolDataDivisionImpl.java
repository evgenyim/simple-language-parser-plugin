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

public class CobolDataDivisionImpl extends ASTWrapperPsiElement implements CobolDataDivision {

  public CobolDataDivisionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataDivision(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolDataDivisionEntry getDataDivisionEntry() {
    return findNotNullChildByClass(CobolDataDivisionEntry.class);
  }

  @Override
  @NotNull
  public List<CobolDataItemLine> getDataItemLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolDataItemLine.class);
  }

  @Override
  @NotNull
  public CobolDataWsEntry getDataWsEntry() {
    return findNotNullChildByClass(CobolDataWsEntry.class);
  }

}
