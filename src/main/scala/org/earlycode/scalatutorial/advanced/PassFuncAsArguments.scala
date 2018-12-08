package org.earlycode.scalatutorial.advanced


/**
  * This feature is called Higher-order Function where both
  * methods and functions can take functions as parameters or
  * returns a function as its result.
  */
object PassFuncAsArguments {
  /**
    * Here, this delayed method accepts another method as argument.
    */
  def delayed(callBack: () => Long): Unit = {
    println("In delayed() method.")
    println("Time: " + callBack())
  }

  // This method returns nano time as long integer type.
  def time(): Long = {
    System.nanoTime
  }


  // Calls delayed function with passing an another
  // method as argument. The method being passed doesn't take
  // any argument, but returns a long integer.
  def main(args: Array[String]): Unit = {
    delayed(time)
  }
}
