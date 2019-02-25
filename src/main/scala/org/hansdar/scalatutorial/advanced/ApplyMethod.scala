package org.hansdar.scalatutorial.advanced

trait Animal {
  def speak
}

object Animal {
  private class Dog extends Animal {
    override def speak = println("woof")
  }

  private class Cat extends Animal {
    override def speak = println("meow")
  }

  // Factory method
  def apply(what: String): Animal = {
    if (what == "dog") new Dog
    else new Cat
  }

  def main(args: Array[String]): Unit = {
    val cat = Animal("cat") // returns a Cat
    val dog = Animal("dog") // returns a Dog

    println(dog.speak)
    println(cat.speak)
  }
}
