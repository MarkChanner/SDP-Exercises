object Validator {

  val guessLength = 4
  val validPegs = "BGOPRY"

  def apply(input: String): Input = {
    if (valid(input)) Valid(input)
    else Invalid(input)
  }

  def valid(input: String): Boolean = {
    input.length == guessLength &&
      (!input.exists(_.isLower)) &&
      allValidLetters(input)
  }

  def allValidLetters(guess: String) = {
    var result = true
    for (letter <- guess) {
      if (!validPegs.contains(letter)) result = false
    }
    result
  }
}