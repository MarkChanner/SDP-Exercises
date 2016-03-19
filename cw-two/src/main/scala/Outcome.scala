sealed trait Outcome

case object Solved extends Outcome {
  override def toString = "You solved the puzzle! Good job."
}

case object Unsolved extends Outcome {
  override def toString = "You did not solve the puzzle. Too bad."
}