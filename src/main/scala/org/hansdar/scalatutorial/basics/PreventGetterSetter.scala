package org.hansdar.scalatutorial.basics

/**
  * We can add the private keyword to a val or var field to
  * prevent getter and setter methods from being generated.
  */
class PreventGetterSetter (private var myField: String) {
  // myField could only be accessed from within
  // members of the class like below
  def assesMyField = println(myField)
}
