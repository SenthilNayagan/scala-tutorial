package org.hansdar.scalatutorial.basics

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

  // Best Practices
  // When to have type inference?
  // Better not annotate the type of a private field or a local variable
  // as their type will usually be immediately evident in their value.
  //
  // When to avoid type inference?
  // 1. Better to display the type where the assigned value has a
  // complex or non-obvious form.
  //
  // 2. All public methods should have explicit type annotations.
  // Without an explicit type, a change to the internals of a method or val
  // could alter the public API of the class without warning, potentially
  // breaking client code.
}
