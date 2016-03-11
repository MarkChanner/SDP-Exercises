package sml

/**
  * OutInstruction extends Instruction
  *
  * @author Mark Channer
  */
case class OutInstruction(label: String, op: String, register: Int) extends Instruction(label, op) {

  override def execute(m: Machine) {
    println("Register " + register + " value is " + m.regs(register) + "\n")
  }

  override def toString(): String = super.toString + " register " + register
}

object OutInstruction {
  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)
}
