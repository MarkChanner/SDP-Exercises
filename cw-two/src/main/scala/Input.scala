sealed trait Input {
  val text: String

  def isValid: Boolean =
    this match {
      case Valid(text: String) => true
      case Invalid(text: String) => false
    }
}

final case class Valid(text: String) extends Input

final case class Invalid(text: String) extends Input