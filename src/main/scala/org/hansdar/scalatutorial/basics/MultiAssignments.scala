package org.hansdar.scalatutorial.basics

object MultiAssignments {
  val (myVar1: Int, myVar2: String) = Pair(40, "Foo")

  // We can use type inference as below:
  // val (myVar1, myVar2) = Pair(40, "Foo")
}
