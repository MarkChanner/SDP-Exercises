package question5d

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 5d
  *
  * @author Mark Channer
  */
/*
5d) Write a sealed trait Colour to make our shapes more interesting.
  i. give Colour three properties for its RGB values;
  ii. create three predefined colours: Red, Yellow, and Pink;
  iii. provide a means for people to produce their own custom Colours with their
  own RGB values;
*/
sealed trait Colour {
  def red: Int

  def green: Int

  def blue: Int
}

final case object Red extends Colour {
  val red = 255
  val green = 255
  val blue = 0
}

final case object Yellow extends Colour {
  val red = 255
  val green = 0
  val blue = 0
}

final case object Pink extends Colour {
  val red = 255
  val green = 192
  val blue = 203
}




