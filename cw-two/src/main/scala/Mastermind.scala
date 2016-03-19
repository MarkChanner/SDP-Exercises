case class Mastermind(easy: Boolean) extends GameAbstractImpl {

  val maxAttempts = 12

  def runGames = {
    val board = Board(Vector[Round]())
    val remainingAttempts = maxAttempts - board.rounds.length
    val secretCode = SecretCodeGenerator()

    Printer(Output.intro)
    Printer(Output.begin)

    if (easy) Printer(Output.revealSecretCode(secretCode))
    if (board.rounds.nonEmpty) {}

    Printer(Output.remainingAttempts(remainingAttempts))
    Printer(Output.promptForGuess)

    val input: String = Reader.getInput
    //val guess: Guess = PegContainerProducer(input)
  }
}