package question10

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 10
  *
  * @author Mark Channer
  */
sealed trait Maybe[A]

final case class Full[A](value: A) extends Maybe[A]

final case class Empty[A]() extends Maybe[A]

case object divide {
  def apply(num1: Int, num2: Int) = {
    if (num2 != 0) Full(num1 / num2)
    else Empty()
  }
}

object main extends App {
  divide(9, 3) match {
    case Full(value) => println(s"It's finite: $value")
    case Empty() => println(s"It's infinite")
  }
}


