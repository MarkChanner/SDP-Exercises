case class Mastermind(easy: Boolean) extends GameAbstractImpl {

  val MAXATTEMPTS = 12

  def runGames = {
    val board = Board(Vector[Round]())
    val remainingAttempts = MAXATTEMPTS - board.rounds.length

    Printer(Output.intro)
    Printer(Output.begin)

    val secretCode = SecretCodeGenerator()
    if (easy) Printer(Output.revealSecretCode(secretCode))
    if (board.rounds.nonEmpty) {}

    Printer(Output.remainingAttempts(remainingAttempts))
    Printer(Output.promptForGuess)
  }
}