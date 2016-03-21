import scala.util.Random

object SecretCodeGenerator {
  val CODE_LENGTH = 4
  val PEG_COLOURS = 6

  def apply(): SecretCode = {
    run(Vector[Peg]())
  }

  def run(v: Vector[Peg]): SecretCode = {
    if (v.size == CODE_LENGTH) SecretCode(v)
    else {
      var code = v
      Random.nextInt(PEG_COLOURS) match {
        case 0 =>
          code = code :+ Blue()
        case 1 =>
          code = code :+ Green()
        case 2 =>
          code = code :+ Orange()
        case 3 =>
          code = code :+ Purple()
        case 4 =>
          code = code :+ Red()
        case 5 =>
          code = code :+ Yellow()
      }
      run(code)
    }
  }
}

