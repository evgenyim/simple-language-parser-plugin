// This is a generated file. Not intended for manual editing.
package com.example.demo.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.demo.psi.impl.*;

public interface CobolTypes {

  IElementType BY_STATEMENT = new CobolElementType("BY_STATEMENT");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DESCRIPTION = new CobolElementType("DATA_DESCRIPTION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_DIVISION_ENTRY = new CobolElementType("DATA_DIVISION_ENTRY");
  IElementType DATA_ITEM_ENTRY = new CobolElementType("DATA_ITEM_ENTRY");
  IElementType DATA_ITEM_LINE = new CobolElementType("DATA_ITEM_LINE");
  IElementType DATA_LEN = new CobolElementType("DATA_LEN");
  IElementType DATA_LEVEL = new CobolElementType("DATA_LEVEL");
  IElementType DATA_NAME = new CobolElementType("DATA_NAME");
  IElementType DATA_VALUE_CLAUSE = new CobolElementType("DATA_VALUE_CLAUSE");
  IElementType DATA_WS_ENTRY = new CobolElementType("DATA_WS_ENTRY");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType FROM_STATEMENT = new CobolElementType("FROM_STATEMENT");
  IElementType ID_DIVISION = new CobolElementType("ID_DIVISION");
  IElementType ID_ENTRY_LINE = new CobolElementType("ID_ENTRY_LINE");
  IElementType ID_LINE = new CobolElementType("ID_LINE");
  IElementType LINE_NUM = new CobolElementType("LINE_NUM");
  IElementType LITERAL = new CobolElementType("LITERAL");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PARAGRAPHS = new CobolElementType("PARAGRAPHS");
  IElementType PARAGRAPH_NAME = new CobolElementType("PARAGRAPH_NAME");
  IElementType PARAGRAPH_NAME_ENTRY = new CobolElementType("PARAGRAPH_NAME_ENTRY");
  IElementType PERFORM_STATEMENT = new CobolElementType("PERFORM_STATEMENT");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROCEDURE_DIVISION_ENTRY = new CobolElementType("PROCEDURE_DIVISION_ENTRY");
  IElementType PROGRAM_NAME = new CobolElementType("PROGRAM_NAME");
  IElementType REPEAT_VALUE = new CobolElementType("REPEAT_VALUE");
  IElementType SENTENCE = new CobolElementType("SENTENCE");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STATEMENT_LIST = new CobolElementType("STATEMENT_LIST");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");
  IElementType UNTIL_STATEMENT = new CobolElementType("UNTIL_STATEMENT");
  IElementType VARYING_PHASE = new CobolElementType("VARYING_PHASE");
  IElementType VARYING_VAR = new CobolElementType("VARYING_VAR");

  IElementType APOSTROPH = new CobolTokenType("APOSTROPH");
  IElementType BY = new CobolTokenType("BY");
  IElementType DATA_DIV = new CobolTokenType("DATA_DIV");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType EQ = new CobolTokenType("EQ");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType ID_DIV = new CobolTokenType("ID_DIV");
  IElementType INT_SPEC = new CobolTokenType("INT_SPEC");
  IElementType INT_VALUE = new CobolTokenType("INT_VALUE");
  IElementType PAREN_CLOSE = new CobolTokenType("PAREN_CLOSE");
  IElementType PAREN_OPEN = new CobolTokenType("PAREN_OPEN");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PROC_DIV = new CobolTokenType("PROC_DIV");
  IElementType PROG_ID = new CobolTokenType("PROG_ID");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SEP = new CobolTokenType("SEP");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType STRING_SPEC = new CobolTokenType("STRING_SPEC");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WS_SEC = new CobolTokenType("WS_SEC");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BY_STATEMENT) {
        return new CobolByStatementImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DESCRIPTION) {
        return new CobolDataDescriptionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_DIVISION_ENTRY) {
        return new CobolDataDivisionEntryImpl(node);
      }
      else if (type == DATA_ITEM_ENTRY) {
        return new CobolDataItemEntryImpl(node);
      }
      else if (type == DATA_ITEM_LINE) {
        return new CobolDataItemLineImpl(node);
      }
      else if (type == DATA_LEN) {
        return new CobolDataLenImpl(node);
      }
      else if (type == DATA_LEVEL) {
        return new CobolDataLevelImpl(node);
      }
      else if (type == DATA_NAME) {
        return new CobolDataNameImpl(node);
      }
      else if (type == DATA_VALUE_CLAUSE) {
        return new CobolDataValueClauseImpl(node);
      }
      else if (type == DATA_WS_ENTRY) {
        return new CobolDataWsEntryImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == FROM_STATEMENT) {
        return new CobolFromStatementImpl(node);
      }
      else if (type == ID_DIVISION) {
        return new CobolIdDivisionImpl(node);
      }
      else if (type == ID_ENTRY_LINE) {
        return new CobolIdEntryLineImpl(node);
      }
      else if (type == ID_LINE) {
        return new CobolIdLineImpl(node);
      }
      else if (type == LINE_NUM) {
        return new CobolLineNumImpl(node);
      }
      else if (type == LITERAL) {
        return new CobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PARAGRAPHS) {
        return new CobolParagraphsImpl(node);
      }
      else if (type == PARAGRAPH_NAME) {
        return new CobolParagraphNameImpl(node);
      }
      else if (type == PARAGRAPH_NAME_ENTRY) {
        return new CobolParagraphNameEntryImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new CobolPerformStatementImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROCEDURE_DIVISION_ENTRY) {
        return new CobolProcedureDivisionEntryImpl(node);
      }
      else if (type == PROGRAM_NAME) {
        return new CobolProgramNameImpl(node);
      }
      else if (type == REPEAT_VALUE) {
        return new CobolRepeatValueImpl(node);
      }
      else if (type == SENTENCE) {
        return new CobolSentenceImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new CobolStatementListImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      else if (type == UNTIL_STATEMENT) {
        return new CobolUntilStatementImpl(node);
      }
      else if (type == VARYING_PHASE) {
        return new CobolVaryingPhaseImpl(node);
      }
      else if (type == VARYING_VAR) {
        return new CobolVaryingVarImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
