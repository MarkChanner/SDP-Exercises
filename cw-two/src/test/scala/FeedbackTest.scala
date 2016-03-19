import org.scalatest.{FunSuite, Matchers}

class FeedbackTest extends FunSuite with Matchers {
  test("testFeedback") {
    val feedback1: Feedback = Feedback(Vector[ResultPeg]())
    feedback1.toString should be("")

    val feedback2: Feedback = Feedback(Vector(White()))
    feedback2.toString should be("White")

    val feedback3: Feedback = Feedback(Vector(Black(), White()))
    feedback3.toString should be("Black White")
  }
}


