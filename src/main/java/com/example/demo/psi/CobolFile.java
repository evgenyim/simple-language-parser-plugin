// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.example.demo.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.example.demo.CobolFileType;
import com.example.demo.CobolLanguage;
import org.jetbrains.annotations.NotNull;

public class CobolFile extends PsiFileBase {

    public CobolFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CobolLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CobolFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Cobol File";
    }

}