import org.scalatest.{FunSuite, Matchers}

class InputTest extends FunSuite with Matchers {
  test("Test isValid()") {
    val validInput = Valid("BGPR")
    validInput.isValid should be(true)

    val invalidInput = Invalid("ZZZZ")
    invalidInput.isValid should be(false)
  }
}
