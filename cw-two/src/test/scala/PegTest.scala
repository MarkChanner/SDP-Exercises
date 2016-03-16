import org.scalatest.{FunSuite, Matchers}

class PegTest extends FunSuite with Matchers {
  test("testPegs") {
    val b: Peg = Blue()
    b should be(Blue())
    b.toString should be("B")

    val g: Peg = Green()
    g should be(Green())
    g.toString should be("G")

    val black: ResultPeg = Black()
    black should be (Black())
    black.toString should be("BLACK")

    val white: ResultPeg = White()
    white should be(White())
    white.toString should be("WHITE")
  }
  test("testPegsConstructors") {
    val red = Peg("R")
    red should be(Red())

    val yellow = Peg("Y")
    yellow should be (Yellow()
    )

  }
}

