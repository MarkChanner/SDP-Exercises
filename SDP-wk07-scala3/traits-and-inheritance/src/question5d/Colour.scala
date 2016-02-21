package question5d

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5d
  *
  * @author Mark Channer
  */
sealed trait Colour {
  def red: Int

  def green: Int

  def blue: Int
}

case object Red extends Colour {
  val red = 255
  val green = 255
  val blue = 0
}

case object Yellow extends Colour {
  val red = 255
  val green = 0
  val blue = 0
}

case object Pink extends Colour {
  val red = 255
  val green = 192
  val blue = 203
}

final case class CustomColour(red: Int, green: Int, blue: Int) extends Colour {

}




