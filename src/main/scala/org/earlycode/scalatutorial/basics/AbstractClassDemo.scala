package org.earlycode.scalatutorial.basics


abstract class Pet(name: String) {
  // Concrete field and we must provide an initial value.
  var age: Int = 2

  // Abstract field which has to be implemented by its subclass. Otherwise, the
  // the extending class must be declared "abstract".
  val breed: String

  // Abstract method - no body makes this method abstract.
  def printName: Unit

  // Abstract method which has to be implemented by its subclass.
  //def printAll: String

  // Concrete method
  def printAge: Unit = {
    println(age)
  }

  def color: String
}

class Dog(name: String) extends Pet(name) {
  // Implementation of abstract filed defined in the above abstract bass class.
  val breed = "Boxer"

  // Implementation of abstract method
  def printName: Unit = println("Hi there, I am " + name)

  // Overrides the concrete method of base abstract class to add more details to it
  override def printAge: Unit = {
    println(name + "'s age is " + age)
  }

  val color = "Brown"

  //val printAll = "Name: " + name + "; " + "Age: " + age + "; " + "Breed: " + breed + "; " + "Color: " + color
}

object AbstractClassDemo extends App {
  val dogObj = new Dog("Jimmy")
  dogObj.printName
  dogObj.printAge
  dogObj.age = 5
  dogObj.printAge
  //println(dogObj.printAll)
  println(dogObj.color)
}
