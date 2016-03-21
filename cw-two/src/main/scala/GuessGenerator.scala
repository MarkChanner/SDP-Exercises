object GuessGenerator {

  val guessLength = 4

  def apply(input: Input): Guess = {
    run(input.text, Vector[GuessPeg]())
  }

  def run(input: String, pegs: Vector[GuessPeg]): Guess = {
    if (pegs.size == guessLength) Guess(pegs)
    else {
      var p = pegs
      input.substring(0, 1) match {
        case "B" =>
          p = p :+ Blue()
        case "G" =>
          p = p :+ Green()
        case "O" =>
          p = p :+ Orange()
        case "P" =>
          p = p :+ Purple()
        case "R" =>
          p = p :+ Red()
        case "Y" =>
          p = p :+ Yellow()
      }
      run(input.substring(1), p)
    }
  }
}