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
  def red: Double
  def yellow: Double
  def pink: Double
}




