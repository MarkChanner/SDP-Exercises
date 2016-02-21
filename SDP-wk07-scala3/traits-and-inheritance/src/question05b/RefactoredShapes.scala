package question05b

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5b
  *
  * Avoid 'case class to case class inheritance'
  *
  * @author Mark Channer
  */
/**
  * (b) The solution from part a delivered three distinct types of shape. However, it
  * doesn’t model the relationships between the three correctly. A Square isn’t just
  * a Shape –– it’s also a type of Rectangle where the width and height are the
  * same.
  * We want to avoid case-class-to-case-class inheritance, so refactor the solution to
  * the last exercise so that Square and Rectangle are subtypes of a common type
  * Rectangular.
  */
sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

final case class Circle(radius: Double) extends Shape {
  def sides = 1
  val perimeter = (math.Pi * 2) * radius
  val area = (math.Pi * radius) * radius
}

sealed trait Rectangular extends Shape {
  def length: Double
  def height: Double
  def sides: Int = 4
  def perimeter = (length * 2) + (height * 2)
  def area = length * height
}

final case class Rectangle(length: Double, height: Double) extends Rectangular

final case class Square(size: Double) extends Rectangular {
  val length = size
  val height = size
}

object testRefactoredShapes {
  def main(args: Array[String]): Unit = {
    val circle: Shape = Circle(12)
    assert(circle.sides == 1)
    assert(circle.perimeter == 75.39822368615503)
    assert(circle.area == 452.3893421169302)

    val rect: Shape = Rectangle(4, 12)
    assert(rect.sides == 4)
    assert(rect.perimeter == 32)
    assert(rect.area == 48)

    val square: Shape = Square(5)
    assert(square.sides == 4)
    assert(square.perimeter == 20)
    assert(square.area == 25)
  }
}