package org.earlycode.scalatutorial.basics


object MainMethod {
  /**
    * This main method takes the command line arguments, an array
    * of strings as parameter.
    *
    * Also, the main method does not return a value and therefore,
    * it is not necessary to declare a return type.
    *
    * Unlike Java, the main method is not declared as static here.
    * This is because static members (methods or fields) do not exist in
    * Scala. Rather than defining static members, the Scala programmer
    * declares these members in singleton objects.
    */
  def main(args: Array[String]): Unit = {
    println("This is main method")
  }
}
