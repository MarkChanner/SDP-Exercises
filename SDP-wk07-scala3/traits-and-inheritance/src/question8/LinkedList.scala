package question8

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 8
  *
  * @author Mark Channer
  *
  * ii. a method apply that returns the nth item in the list.
  * iii. a method contains that determines whether or not an item is in the list.
  *
  * In each case, start by writing an abstract method definition in LinkedList.
  * Think about the types of the arguments and the types of the results. Then
  * implement the method for Empty –– it should be pretty easy to provide a default
  */
sealed trait LinkedList[A] {
  def length: Int = {
    this match {
      case Pair(head, tail) => 1 + tail.length
      case Empty() => 0
    }
  }
}
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class Empty[A]() extends LinkedList[A]

object Main extends App {
  val list = Pair(1, Pair(2, Pair(3, Empty())))
  assert(list.isInstanceOf[LinkedList[Int]])
  assert(list.head == 1)
  //This code won't work as head and tail are not LinkedList fields
  //assert(list.tail.head == 2)
  //assert(list.tail.tail == Pair(3, Empty()) as a LinkedList[Int]
  assert(list.length == 3)
  val list2 = Pair("One", Empty())
  assert(list2.length == 1)
}


