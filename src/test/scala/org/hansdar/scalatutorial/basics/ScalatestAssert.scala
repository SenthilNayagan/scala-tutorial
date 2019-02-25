package org.hansdar.scalatutorial.basics

import org.scalatest.Assertions._


object ScalatestAssert extends App {
  val left = 1
  val right = 2
  assert(left == right)

  // To clearly distinguish between actual and expected, use assertResult
  // instead of assert.
  assertResult(true) {
    left == right
  }
}
