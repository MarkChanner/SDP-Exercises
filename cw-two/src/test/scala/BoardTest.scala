import org.scalatest.{FunSuite, Matchers}

class BoardTest extends FunSuite with Matchers {
  test("testResult") {
    val guess1 = Guess(Vector(Red(), Red()))
    val feedback1 = Feedback(Vector[ResultPeg]())
    val empty: Round = Round(guess1, feedback1)

    val guess2 = Guess(Vector(Red(), Red()))
    val feedback2 = Feedback(Vector(Black()))
    val directMatch: Round = Round(guess2, feedback2)

    val guess3 = Guess(Vector(Red(), Red()))
    val feedback3 = Feedback(Vector(White(), Black()))
    val directAndIndirectMatch: Round = Round(guess3, feedback3)

    val oneRound: Board = Board(Vector(empty))
    oneRound.toString should be("RR Result: No pegs\n")

    val threeRounds: Board = Board(Vector(empty, directMatch, directAndIndirectMatch))
    threeRounds.toString should be("RR Result: No pegs\nRR Result: Black\nRR Result: White Black\n")
  }
}


