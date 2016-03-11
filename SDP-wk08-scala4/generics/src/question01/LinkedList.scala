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

  def apply(index: Int) =
    this match {
      case Pair(head, tail) =>
        if (index == 0) Success(head)
        else Success(tail(index - 1))
      case End() =>
        Failure("Index out of bounds")
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

sealed trait Result[A]

case class Success[A](result: A) extends Result[A]

case class Failure[A](result: String) extends Result[A]

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

  val example3 = Pair(1, Pair(2, Pair(3, End())))
  assert(example3(0) == 1)
  assert(example3(1) == 2)
  assert(example3(2) == 3)
  assert(try {
    example3(3)
    false
  } catch {
    case e: Exception => true
  })

  assert(example(0) == Success(1))
  assert(example(1) == Success(2))
  assert(example(2) == Success(3))
  assert(example(3) == Failure("Index out of bounds"))
}