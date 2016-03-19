final case class Feedback(pegs: Vector[ResultPeg]) {
  override def toString = pegs.mkString(" ")
}
