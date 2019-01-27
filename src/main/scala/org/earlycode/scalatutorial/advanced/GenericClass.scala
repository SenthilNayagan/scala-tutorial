package org.earlycode.scalatutorial.advanced

// This generic class takes any type A as a parameter.
class Stack[A] {
  private var elements: List[A] = Nil

  // Stack push inserts a new item at the top of the stack i.e. elements.
  def push(item: A): Unit = {
    elements = item :: elements
  }

  // Get the first item of the stack.
  def peek: A = elements.head

  // Stack pop removes an item from the top of the stack.
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}


object GenericClass extends App {
  val stackObj1 = new Stack[Int]
  stackObj1.push(10)
  stackObj1.push(20)
  //stackObj1.push("20") Type mismatch compile error

  println(stackObj1.peek)

  println(stackObj1.pop())
  println(stackObj1.pop())

  val stackObj2 = new Stack[String]
  stackObj2.push("one")
  stackObj2.push("two")

  println(stackObj2.peek)

  println(stackObj2.pop())
}