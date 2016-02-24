package question9

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 9
  *
  * @author Mark Channer
  */
sealed trait Sum[A, B]
final case class Left[A, B](left: A, right: B) extends Sum
final case class Right[A, B](left: A, right: B) extends Sum

