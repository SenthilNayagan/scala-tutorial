package org.earlycode.scalatutorial.basics

class Employee(var name: String, var age: Int)

case class Student(var name: String, var age: Int)

// Shows how to override the factory's equals method.
object OverridingEquals extends App {
  val empObj1 = new Employee("John", 30)
  val empObj2 = new Employee("John", 30)

  val stuObj1 = new Student("Sam", 16)
  val stuObj2 = new Student("Sam", 16)


  // In general, an unique hashcode is generated every time when
  // a new instance is created.
  println("Hashcode for regular class")
  println(empObj1.hashCode())
  println(empObj2.hashCode())

  // For case class, returns the same hashcode if the
  // contents of both instances (belongs to the same class) are same.
  println("\n\nHashcode for case class")
  println(stuObj1.hashCode())
  println(stuObj2.hashCode())

  println("\n\nEquals check for regular class")
  println(empObj1.equals(empObj1))
  println(empObj1.equals(empObj2))
  println(empObj1 == new Employee("John", 30))

  println("\n\nEquals check for case class")
  println(stuObj1.equals(stuObj2))
  println(stuObj1 == new Student("Sam", 16))
}
