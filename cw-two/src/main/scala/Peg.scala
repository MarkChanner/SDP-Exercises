
sealed trait Peg

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

sealed trait ResultPeg

case class Blue() extends Peg {
  override def toString: String = "B"
}

case class Green() extends Peg {
  override def toString: String = "G"
}

case class Orange() extends Peg {
  override def toString: String = "O"
}

case class Purple() extends Peg {
  override def toString: String = "P"
}

case class Red() extends Peg {
  override def toString: String = "R"
}

case class Yellow() extends Peg {
  override def toString: String = "Y"
}

case class Black() extends ResultPeg {
  override def toString: String = "Black"
}

case class White() extends ResultPeg {
  override def toString: String = "White"
}

case class Empty() extends ResultPeg {
  override def toString: String = ""
}


