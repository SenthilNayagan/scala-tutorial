package org.earlycode.scalatutorial.basics

object TypeInferenceExamples extends App {
  // Scala compiler figures out the type of the variable based
  // on the value assigned to it.
  // Thus, myVal will of String type, myVar will be Int type and
  // myBoolean will of boolean type.
  val myVal = 10
  var myVar = "SpaceX"
  var myBoolean = true

  // We can also explicitly state the type, like this:
  val x: Int = 1 + 1
}
