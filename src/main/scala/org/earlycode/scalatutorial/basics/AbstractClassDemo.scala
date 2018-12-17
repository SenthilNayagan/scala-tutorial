package org.earlycode.scalatutorial.basics


abstract class Pet(name: String) {
  var age: Int = 0              // concrete field

  def printName: Unit           // abstract method (no body makes this method abstract)

  def printAge: Unit = {        // concrete method
    println(age)
  }
}

class Dog(name: String) extends Pet(name) {
  // Implementation of abstract method
  def printName: Unit = println("Hi there, I am " + name)
}

object AbstractClassDemo extends App {
  val dogObj = new Dog("Jimmy")
  dogObj.printName
  dogObj.age = 2
  dogObj.printAge
}
