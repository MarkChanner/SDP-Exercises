package sml

import org.scalatest.{Matchers, FunSuite}

/**
  * Tests OutInstruction.scala
  *
  * @author Mark Channer
  */
class OutInstructionTest extends FunSuite with Matchers {

  test("Tests OutInstruction initialization and execute method") {
    val machine = Machine(Labels(), Vector())
    machine.regs.update(1, 50)
    val out = OutInstruction("L2", 1)
    out.execute(machine)
    out.toString should equal ("L2: out register 1")
  }
}
