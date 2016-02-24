package question9

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 9
  *
  * @author Mark Channer
  */
sealed trait Sum[A, B]

final case class Left[A, B](value: A) extends Sum[A, B]

final case class Right[A, B](value: B) extends Sum[A, B]

object Main extends App {
  assert(Left[Int, String](1).value == 1)
  assert(Right[Int, String]("foo").value == "foo")

  val sum: Sum[Int, String] = Right("foo")
  assert(sum == Right("foo"))

  val result = sum match {
    case Left(x) => x.toString
    case Right(x) => x
  }
  assert(result == "foo")
}