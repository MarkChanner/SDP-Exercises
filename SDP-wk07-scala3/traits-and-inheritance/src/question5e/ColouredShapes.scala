package question5e

import question5d._

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5e
  *
  * @author Mark Channer
  */
sealed trait Shape {
  def sides: Int

  def perimeter: Double

  def area: Double

  def colour: Colour
}

final case class Circle(radius: Double, colour: Colour) extends Shape {
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

final case class Rectangle(length: Double, height: Double, colour: Colour) extends Rectangular

final case class Square(size: Double, colour: Colour) extends Rectangular {
  val length = size
  val height = size
}

object Draw {
  def apply(shape: Shape) = shape match {
    case Circle(radius, colour) =>
      "A " + getColour(colour) + s" circle of radius ${radius}cm"
    case Rectangle(length, height, colour) =>
      "A " + getColour(colour) + s" rectangle of width ${length}cm and height ${height}cm"
    case Square(size, colour) =>
      "A " + getColour(colour) + s" square that has a side length of ${size}cm"
  }

  def getColour(colour: Colour) = colour match {
    case Red => "red"
    case Yellow => "yellow"
    case Pink => "pink"
    case CustomColour(red, green, blue) =>
      if (colour.isDark) "dark" else "light"
  }
}

object testRefactoredShapes {
  def main(args: Array[String]) = {
    println(Draw(Circle(10, Yellow)))
    println(Draw(Rectangle(3, 4, Red)))
    println(Draw(Square(10, Pink)))
    println(Draw(Circle(15,CustomColour(255,0,0))))
  }
}