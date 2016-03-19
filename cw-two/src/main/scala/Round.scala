case class Round(guess: Guess, feedback: Feedback) {
  override def toString = {
    s"$guess Result: $feedback\n"
  }

  def analyse: Outcome = feedback.pegs match {
    case Vector(Black(), Black(), Black(), Black()) => Solved()
    case _ => Unsolved()
  }
}