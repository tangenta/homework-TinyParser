package tiny
import grammar._

object Productions {
  val tinyProductions: List[Production] = Algorithm.construct(List(
    "program" -> List("stmt-sequence"),
    "stmt-sequence" -> List("statement", ";statement"),
    ";statement" -> List(";", "statement", ";statement"),
    ";statement" -> List(""),
    "statement" -> List("if-stmt"),
    "statement" -> List("repeat-stmt"),
    "statement" -> List("assign-stmt"),
    "statement" -> List("read-stmt"),
    "statement" -> List("write-stmt"),
    "if-stmt" -> List("if", "exp", "then", "stmt-sequence", "else-stmt-sequence", "end"),
    "else-stmt-sequence" -> List("else", "stmt-sequence"),
    "else-stmt-sequence" -> List(""),
    "repeat-stmt" -> List("repeat", "stmt-sequence", "until", "exp"),
    "assign-stmt" -> List("identifier", ":=", "exp"),
    "read-stmt" -> List("read", "identifier"),
    "write-stmt" -> List("write", "exp"),
    "exp" -> List("simple-exp", "comp-simp-exp"),
    "comp-simp-exp" -> List("comparision-op", "simple-exp"),
    "comp-simp-exp" -> List(""),
    "comparision-op" -> List("<"),
    "comparision-op" -> List("="),
    "simple-exp" -> List("term", "add-op-term"),
    "add-op-term" -> List("addop", "term", "add-op-term"),
    "add-op-term" -> List(""),
    "add-op" -> List("+"),
    "add-op" -> List("-"),
    "term" -> List("factor", "mul-factor"),
    "mul-factor" -> List("mulop", "factor", "mul-factor"),
    "mul-factor" -> List(""),
    "mulop" -> List("*"),
    "mulop" -> List("/"),
    "factor" -> List("(", "exp", ")"),
    "factor" -> List("number"),
    "factor" -> List("identifier"),
  ))
}