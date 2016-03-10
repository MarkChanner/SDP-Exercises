package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests DivideInstruction.scala
  *
  * @author Mark Channer
  */
class DivideInstructionTest extends FunSuite with Matchers {

  test("Tests DivideInstruction initialization and execute method") {
    val machine = Machine(Labels(), Vector())
    machine.regs.update(1, 50)
    machine.regs.update(2, 5)
    val divide = DivideInstruction("L3", 3, 1, 2)
    divide.execute(machine)

    val resultOfExecute = machine.regs(3)
    resultOfExecute should equal(10)

    val resultOfToString = divide.toString()
    resultOfToString should equal("L3: divide 1 / 2 to 3\n")
  }
}