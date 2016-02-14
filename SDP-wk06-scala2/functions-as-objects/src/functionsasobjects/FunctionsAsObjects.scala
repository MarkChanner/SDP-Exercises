package functionsasobjects

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Functions as Objects Q.20 - 23
  * Mark Channer
  */
object FunctionsAsObjects extends App {

  // Q.20 *Firstly completing exercise 1 on p.177 of
  // Atomic Scala was necessary for this exercise
  val v = Vector(1, 2, 3, 4)
  var str = ""
  v.foreach(n => str += n + ",")
  str is "1,2,3,4,"

  // Q.21
  val dogYears = (years: Int) => years * 7
  dogYears(10) is 70

  // Q.22
  val v2 = Vector(3, 6, 9, 12, 15, 18)
  var years = ""
  v2.foreach(n => years += dogYears(n))
  years is "21426384105126"

  // Q.23
  val numbersToSquare = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9)
  var squaredNumbers = ""
  numbersToSquare.foreach(n => squaredNumbers += n * n)
  squaredNumbers is "149162536496481"

}
