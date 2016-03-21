import org.scalatest.{FunSuite, Matchers}

class OutcomeTest extends FunSuite with Matchers {

  test("tests toString method in Outcome returns a Solved or Unsolved object") {
    val outcomeSolved: Outcome = Solved
    outcomeSolved.toString should equal("\nYou solved the puzzle! Good job.\n")

    val outcomeUnsolved: Outcome = Unsolved
    outcomeUnsolved.toString should equal("\nYou did not solve the puzzle. Too bad.\n")
  }
}