package org.earlycode.scalatutorial.basics


case class Worker(name: String, role: String)

object CaseClassCopyMethod extends App {
  val john = Worker("john", "sales")

  // Case class's copy() method lets us make a copy of an object.
  // Note that a "copy" is different than a clone, because with a
  // copy we can change fields as desired during the copying process.
  val joe = john.copy(name="joe")

  println(john + "\n" + joe)
}
