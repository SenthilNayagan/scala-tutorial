package org.hansdar.scalatutorial.basics

object VariableTypes {
  // "var" type variable are mutable and "val" type is immutable

  // Val
  // Referencing/reassigning a value does not re-compute it.
  val valX = 1 + 1
  println(valX) // 2

  // Below expression doesn't compile.
  // Will get "Reassignment to val" compile error.
  // x = 2


  // Var
  // Able to reassign a value.
  var varX = 1 + 1
  varX = 2 // This reassign is possible.
  // varX = 2.5 - Compile error as we can't reassign to different type


  // Lazy Val
  // Evaluates once, the first time the variable is accessed.
  // Only vals can be lazy variables.
  //
  // On the first access of lazyValX from somewhere else, the
  // stored expression 1 + 1 is evaluated and the result (2 in this case)
  // is returned. On subsequent access of lazyValX, no evaluation happens and
  // the stored result of the evaluation was cached and will be returned instead.
  lazy val lazyValX = 1 + 1
}
