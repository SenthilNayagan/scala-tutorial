package org.earlycode.scalatutorial.advanced

case class Fruit(name: String, priceInDollar: Int)

class ApplyOnClass {
  def apply(name: String, price: Int): Fruit = Fruit(name, price)
}

object ApplyOnClass extends App {
  // ApplyOnClass has to be instantiated first using the new operator.
  val obj = new ApplyOnClass()
  println(obj("Apple", 2))
}
