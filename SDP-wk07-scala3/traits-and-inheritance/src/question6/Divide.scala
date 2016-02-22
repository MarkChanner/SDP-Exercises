package question6

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 6
  *
  * @author Mark Channer
  */

object divide {

  def apply(num1: Int, num2: Int) = {
    if (num2 != 0) Finite(num1 / num2)
    else Infinite
  }
}

sealed trait DivisionResult

final case class Finite(result: Int) extends DivisionResult

final case class Infinite() extends DivisionResult

object main extends App {
  println(divide(1,2) match {
    case Finite(result) => s"Result is finite $result"
    case Infinite => s"Result is infinite"
  })

  println(divide(1,0) match {
    case Finite(result) => s"Result is finite $result"
    case Infinite => s"Result is infinite"
  })
  assert(divide(9,3) == Finite(3))
}






