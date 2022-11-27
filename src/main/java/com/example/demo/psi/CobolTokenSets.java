package com.example.demo.psi;

import com.intellij.psi.tree.TokenSet;

public interface CobolTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(CobolTypes.INT_VALUE);

    TokenSet COMMENTS = TokenSet.create(CobolTypes.INT_VALUE);

}
