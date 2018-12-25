package org.earlycode.scalatutorial.basics

class MyClass {
  private var myFlag: Boolean = false

  def setFlag(flagVal: Boolean): Unit = {
    myFlag = flagVal  // No issue in accessing the private member
  }

  def showMyVal(): Unit = {
    println(myFlag)  // No issue in accessing the private member
  }

  def showMyVal(other: MyClass) = {
    println(this.myFlag)
    println(other.myFlag)  // We can also access via other instance of current class
  }
}

class MySubClass extends MyClass {
  def myMethod(): Unit = {
    // Note that private members are not available to sub-classes.
    // Hence, the below statement won't compile as it is trying to
    // access the private member, myFlag of the base class.

    // println(myFlag)
  }
}

object AccessingPrivateMembers extends App {
  var myClassObjOne = new MyClass()
  myClassObjOne.setFlag(true)
  myClassObjOne.showMyVal()

  var myClassObjTwo = new MyClass()
  myClassObjTwo.setFlag(true)

  myClassObjOne.showMyVal(myClassObjTwo)
}
