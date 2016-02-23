package question8

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 8
  *
  * @author Mark Channer
  *
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

  def apply(index: Int): A = {
    this match {
      case Pair(head, tail) =>
        if (index == 0) head
        else tail(index - 1)
      case Empty() =>
        throw new Exception("Bad things happened")
    }
  }


}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class Empty[A]() extends LinkedList[A]

object Main extends App {
  val list = Pair(1, Pair(2, Pair(3, Empty())))
  assert(list.isInstanceOf[LinkedList[Int]])
  assert(list.head == 1)
  assert(list.length == 3)
  //The suggested two tests below won't work as head and tail are not fields of LinkedList
  //assert(list.tail.head == 2)
  //assert(list.tail.tail == Pair(3, Empty()) as a LinkedList[Int]
  assert(list(0) == 1)
  assert(list(1) == 2)
  assert(list(2) == 3)

}


