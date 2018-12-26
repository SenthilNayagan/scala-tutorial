package org.earlycode.scalatutorial.basics


class Cat {
  var breed: String = "Persian"
  private[this] var sex: String = "Male"

  def showDetails(other: Cat): Unit = {
    println(other.breed)

    // Below statement won't compile as we are accessing
    // via other instance of the same class.
    //println(other.sex)
  }
}

object ObjectPrivateScope extends App {
  val catObjOne = new Cat
  val catObjTwo = new Cat
  catObjOne.showDetails(catObjTwo)
}
