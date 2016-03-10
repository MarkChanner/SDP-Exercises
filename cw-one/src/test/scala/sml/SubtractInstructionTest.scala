package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests SubtractInstruction.scala
  *
  * @author Mark Channer
  */
class SubtractInstructionTest extends FunSuite with Matchers {

  test("Tests SubtractInstruction initialization and execute method") {
    val machine = Machine(Labels(), Vector())
    machine.regs.update(1, 10)
    machine.regs.update(2, 10)
    val add = SubtractInstruction("L3", 3, 1, 2)
    add.execute(machine)

    val resultOfExecute = machine.regs(3)
    resultOfExecute should equal(0)

    val resultOfToString = add.toString()
    resultOfToString should equal("L3: sub 1 - 2 to 3\n")
  }
}