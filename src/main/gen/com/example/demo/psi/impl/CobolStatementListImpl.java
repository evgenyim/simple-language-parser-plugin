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

public class CobolStatementListImpl extends ASTWrapperPsiElement implements CobolStatementList {

  public CobolStatementListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStatementList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolLineNum> getLineNumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolLineNum.class);
  }

  @Override
  @NotNull
  public List<CobolStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolStatement.class);
  }

}
