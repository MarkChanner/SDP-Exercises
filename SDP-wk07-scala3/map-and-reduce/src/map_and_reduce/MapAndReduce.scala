package map_and_reduce

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 7
  * Map and Reduce  Q.24-29
  * Mark Channer
  */
object MapAndReduce extends App {
  // Q.24
  val v = Vector(1, 2, 3, 4)
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)

  // Q.25
  // You cannot use foreach to replace the usage of map in the
  // solution to Q.24 because, whereas map returns a value,
  // foreach does not
  //val v2 = v.foreach(n => n * 11 + 10) is Vector(21, 32, 43, 54)

  // Q.26
  val result = for (value <- v) yield value * 11 + 10
  result is Vector(21, 32, 43, 54)

  // Q.27
  v.map(n => n + 1) is Vector(2, 3, 4, 5)
  val result2 = for (n <- v) yield n + 1
  result2 is Vector(2, 3, 4, 5)

  // Q.28 * Reduce.scala located on P.180 of Atomic Scala
  val v2 = Vector(1, 10, 100, 1000)
  var total = 0
  for (val2 <- v2) total += val2
  total is 1111

  // Q.29
  def sumIt(values: Int*) = {
    values.reduce((sum, n) => sum + n)
  }
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195




}
