// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YggdrasilDefineUnion extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilIdentifier getIdentifier();

    @Nullable
    YggdrasilUnionBody getUnionBody();

    void createLookup(@NotNull List<LookupElement> completions);

}
