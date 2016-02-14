package map_and_reduce

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Map and Reducde  Q.24-29
  * Mark Channer
  */
object MapAndReduce extends App {
  // Q.24
  val v = Vector(1, 2, 3, 4)
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)
}
