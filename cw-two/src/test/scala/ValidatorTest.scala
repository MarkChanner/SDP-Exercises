import org.scalatest.{FunSuite, Matchers}

class ValidatorTest extends FunSuite with Matchers {

  test("tests for valid input") {
    val validInput = "BGBY"
    Validator.valid(validInput) should be(true)
  }

  test("tests for lower case letters") {
    val invalidLowerCase1 = "oooo"
    Validator.valid(invalidLowerCase1) should be(false)

    val invalidLowerCase2 = "bGBY"
    Validator.valid(invalidLowerCase2) should be(false)

    val invalidLowerCase3 = "BgBY"
    Validator.valid(invalidLowerCase3) should be(false)

    val invalidLowerCase4 = "BGbY"
    Validator.valid(invalidLowerCase4) should be(false)

    val invalidLowerCase5 = "BGBy"
    Validator.valid(invalidLowerCase5) should be(false)
  }

  test("tests for invalid letters") {
    val invalidLetter1 = "kkkk"
    Validator.valid(invalidLetter1) should be(false)

    val invalidLetter2 = "ZGGG"
    Validator.valid(invalidLetter2) should be(false)

    val invalidLetter3 = "GZGG"
    Validator.valid(invalidLetter3) should be(false)

    val invalidLetter4 = "GGZG"
    Validator.valid(invalidLetter4) should be(false)

    val invalidLetter5 = "GGGZ"
    Validator.valid(invalidLetter5) should be(false)
  }

  test("tests for invalid length") {
    val invalidLength1 = "B"
    Validator.valid(invalidLength1) should be(false)

    val invalidLength2 = "BB"
    Validator.valid(invalidLength2) should be(false)

    val invalidLength3 = "BBB"
    Validator.valid(invalidLength3) should be(false)

    val invalidLength4 = "BBBBB"
    Validator.valid(invalidLength4) should be(false)

    val invalidLength5 = "BBBBBB"
    Validator.valid(invalidLength5) should be(false)
  }

  test("tests for empty string input") {
    val emptyString = ""
    Validator.valid(emptyString) should be(false)
  }
}