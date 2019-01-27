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
  val stackObj = new Stack[Int]
  stackObj.push(10)
  stackObj.push(20)

  println(stackObj.peek)

  println(stackObj.pop())
  println(stackObj.pop())
}