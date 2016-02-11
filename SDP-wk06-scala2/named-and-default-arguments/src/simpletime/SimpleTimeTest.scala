package simpletime

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Named & Default Arguments Q.6 - 10
  * Mark Channer
  */

class SimpleTime(val hours: Int, val minutes: Int)

class SimpleTime2(val hours: Int, val minutes: Int = 0)

class Planet(val name: String, val description: String, val moons: Int = 1) {
  // no parenthesis as doesn't take any args
  def hasMoon: Boolean = moons != 0
}

object TestSimpleTime extends App {
  // Question 6
  val t = new SimpleTime(hours = 5, minutes = 30)
  t.hours is 5
  t.minutes is 30

  // Question 7
  val t2 = new SimpleTime2(hours = 10)
  t2.hours is 10
  t2.minutes is 0

  // Question 8
  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
  p.hasMoon is false

  // Question 9. Shows how the argument order can be mixed
  val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
  earth.hasMoon is true
}

