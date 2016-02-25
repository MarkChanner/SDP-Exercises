package question01

/**
  * SDP Scala Exercises Week 8
  * Generics, Question 1
  *
  * @author Mark Channer
  */

sealed trait LinkedList[A] {
  def length: Int =
    this match {
      case Pair(head, tail) => 1 + tail.length
      case End() => 0
    }

  def contains(item: A): Boolean = {
    this match {
      case Pair(head, tail) =>
        if (head == item) true
        else tail.contains(item)
      case End() => false
    }
  }
}

final case class End[A]() extends LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object Main extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End().length == 0)

  val example2 = Pair(1, Pair(2, Pair(3, End())))
  assert(example2.contains(3))
  assert(!example2.contains(4))
  assert(!End().contains(0))
  // This should not compile
  // example.contains("not an Int")
}