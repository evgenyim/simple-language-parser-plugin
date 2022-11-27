// This is a generated file. Not intended for manual editing.
package com.example.demo;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.example.demo.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // BY (data_name | literal)
  public static boolean by_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "by_statement")) return false;
    if (!nextTokenIs(b, BY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BY);
    r = r && by_statement_1(b, l + 1);
    exit_section_(b, m, BY_STATEMENT, r);
    return r;
  }

  // data_name | literal
  private static boolean by_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "by_statement_1")) return false;
    boolean r;
    r = data_name(b, l + 1);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // id_division
  //                                 [data_division]
  //                                 [procedure_division]
  static boolean cobolFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_division(b, l + 1);
    r = r && cobolFile_1(b, l + 1);
    r = r && cobolFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [data_division]
  private static boolean cobolFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile_1")) return false;
    data_division(b, l + 1);
    return true;
  }

  // [procedure_division]
  private static boolean cobolFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile_2")) return false;
    procedure_division(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // data_name EQ (data_name | literal)
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_name(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && condition_2(b, l + 1);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  // data_name | literal
  private static boolean condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_2")) return false;
    boolean r;
    r = data_name(b, l + 1);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PIC (INT_SPEC|STRING_SPEC) [data_len] data_value_clause
  public static boolean data_description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_description")) return false;
    if (!nextTokenIs(b, PIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIC);
    r = r && data_description_1(b, l + 1);
    r = r && data_description_2(b, l + 1);
    r = r && data_value_clause(b, l + 1);
    exit_section_(b, m, DATA_DESCRIPTION, r);
    return r;
  }

  // INT_SPEC|STRING_SPEC
  private static boolean data_description_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_description_1")) return false;
    boolean r;
    r = consumeToken(b, INT_SPEC);
    if (!r) r = consumeToken(b, STRING_SPEC);
    return r;
  }

  // [data_len]
  private static boolean data_description_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_description_2")) return false;
    data_len(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // data_division_entry
  //                                 data_ws_entry
  //                                 {data_item_line}*
  public static boolean data_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_division_entry(b, l + 1);
    r = r && data_ws_entry(b, l + 1);
    r = r && data_division_2(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  // {data_item_line}*
  private static boolean data_division_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_division_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_division_2", c)) break;
    }
    return true;
  }

  // {data_item_line}
  private static boolean data_division_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_item_line(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // line_num DATA_DIV SEP
  public static boolean data_division_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division_entry")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && consumeTokens(b, 0, DATA_DIV, SEP);
    exit_section_(b, m, DATA_DIVISION_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // data_level data_name data_description
  public static boolean data_item_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item_entry")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_level(b, l + 1);
    r = r && data_name(b, l + 1);
    r = r && data_description(b, l + 1);
    exit_section_(b, m, DATA_ITEM_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // line_num data_item_entry SEP
  public static boolean data_item_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_item_line")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && data_item_entry(b, l + 1);
    r = r && consumeToken(b, SEP);
    exit_section_(b, m, DATA_ITEM_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // PAREN_OPEN repeat_value PAREN_CLOSE
  public static boolean data_len(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_len")) return false;
    if (!nextTokenIs(b, PAREN_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAREN_OPEN);
    r = r && repeat_value(b, l + 1);
    r = r && consumeToken(b, PAREN_CLOSE);
    exit_section_(b, m, DATA_LEN, r);
    return r;
  }

  /* ********************************************************** */
  // INT_VALUE
  public static boolean data_level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_level")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_VALUE);
    exit_section_(b, m, DATA_LEVEL, r);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean data_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_name")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, DATA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE literal
  public static boolean data_value_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_value_clause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, DATA_VALUE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // line_num WS_SEC SEP
  public static boolean data_ws_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_ws_entry")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && consumeTokens(b, 0, WS_SEC, SEP);
    exit_section_(b, m, DATA_WS_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY {literal | data_name}+
  public static boolean display_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && display_statement_1(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // {literal | data_name}+
  private static boolean display_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_statement_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_statement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_statement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // literal | data_name
  private static boolean display_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_1_0")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = data_name(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FROM (data_name | literal)
  public static boolean from_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_statement")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && from_statement_1(b, l + 1);
    exit_section_(b, m, FROM_STATEMENT, r);
    return r;
  }

  // data_name | literal
  private static boolean from_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_statement_1")) return false;
    boolean r;
    r = data_name(b, l + 1);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // id_entry_line
  //                                 id_line
  public static boolean id_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_division")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_entry_line(b, l + 1);
    r = r && id_line(b, l + 1);
    exit_section_(b, m, ID_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // line_num ID_DIV SEP
  public static boolean id_entry_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_entry_line")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && consumeTokens(b, 0, ID_DIV, SEP);
    exit_section_(b, m, ID_ENTRY_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // line_num PROG_ID SEP program_name SEP
  public static boolean id_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_line")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && consumeTokens(b, 0, PROG_ID, SEP);
    r = r && program_name(b, l + 1);
    r = r && consumeToken(b, SEP);
    exit_section_(b, m, ID_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // INT_VALUE
  public static boolean line_num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_num")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_VALUE);
    exit_section_(b, m, LINE_NUM, r);
    return r;
  }

  /* ********************************************************** */
  // INT_VALUE | APOSTROPH STRING APOSTROPH
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", APOSTROPH, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT_VALUE);
    if (!r) r = parseTokens(b, 0, APOSTROPH, STRING, APOSTROPH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // paragraph_name_entry
  //                                 {sentence}*
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paragraph_name_entry(b, l + 1);
    r = r && paragraph_1(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  // {sentence}*
  private static boolean paragraph_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraph_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraph_1", c)) break;
    }
    return true;
  }

  // {sentence}
  private static boolean paragraph_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean paragraph_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_name")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, PARAGRAPH_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // line_num paragraph_name SEP
  public static boolean paragraph_name_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_name_entry")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && paragraph_name(b, l + 1);
    r = r && consumeToken(b, SEP);
    exit_section_(b, m, PARAGRAPH_NAME_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // {sentence}* {paragraph}*
  public static boolean paragraphs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAGRAPHS, "<paragraphs>");
    r = paragraphs_0(b, l + 1);
    r = r && paragraphs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {sentence}*
  private static boolean paragraphs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphs_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraphs_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraphs_0", c)) break;
    }
    return true;
  }

  // {sentence}
  private static boolean paragraphs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {paragraph}*
  private static boolean paragraphs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraphs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraphs_1", c)) break;
    }
    return true;
  }

  // {paragraph}
  private static boolean paragraphs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paragraph(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM paragraph_name varying_phase
  public static boolean perform_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_statement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERFORM);
    r = r && paragraph_name(b, l + 1);
    r = r && varying_phase(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // procedure_division_entry
  //                                 paragraphs
  public static boolean procedure_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = procedure_division_entry(b, l + 1);
    r = r && paragraphs(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // line_num PROC_DIV SEP
  public static boolean procedure_division_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division_entry")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && consumeTokens(b, 0, PROC_DIV, SEP);
    exit_section_(b, m, PROCEDURE_DIVISION_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean program_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_name")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, PROGRAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // INT_VALUE
  public static boolean repeat_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repeat_value")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_VALUE);
    exit_section_(b, m, REPEAT_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // statement_list SEP
  public static boolean sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_list(b, l + 1);
    r = r && consumeToken(b, SEP);
    exit_section_(b, m, SENTENCE, r);
    return r;
  }

  /* ********************************************************** */
  // perform_statement | stop_statement | display_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = perform_statement(b, l + 1);
    if (!r) r = stop_statement(b, l + 1);
    if (!r) r = display_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // {line_num statement}+
  public static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    if (!nextTokenIs(b, INT_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_list_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!statement_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_list", c)) break;
    }
    exit_section_(b, m, STATEMENT_LIST, r);
    return r;
  }

  // line_num statement
  private static boolean statement_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line_num(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STOP (RUN | paragraph_name)
  public static boolean stop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STOP);
    r = r && stop_statement_1(b, l + 1);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  // RUN | paragraph_name
  private static boolean stop_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement_1")) return false;
    boolean r;
    r = consumeToken(b, RUN);
    if (!r) r = paragraph_name(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // UNTIL condition
  public static boolean until_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "until_statement")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, UNTIL_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // varying_var from_statement by_statement until_statement
  public static boolean varying_phase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varying_phase")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varying_var(b, l + 1);
    r = r && from_statement(b, l + 1);
    r = r && by_statement(b, l + 1);
    r = r && until_statement(b, l + 1);
    exit_section_(b, m, VARYING_PHASE, r);
    return r;
  }

  /* ********************************************************** */
  // VARYING data_name
  public static boolean varying_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varying_var")) return false;
    if (!nextTokenIs(b, VARYING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARYING);
    r = r && data_name(b, l + 1);
    exit_section_(b, m, VARYING_VAR, r);
    return r;
  }

}
