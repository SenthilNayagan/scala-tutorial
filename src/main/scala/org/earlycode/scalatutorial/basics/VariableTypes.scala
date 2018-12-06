package org.earlycode.scalatutorial.basics

object VariableTypes {
  // Val - Referencing/reassigning a value does not re-compute it.
  val valX = 1 + 1
  println(valX) // 2

  // Below expression doesn't compile.
  // Will get "Reassignment to val" compile error.
  // x = 2


  // Var - Able to reassign a value.
  var varX = 1 + 1
  varX = 2 // This reassign is possible.
}
