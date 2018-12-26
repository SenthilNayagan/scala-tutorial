package org.earlycode.scalatutorial.basics

class MyClass {
  private var myFlagOne: Boolean = false
  protected var myFlagTwo: Boolean = false

  def setFlags(flagVal: Boolean): Unit = {
    // No issue in accessing the private and protected members
    // from inside the same class
    myFlagOne = flagVal
    myFlagTwo = flagVal
  }

  def showFlags(): Unit = {
    println("myFlagOne: " + myFlagOne)
    println("myFlagTwo: " + myFlagTwo)
  }

  def showFlags(other: MyClass) = {
    println("Via current object: " + this.myFlagOne)
    println("Via current object: " + this.myFlagTwo)

    // We can also access via other instance of current class
    println("Via other object: " + other.myFlagOne)
    println("Via other object: " + other.myFlagTwo)
  }
}

class MySubClass extends MyClass {
  def myMethod(): Unit = {
    // Note that private members are not available to sub-classes.
    // Hence, the below statement won't compile as it is trying to
    // access the private member, myFlag of the base class.
    //println(myFlagOne)

    // Unlike private, we can access protected member from subclass.
    println(myFlagTwo)
  }
}

object AccessingClassMembers extends App {
  var myClassObjOne = new MyClass()
  myClassObjOne.setFlags(true)
  myClassObjOne.showFlags()

  var myClassObjTwo = new MyClass()
  myClassObjOne.showFlags(myClassObjTwo)
}
