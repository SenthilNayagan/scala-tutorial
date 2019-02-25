package org.hansdar.scalatutorial.basics

class Fruit {
    private[basics] def doChop {}
    private def doEat {}
  }

  class PackageScope {
    val fruitObj = new Fruit

    // Access by other classes in the same package
    // i.e. basics package.
    fruitObj.doChop

    // Below statement won't compile as doEat method is available
    // only to the Fruit class
    //fruitObj.doEat
  }
