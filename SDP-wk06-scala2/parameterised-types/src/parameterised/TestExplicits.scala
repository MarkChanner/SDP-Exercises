package parameterised

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Parameterised Types Q.17-19
  * Mark Channer
  *
  * Use toList method for converting collection types
  */
object TestExplicits extends App {

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }

  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
    Vector(c1, c2, c3)
  }

  //Q.17
  def explicitDouble(v1: Double, v2: Double, v3: Double): Vector[Double] = {
    Vector(v1, v2, v3)
  }

  // Q.18
  def explicitList(values: Vector[Double]): List[Double] = {
    values.toList
  }

  def explicitSet(values: Vector[Double]): Set[Double] = {
    values.toSet
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"

  // Q.17
  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

  // Q.18
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

  // Q.19
  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)


}
