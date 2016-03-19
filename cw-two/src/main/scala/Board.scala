final case class Board(secretCode: SecretCode, rounds: Vector[Round]) {

  def addRound(round: Round): Unit = {
    // or return new Board with latest round added
  }
}
