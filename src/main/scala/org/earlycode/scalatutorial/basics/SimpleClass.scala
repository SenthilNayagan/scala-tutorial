package org.earlycode.scalatutorial.basics

/**
  * Classes in Scala are declared using a syntax which is close to
  * Java's syntax with one important difference is that classes in
  * Scala can have parameters.
  *
  * All classes in Scala inherit from a super-class. When no super-class
  * is specified, scala.AnyRef is implicitly used.
  *
  * This SimpleClass class takes two arguments: name and age.
  * These arguments must be passed when creating an instance of
  * class SimpleClass as follows: new SimpleClass("John", 30).
  */
class SimpleClass (name: String, age: Int) {
  def showName() = name
  def showAge() = age

  // We don't need to put an empty pair of parenthesis after method name.
  // Removing empty pair of parenthesis is perfectly doable in Scala
  // as follows:
  // def showName = name
  // def showAge = age
}
