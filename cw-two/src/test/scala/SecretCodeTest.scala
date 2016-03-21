import org.scalatest.{FunSuite, Matchers}

class SecretCodeTest extends FunSuite with Matchers {

  test("Tests SecretCode") {
    val pegs: Vector[GuessPeg] = Vector[GuessPeg](Green(), Green(), Purple(), Purple())
    val noPegs: Vector[GuessPeg] = Vector[GuessPeg]()

    val empty: SecretCode = SecretCode(noPegs)
    empty.toString should be("")

    val secret: SecretCode = SecretCode(pegs)
    secret.toString should be("GGPP")
  }
}