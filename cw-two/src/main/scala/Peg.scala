sealed trait Peg

sealed trait ResultPeg extends Peg {
  override def toString = this match {
    case Black() => "Black"
    case White() => "White"
  }
}

sealed trait GuessPeg extends Peg {
  override def toString = this match {
    case Blue() => "B"
    case Green() => "G"
    case Orange() => "O"
    case Purple() => "P"
    case Red() => "R"
    case Yellow() => "Y"
  }
}

object Peg {
  def apply(letter: String) = letter match {
    case "B" => Blue()
    case "G" => Green()
    case "O" => Orange()
    case "P" => Purple()
    case "R" => Red()
    case "Y" => Yellow()
    case _ => "No such peg"
  }
}

final case class Blue() extends GuessPeg

final case class Green() extends GuessPeg

final case class Orange() extends GuessPeg

final case class Purple() extends GuessPeg

final case class Red() extends GuessPeg

final case class Yellow() extends GuessPeg

final case class Black() extends ResultPeg

final case class White() extends ResultPeg


