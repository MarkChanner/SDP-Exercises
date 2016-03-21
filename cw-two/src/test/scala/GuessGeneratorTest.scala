import org.scalatest.{FunSuite, Matchers}

class GuessGeneratorTest extends FunSuite with Matchers {
  test("tests GuessGenerator returns a Guess object with given String input as Vector of pegs") {
    val testGuess1 = Guess(Vector[GuessPeg](Red(), Yellow(), Yellow(), Yellow()))
    val guess1 = GuessGenerator(Valid("RYYY"))
    guess1 should be(testGuess1)

    val testGuess2 = Guess(Vector[GuessPeg](Yellow(), Red(), Yellow(), Yellow()))
    val guess2 = GuessGenerator(Valid("YRYY"))
    guess2 should be(testGuess2)

    val testGuess3 = Guess(Vector[GuessPeg](Yellow(), Yellow(), Red(), Yellow()))
    val guess3 = GuessGenerator(Valid("YYRY"))
    guess3 should be(testGuess3)

    val testGuess4 = Guess(Vector[GuessPeg](Yellow(), Yellow(), Yellow(), Red()))
    val guess4 = GuessGenerator(Valid("YYYR"))
    guess4 should be(testGuess4)
  }
}