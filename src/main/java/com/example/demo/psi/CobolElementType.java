package com.example.demo.psi;

import com.intellij.psi.tree.IElementType;
import com.example.demo.CobolLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CobolElementType extends IElementType {

    public CobolElementType(@NotNull @NonNls String debugName) {
        super(debugName, CobolLanguage.INSTANCE);
    }

}