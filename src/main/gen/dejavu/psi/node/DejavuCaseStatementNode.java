// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.DejavuElement;

public class DejavuCaseStatementNode extends DejavuElement implements DejavuCaseStatement {

  public DejavuCaseStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitCaseStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuTemplateCase getTemplateCase() {
    return findNotNullChildByClass(DejavuTemplateCase.class);
  }

  @Override
  @NotNull
  public List<DejavuTextElement> getTextElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTextElement.class);
  }

}
