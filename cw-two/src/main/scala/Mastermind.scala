case class Mastermind(easy: Boolean) extends GameAbstractImpl {
  val guessLength = 4
  val maxAttempts = 12

  def runGames = {
    Printer(Output.intro)

    // play again loop
    do {
      val secretCode = SecretCodeGenerator()
      var board = Board(Vector[Round]())
      var input: Input = Invalid("")
      var solved = false

      Printer(Output.begin)
      if (easy) Printer(Output.revealSecretCode(secretCode))
      Printer(Output.remainingAttempts(maxAttempts))

      // round loop
      do {

        do {
          Printer(Output.promptForGuess)
          input = Validator(Reader.getInput)
        } while (!input.isValid)

        if (easy) Printer(Output.revealSecretCode(secretCode))

        val guess: Guess = GuessGenerator(input)
        val feedback: Feedback = FeedbackProducer(guess, secretCode)
        val latestRound: Round = Round(guess, feedback)
        board = Board(board, latestRound)

        Round.analyse(latestRound.feedback, guessLength) match {
          case Solved =>
            solved = true
            Printer(Output.secretCodeUnmasked(secretCode))
            Printer(Output.roundFeedback(board))
            Printer(Output.gameEnd(Solved))
          case Unsolved =>
            Printer(Output.secretCodeMasked)
            Printer(Output.roundFeedback(board))
            if (board.rounds.length == maxAttempts) Printer(Output.gameEnd(Unsolved))
            else {
              Printer(Output.remainingRows(maxAttempts - board.rounds.length))
              Printer(Output.remainingAttempts(maxAttempts - board.rounds.length))
            }
        }
      } while (!solved && board.rounds.length < maxAttempts)

    } while (wantsAnotherGame)

    def wantsAnotherGame: Boolean = {
      Printer(Output.anotherGame)
      if (Reader.getInput == "Y") true
      else false
    }
  }
}