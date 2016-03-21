sealed trait PegContainer {

  def pegs: Vector[Peg]

  override def toString =
    this match {
      case Feedback(pegs: Vector[ResultPeg]) => pegs.mkString(" ")
      case Guess(pegs: Vector[GuessPeg]) => pegs.mkString("")
      case SecretCode(pegs: Vector[GuessPeg]) => pegs.mkString("")
    }
}

final case class Feedback(pegs: Vector[ResultPeg]) extends PegContainer

final case class Guess(pegs: Vector[GuessPeg]) extends PegContainer

final case class SecretCode(pegs: Vector[GuessPeg]) extends PegContainer