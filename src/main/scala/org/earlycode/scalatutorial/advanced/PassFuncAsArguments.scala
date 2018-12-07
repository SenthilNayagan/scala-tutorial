package org.earlycode.scalatutorial.advanced

object PassFuncAsArguments {
  /**
    * This feature is called Higher-order Function where both
    * methods and functions can take functions as parameters or
    * returns a function as its result.
    */
  def delayed(callBack: => Long): Unit = {
    println("In delayed() method.")
    println("Time: " + callBack)
  }

  def time(): Long = {
    System.nanoTime
  }


  // Calls delayed function with a callback function.
  def main(args: Array[String]): Unit = {
    delayed(time)
  }
}
