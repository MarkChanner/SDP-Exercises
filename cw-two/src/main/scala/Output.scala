object Output {
  val intro = "Welcome to Mastermind.\n\n" +
    "This is a text version of the classic board game Mastermind.\n" +
    "The computer will think of a secret code.\n" +
    "The code consists of 4 colored pegs.\n" +
    "The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.\n" +
    "A color may appear more than once in the code.\n\n" +
    "You try to guess what colored pegs are in the code and what order they are in\n" +
    "After making a guess the result will be displayed.\n" +
    "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.\n" +
    "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n\n" +
    "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n" +
    "When entering guesses you only need to enter the first character of the color as a capital letter.\n\n" +
    "You have 12 to guess the answer or you lose the game.\n"

  val begin = "\nGenerating secret code ....\n"

  def revealSecretCode(secretCode: SecretCode): String = s"The secret code is $secretCode\n"

  def remainingAttempts(remainingAttempts: Int): String = s"You have $remainingAttempts guesses left.\n"

  val promptForGuess = "\nWhat is your next guess?\n" +
    "Type in the characters for your guess and press enter.\n" +
    "Enter guess: "

  def secretCodeUnmasked(secretCode: SecretCode) = "\n" + secretCode + " SecretCode\n"

  val secretCodeMasked = "\n.... SecretCode\n"

  def roundFeedback(board: Board) = {
    val output = StringBuilder.newBuilder
    board.rounds.map(r => output.append(r))
    output.toString
  }

  def remainingRows(remainingGuesses: Int) = {
    val output = StringBuilder.newBuilder
    for (i <- 0 until remainingGuesses) output.append("....\n")
    output.append("\n")
    output.toString
  }

  def gameEnd(outcome: Outcome): String = {
    outcome.toString
  }

  val anotherGame = "Enter Y for another game or anything else to quit: "
}