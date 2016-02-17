package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests LinInstruction.scala
  *
  * The test has highlighted a problem that there is no check
  * for if the register value entered is 31 or less
  *
  * @author Mark Channer
  */
class LinInstructionTest extends FunSuite with Matchers {

  /*test("LinInstruction should not allow a register value above 31") {
    val lin1 = LinInstruction("L1", 32, 66)
    lin1.toString should not equal "L1: lin register 33 value is 66\n"
  }*/


  test("toString method should return correct label, operation, register, and value in register") {
    val lin1 = LinInstruction("L1", 1, 66)
    lin1.toString should equal("L1: lin register 1 value is 66\n")
  }

}
