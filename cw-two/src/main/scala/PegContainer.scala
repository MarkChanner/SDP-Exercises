trait PegContainer {
  def pegs: Vector[Peg]

  override def toString = pegs.mkString("")
}

case class SecretCode(pegs: Vector[Peg]) extends PegContainer

case class Guess(pegs: Vector[Peg]) extends PegContainer

