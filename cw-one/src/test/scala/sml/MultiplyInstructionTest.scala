package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests MultiplyInstruction.scala
  *
  * @author Mark Channer
  */
class MultiplyInstructionTest extends FunSuite with Matchers {

  test("Tests MultiplyInstruction initialization and execute method") {
    val machine = Machine(Labels(), Vector())
    machine.regs.update(1, 8)
    machine.regs.update(2, 2)
    val multiply = MultiplyInstruction("L3", 3, 1, 2)
    multiply.execute(machine)

    val resultOfExecute = machine.regs(3)
    resultOfExecute should equal(16)

    val resultOfToString = multiply.toString()
    resultOfToString should equal("L3: multiply 1 * 2 to 3\n")
  }
}