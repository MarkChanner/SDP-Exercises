/**
  *
  */
object PegBuilder {

  def apply(letter: String) = {
    letter match {
      case "B" => Blue
      case "G" => Green
      case "O" => Orange
      case "P" => Purple
      case "R" => Red
      case "Y" => Yellow
      case _ => "No such peg"
    }
  }

}
