package org.earlycode.scalatutorial.fp


object PatternMatchingDemo {
  def main(args: Array[String]): Unit = {
    println(numToString(3))
    println(numToString(10)) // Matches the default case
  }


  /**
    * The last case _ is a “catch all” case which matches anything
    * not defined in the above cases.
    *
    * Note that if we try to put a case _ before any other case
    * clauses, the compiler will throw an "unreachable code" error
    * on the next clause. Nothing will get passed the case _ clause
    * and hence, case _ serves as default.
    */
  def numToString(num: Int): String = num match {
    case 2 => "two"
    case 1 => "one"
    case 3 => "three"

    // Default case clause
    case _ => "other"
  }
}
