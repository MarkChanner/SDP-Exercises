package question5c

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5c
  *
  * @author Mark Channer
  */
sealed trait Shape {
  def sides: Int

  def perimeter: Double

  def area: Double
}

final case class Circle(radius: Double) extends Shape {
  val sides = 1
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

object Draw {
  def apply(shape: Shape) = shape match {
    case Circle(radius) =>
      s"A circle of radius ${radius}cm"
    case Rectangle(length, height) =>
      s"A rectangle of width ${length}cm and height ${height}cm"
    case Square(size) =>
      s"A square that has a side length of ${size}cm"
  }
}

object testRefactoredShapes {
  def main(args: Array[String]) = {
    println(Draw(Circle(10)))
    println(Draw(Rectangle(3, 4)))
    println(Draw(Square(10)))
  }
}