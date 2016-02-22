package question8

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 8
  *
  * @author Mark Channer
  */
sealed trait LinkedList[A]
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class Empty[A]() extends LinkedList[A]



object Main extends App {
  val list = Pair(1, Pair(2, Pair(3, Empty())))
  assert(list.isInstanceOf[LinkedList[Int]])
  assert(list.head == 1)
  //assert(list.tail.head == 2)
  //assert(list.tail.tail == Pair(3, Empty()) as a LinkedList[Int]


}


