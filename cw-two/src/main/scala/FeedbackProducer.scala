import util.Random.shuffle

object FeedbackProducer {

  def apply(guess: Guess, secretCode: SecretCode): Feedback = {
    val zippedPegs = guess.pegs.zip(secretCode.pegs)

    val blackPegs: Vector[ResultPeg] = zippedPegs
      .filter(x => x._1 == x._2)
      .map(x => Black())

    val trimmedGuess: Vector[Peg] = zippedPegs
      .filter(x => x._1 != x._2)
      .map(x => x._1)

    val trimmedSecretCode: Vector[Peg] = zippedPegs
      .filter(x => x._1 != x._2)
      .map(x => x._2)

    val whitePegs: Vector[ResultPeg] = trimmedGuess.intersect(trimmedSecretCode)
      .map(x => White())

    val resultPegs: Vector[ResultPeg] = Vector(blackPegs, whitePegs).flatten //shuffle(Vector(blackPegs, whitePegs).flatten)

    Feedback(resultPegs)
  }

}