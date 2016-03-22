case class Board(val rounds: Vector[Round]) {
  override def toString = {
    val output = StringBuilder.newBuilder
    rounds.map(r => output.append(r))
    output.toString
  }
}

object Board {
  def apply: Board = {
    Board(Vector[Round]())
  }

  def apply(b: Board, latestRound: Round): Board = {
    Board(b.rounds :+ latestRound)
  }
}