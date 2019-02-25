package org.hansdar.scalatutorial.advanced

class Amazing {
  def apply(x: String) = "Amazing %s!".format(x)
}

object Launcher extends App {
  val amazing = new Amazing()
  println(amazing("world"))
}
