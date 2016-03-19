case class Board(rounds: Vector[Round]) {
  override def toString() = {
    val output = StringBuilder.newBuilder
    rounds.map(r => output.append(r))
    output.toString
  }

}

object Main extends App {
  val guess = Guess(Vector(Red(), Red()))
  val feedback = Feedback(Vector(Black()))
  val round = Round(guess, feedback)
  val round2 = Round(guess, feedback)
  val b = Board(Vector(round, round2))
  print(b)
}
