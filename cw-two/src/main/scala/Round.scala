case class Round(guess: Guess, feedback: Feedback) {
  override def toString =
    if (feedback.pegs.contains(Black()) ||
      feedback.pegs.contains(White()))
      s"$guess Result: $feedback\n"
    else
      s"$guess Result: No pegs\n"
}

object Round {
  def analyse(feedback: Feedback, guessLength: Int): Outcome = {
    if (feedback.pegs.count(peg => peg == Black()) == guessLength) Solved else Unsolved
  }
}