package org.earlycode.scalatutorial.basics

class MyBaseClass {
  private var myFlagOne: Boolean = false
  protected var myFlagTwo: Boolean = false
  var myFlagThree: Boolean = false  // Public member

  def setFlags(flagVal: Boolean): Unit = {
    // No issue in accessing the private and protected members
    // from inside the same class
    myFlagOne = flagVal
    myFlagTwo = flagVal

    // Public member can be accessed from anywhere.
    myFlagThree = flagVal
  }

  def showFlags(): Unit = {
    println("myFlagOne: " + myFlagOne)
    println("myFlagTwo: " + myFlagTwo)
    println("myFlagThree: " + myFlagThree)
  }

  def showFlags(other: MyBaseClass) = {
    println("Via current object: " + this.myFlagOne)
    println("Via current object: " + this.myFlagTwo)
    println("Via current object: " + this.myFlagThree)

    // We can also access via other instance of current class
    println("Via other object: " + other.myFlagOne)
    println("Via other object: " + other.myFlagTwo)
    println("Via other object: " + other.myFlagThree)
  }
}

class MySubClass extends MyBaseClass {
  def showDetails(): Unit = {
    // Note that private members are not available to sub-classes.
    // Hence, the below statement won't compile as it is trying to
    // access the private member, myFlag of the base class.
    //println(myFlagOne)

    // Unlike private, we can access protected member from subclass.
    println(myFlagTwo)

    // Accessing public member
    println(myFlagThree)
  }
}

class SubOfSubClass extends MySubClass {
  println(myFlagTwo)
  println(myFlagThree)
}

object AccessingClassMembers extends App {
  var myClassObjOne = new MyBaseClass()
  myClassObjOne.setFlags(true)
  myClassObjOne.showFlags()

  // Private member can only be accessed from within the class and
  // hence below statement is commented.
  //myClassObjOne.myFlagOne

  // Protected member can only be accessed from within the class or within the subclasses and
  // hence below statement is commented.
  //myClassObjOne.myFlagTwo

  // Public member can be accessed from anywhere
  myClassObjOne.myFlagThree = true

  var myClassObjTwo = new MyBaseClass()
  myClassObjOne.showFlags(myClassObjTwo)
}
