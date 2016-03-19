case class Mastermind(easy: Boolean) extends GameAbstractImpl {
  def runGames = {
    val board = Board(Vector[Round]())
    Printer(Output.intro)
    Printer(Output.begin)
    val secretCode = SecretCodeGenerator()
  }
}