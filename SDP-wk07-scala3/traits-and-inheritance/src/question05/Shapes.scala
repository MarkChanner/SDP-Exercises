package question05

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance Q.5-11
  * Mark Channer
  *
  */
/**
  5. (a) Define a trait called Shape and give it three abstract methods:
  i. 'sides' returns the number of sides;
  ii. 'perimeter' returns the total length of the sides;
  iii. 'area' returns the area.
  Implement 'Shape' with three classes: 'Circle', 'Rectangle', and 'Square'. In each
  case provide implementations of each of the three methods. Ensure that the
  main constructor parameters of each shape (e.g., the radius of the circle) are
  accessible AS FIELDS.
  Tip: The value of pi is accessible as math.Pi.
 */
trait Shape {

  def sides: Int
  def perimeter: Double
  def area: Double

}


object main extends App {

}
