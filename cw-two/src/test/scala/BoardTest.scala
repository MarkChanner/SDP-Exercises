import org.scalatest.{FunSuite, Matchers}

class BoardTest extends FunSuite with Matchers {

  test("testResult") {
    var board = Board(Vector[Round]())

    val guess1 = Guess(Vector[GuessPeg](Yellow(), Yellow(), Yellow(), Yellow()))
    val feedback1 = Feedback(Vector[ResultPeg]())
    val round1 = Round(guess1, feedback1)
    board = Board(board, round1)
    board.toString should be("YYYY Result: No pegs\n")

    val guess2 = Guess(Vector[GuessPeg](Red(), Yellow(), Yellow(), Yellow()))
    val feedback2 = Feedback(Vector[ResultPeg](Black()))
    val round2 = Round(guess2, feedback2)
    board = Board(board, round2)
    board.toString should be("YYYY Result: No pegs\n" +
      "RYYY Result: Black\n")

    val guess3 = Guess(Vector[GuessPeg](Red(), Red(), Yellow(), Yellow()))
    val feedback3 = Feedback(Vector[ResultPeg](Black(), Black()))
    val round3 = Round(guess3, feedback3)
    board = Board(board, round3)
    board.toString should be("YYYY Result: No pegs\n" +
      "RYYY Result: Black\n" +
      "RRYY Result: Black Black\n")

    val guess4 = Guess(Vector[GuessPeg](Red(), Red(), Red(), Yellow()))
    val feedback4 = Feedback(Vector[ResultPeg](Black(), Black(), Black()))
    val round4 = Round(guess4, feedback4)
    board = Board(board, round4)
    board.toString should be("YYYY Result: No pegs\n" +
      "RYYY Result: Black\n" +
      "RRYY Result: Black Black\n" +
      "RRRY Result: Black Black Black\n")

    val guess5 = Guess(Vector[GuessPeg](Red(), Red(), Red(), Red()))
    val feedback5 = Feedback(Vector[ResultPeg](Black(), Black(), Black(), Black()))
    val round5 = Round(guess5, feedback5)
    board = Board(board, round5)
    board.toString should be("YYYY Result: No pegs\n" +
      "RYYY Result: Black\n" +
      "RRYY Result: Black Black\n" +
      "RRRY Result: Black Black Black\n" +
      "RRRR Result: Black Black Black Black\n")
  }
}