package sml

/**
  * BnzInstruction extends Instruction
  *
  * @author Mark Channer
  */
case class BnzInstruction(label: String, op: String, register: Int, branchLabel: String)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    if (m.regs(register) != 0) {
      val branch = branchLabel.substring(branchLabel.length - 1).toInt
      println("branch is " + branch)
      m.execute(branch)
    } else {

    }
  }

  override def toString(): String = super.toString + " " + "\n"

}

object BnzInstruction {
  def apply(label: String, register: Int, branchLabel: String) =
    new BnzInstruction(label, "bnz", register, branchLabel)
}