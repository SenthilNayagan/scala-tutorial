package org.earlycode.scalatutorial.advanced

object ClosureDemo extends App {
  val factor = 3  // free variable
  val multipler = (i: Int) => i * factor

  println(multipler(30))
}
