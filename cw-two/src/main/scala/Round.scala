case class Round(guess: Guess, feedback: Feedback) {
  override def toString =
    if (feedback.pegs.contains(Black()) ||
      feedback.pegs.contains(White()))
      s"$guess Result: $feedback\n"
    else
      "No pegs\n"
}