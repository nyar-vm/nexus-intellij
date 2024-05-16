// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinMatch;
import error.NonExistentClass;

public class DejavuMatchElementNode extends MixinMatch implements DejavuMatchElement {

  public DejavuMatchElementNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitMatchElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DejavuMatchBranch> getMatchBranchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuMatchBranch.class);
  }

  @Override
  @NotNull
  public DejavuMatchStatement getMatchStatement() {
    return findNotNullChildByClass(DejavuMatchStatement.class);
  }

  @Override
  @NotNull
  public DejavuTemplateEnd getTemplateEnd() {
    return findNotNullChildByClass(DejavuTemplateEnd.class);
  }

}
