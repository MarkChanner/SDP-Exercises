package question05a

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5a
  *
  * Note how you can use either val or def to retrieve the result.
  * This is one way Scala conforms to the Universal Access Principle.
  *
  * @author Mark Channer
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

final case class Rectangle(length: Double, height: Double) extends Shape {
  val sides = 4
  def perimeter = (length * 2) + (height * 2)
  val area = length * height
}

final case class Square(size: Double) extends Shape {
  val sides = 4
  val perimeter = size * 4
  def area = size * size
}

object testShapes {
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
    assert(square.perimeter == 20 )
    assert(square.area == 25)

  }
}