package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests LinInstruction.scala
  *
  * @author Mark Channer
  */
class LinInstructionTest extends FunSuite with Matchers {

  val machine = Machine(Labels(), Vector())

  test("Tests LinInstruction initialization and execute method") {
    val lin1 = LinInstruction("L1", 30, 55)
    lin1.execute(machine)
    lin1.toString should equal("L1: lin register 30 value is 55\n")

    val lin2 = LinInstruction("L2", 31, 56)
    lin2.execute(machine)
    lin2.toString should equal("L2: lin register 31 value is 56\n")
  }


  test("Tests that appropriate exception thrown") {
    an[java.lang.IndexOutOfBoundsException] should be thrownBy {
      val lin3 = LinInstruction("L3", 32, 57)
      lin3.execute(machine)
    }
  }
}