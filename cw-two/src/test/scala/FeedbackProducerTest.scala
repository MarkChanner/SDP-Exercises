import org.scalatest.{FunSuite, Matchers}

/*
  Note that shuffle has to be disable in the FeedbackProducer for these tests to pass
 */

class FeedbackProducerTest extends FunSuite with Matchers {

  val secretCode: SecretCode = SecretCode(Vector[GuessPeg](Blue(), Green(), Blue(), Green()))

  test("All black pegs") {
    val guess = Guess(Vector[GuessPeg](Blue(), Green(), Blue(), Green()))
    FeedbackProducer(guess, secretCode).toString should be("Black Black Black Black")
  }

  test("All white pegs") {
    val guess = Guess(Vector[GuessPeg](Green(), Blue(), Green(), Blue()))
    FeedbackProducer(guess, secretCode).toString should be("White White White White")
  }

  test("No pegs") {
    val guess = Guess(Vector[GuessPeg](Red(), Red(), Red(), Red()))
    FeedbackProducer(guess, secretCode).toString should be("")
  }

  test("One white peg") {
    val guess = Guess(Vector[GuessPeg](Green(), Red(), Red(), Red()))
    val feedback: Feedback = FeedbackProducer(guess, secretCode)
    feedback.toString should be("White")
  }

  test("One white peg with end pegs matching") {
    val guess = Guess(Vector[GuessPeg](Red(), Red(), Red(), Blue()))
    val feedback: Feedback = FeedbackProducer(guess, secretCode)
    feedback.toString should be("White")
  }

  test("One black peg") {
    val guess1 = Guess(Vector[GuessPeg](Blue(), Red(), Red(), Red()))
    FeedbackProducer(guess1, secretCode).toString should be("Black")
  }

  test("Black Black White White") {
    val guess1 = Guess(Vector[GuessPeg](Green(), Blue(), Blue(), Green()))
    FeedbackProducer(guess1, secretCode).toString should be("Black Black White White")
  }
}
