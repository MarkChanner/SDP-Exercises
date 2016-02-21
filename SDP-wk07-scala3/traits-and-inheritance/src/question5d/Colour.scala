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

  def isDark: Boolean = (red + green + blue / 3) > 400 // not very accurate, but hey
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

final case class CustomColour(red: Int, green: Int, blue: Int) extends Colour

object main extends App {
  val red: Colour = Red
  assert(red.isDark)
  val yellow: Colour = Yellow
  assert(!yellow.isDark)
  val pink: Colour = Pink
  assert(pink.isDark)
  val blue: Colour = CustomColour(0,0,255)
  assert(!blue.isDark)
}