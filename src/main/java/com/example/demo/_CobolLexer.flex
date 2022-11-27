package com.example.demo;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.psi.TokenType.NEW_LINE_INDENT;
import static com.example.demo.psi.CobolTypes.*;

%%

%{
  public _CobolLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CobolLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
SEP=\.+
WHITE_SPACE=\s+
WHITE_SPACE_NO_NL=[\ \t]+
NEW_LINE=\n+

INT_VALUE=[0-9]+
STRING=[a-zA-Z][a-zA-Z\-_0-9]*

%state PIC_TYPE
%state DISPLAY_TYPE

%%
<YYINITIAL> {
  {WHITE_SPACE}                  { return WHITE_SPACE; }

  {SEP}                          { return SEP; }
  "IDENTIFICATION DIVISION"      { return ID_DIV; }
  "DATA DIVISION"                { return DATA_DIV; }
  "PROCEDURE DIVISION"           { return PROC_DIV; }
  "PROGRAM-ID"                   { return PROG_ID; }
  "WORKING-STORAGE SECTION"      { return WS_SEC; }
  "PIC"                          { yybegin(PIC_TYPE); return PIC; }
  "VALUE"                        { return VALUE;}
  "PERFORM"                      { return PERFORM; }
  "VARYING"                      { return VARYING; }
  "FROM"                         { return FROM; }
  "BY"                           { return BY; }
  "UNTIL"                        { return UNTIL; }
  "STOP"                         { return STOP; }
  "RUN"                          { return RUN; }
  "DISPLAY"                      { yybegin(DISPLAY_TYPE); return DISPLAY; }
  "("                            { return PAREN_OPEN; }
  ")"                            { return PAREN_CLOSE; }
  "="                            { return EQ; }
  "'"                            { return APOSTROPH; }

  {INT_VALUE}                    { return INT_VALUE; }
  {STRING}                       { return STRING; }

}

<PIC_TYPE> {
  {WHITE_SPACE}                  { return WHITE_SPACE; }
  "9"                            { yybegin(YYINITIAL);return INT_SPEC; }
  "A"                            { yybegin(YYINITIAL);return STRING_SPEC; }

}

<DISPLAY_TYPE> {
  {WHITE_SPACE_NO_NL}            { return WHITE_SPACE; }
  {NEW_LINE}                     { yybegin(YYINITIAL); return SEP; }
  {SEP}                          { yybegin(YYINITIAL); return SEP; }

  "'"                            { return APOSTROPH; }

  {INT_VALUE}                    { return INT_VALUE; }
  {STRING}                       { return STRING; }

}

[^] { return BAD_CHARACTER; }
