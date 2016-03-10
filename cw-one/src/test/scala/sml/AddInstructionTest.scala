package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests AddInstruction.scala
  *
  * @author Mark Channer
  */
class AddInstructionTest extends FunSuite with Matchers {

  test("Tests AddInstruction initialization and execute method") {
    val machine = Machine(Labels(), Vector())
    machine.regs.update(1, 2)
    machine.regs.update(2, 2)
    val add = AddInstruction("L3", 3, 1, 2)
    add.execute(machine)

    val resultOfExecute = machine.regs(3)
    resultOfExecute should equal (4)

    val resultOfToString = add.toString()
    resultOfToString should equal("L3: add 1 + 2 to 3\n")
  }
}