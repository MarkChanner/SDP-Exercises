import scala.util.Random

object SecretCodeGenerator {
  val CODE_LENGTH = 4
  val PEG_COLOURS = 6

  def apply(): SecretCode = {
    run(Vector[GuessPeg]())
  }

  def run(pegs: Vector[GuessPeg]): SecretCode = {
    if (pegs.size == CODE_LENGTH) SecretCode(pegs)
    else {
      var p = pegs
      Random.nextInt(PEG_COLOURS) match {
        case 0 =>
          p = p :+ Blue()
        case 1 =>
          p = p :+ Green()
        case 2 =>
          p = p :+ Orange()
        case 3 =>
          p = p :+ Purple()
        case 4 =>
          p = p :+ Red()
        case 5 =>
          p = p :+ Yellow()
      }
      run(p)
    }
  }

}