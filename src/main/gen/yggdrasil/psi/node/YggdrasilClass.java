// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YggdrasilClass extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilClassBody getClassBody();

    @Nullable
    YggdrasilClassCast getClassCast();

    @Nullable
    YggdrasilIdentifier getIdentifier();

    void createLookup(@NotNull List<LookupElement> completions);

}