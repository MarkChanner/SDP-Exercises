package question01

/**
  * SDP Scala Exercises Week 8
  * Generics, Question 1
  *
  * @author Mark Channer
  */
sealed trait LinkedList[A]

final case class End[A]() extends LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
