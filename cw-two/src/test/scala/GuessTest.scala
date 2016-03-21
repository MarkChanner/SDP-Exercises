import org.scalatest.{FunSuite, Matchers}

class GuessTest extends FunSuite with Matchers {
  test("tests Guess") {
    val guessPegs: Vector[GuessPeg] = Vector[GuessPeg](Orange(), Orange(), Blue(), Blue())
    val emptyGuess: Vector[GuessPeg] = Vector[GuessPeg]()

    val empty: Guess = Guess(emptyGuess)
    empty.toString should be("")

    val guess: Guess = Guess(guessPegs)
    guess.toString should be("OOBB")
  }
}