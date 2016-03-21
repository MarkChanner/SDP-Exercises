case class Mastermind(easy: Boolean) extends GameAbstractImpl {
  val guessLength = 4
  val maxAttempts = 12

  def runGames = {
    var input: String = ""
    var validInput: Input = Invalid("")
    var looping = true
    var counter = 12
    var board = Board(Vector[Round]())
    var latestRound: Round = Round(Guess(Vector[GuessPeg]()), Feedback(Vector[ResultPeg]()))
    val secretCode = SecretCode(Vector[GuessPeg](Blue(), Green(), Blue(), Green())) //SecretCodeGenerator()

    Printer(Output.intro)
    Printer(Output.begin)
    if (easy) Printer(Output.revealSecretCode(secretCode))

    do {
      //if (board.rounds.nonEmpty) {
      if (counter != 12) { // temporary way of looping through game
        do {
          Printer(Output.promptForGuess)
          input = Reader.getInput
          validInput = Validator(input)
        } while (!validInput.isValid)

        println()
        if (easy) Printer(Output.revealSecretCode(secretCode))

        val guess: Guess = GuessGenerator(validInput)
        val feedback: Feedback = FeedbackProducer(guess, secretCode)
        latestRound = Round(guess, feedback)
        board = Board(Vector[Round](latestRound))

        Round.analyse(latestRound.feedback, guessLength) match {
          case Solved =>
            Printer(Output.secretCodeUnmasked(secretCode))
            Printer(Output.roundFeedback(board))
            Printer(Solved.toString)
            Printer(Output.anotherGame)
            //continuePlaying = Reader.getInput // ask if want another game
            looping = false // temporarily ending loop automatically when Solved
          case Unsolved =>
            Printer(Output.secretCodeMasked)
            Printer(Output.roundFeedback(board))
            Printer(Output.fillerRows(maxAttempts - board.rounds.length))
            if (board.rounds.length == maxAttempts) {
              Printer(Unsolved.toString)
              Printer(Output.anotherGame)
              //continuePlaying = Reader.getInput // ask if want another game
              looping = false // temporarily ending loop automatically when used all rounds
            }
        }
      }
      counter -= 1 // temporary
      Printer(Output.remainingAttempts(maxAttempts - board.rounds.length))
    } while (looping)
  }
}