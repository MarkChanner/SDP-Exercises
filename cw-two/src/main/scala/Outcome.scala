sealed trait Outcome {

  override def toString =
    this match {
      case Solved => "\nYou solved the puzzle! Good job.\n"
      case Unsolved => "\nYou did not solve the puzzle. Too bad.\n"
    }
}

case object Solved extends Outcome

case object Unsolved extends Outcome