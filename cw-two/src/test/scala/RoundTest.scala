import org.scalatest.{FunSuite, Matchers}

class RoundTest extends FunSuite with Matchers {
  test("testResult") {
    val guess1 = Guess(Vector(Red(), Red()))
    val feedback1 = Feedback(Vector[ResultPeg]())
    val empty: Round = Round(guess1, feedback1)
    empty.toString should be("No pegs\n")

    //val guess2 = Guess(Vector(Red(), Red()))
    //val feedback2 = Feedback(Vector(Black()))
    //val directMatch: Round = Round(guess2, feedback2)
    //directMatch.toString should be("RR Result: Black\n")

    //val round3: Round = Round()
    //round3.toString should be("Black White")
  }
}


