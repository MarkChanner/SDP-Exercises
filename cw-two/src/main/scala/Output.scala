object Output {
  val intro =
    """Welcome to Mastermind.
This is a text version of the classic board game Mastermind.
The computer will think of a secret code.
The code consists of 4 colored pegs.
The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.
q1_2.A color may appear more than once in the code.

You try to guess what colored pegs are in the code and what order they are in
After making a guess the result will be displayed.
q1_2.A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.
For each peg in the guess that is the correct color, but is out of position, you get a white peg.

Only the first letter of the color is displayed. q1_2.B for Blue, R for Red, and so forth.
When entering guesses you only need to enter the first character of the color as a capital letter.

You have 12 to guess the answer or you lose the game."""


  def begin = "Generating secret code ...."

  //def queryGuess(easy: Boolean): String = ??? //What is your next guess?

  //def apply(board: Board): String = ??? // Print the feedback of a round

  //def end(outcome: Outcome): String = ??? // Depends on outcome of the game
}