// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;

public class DejavuExpressionGroupNode extends DejavuExpressionNode implements DejavuExpressionGroup {

  public DejavuExpressionGroupNode(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitExpressionGroup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuExpression getExpression() {
    return findNotNullChildByClass(DejavuExpression.class);
  }

}