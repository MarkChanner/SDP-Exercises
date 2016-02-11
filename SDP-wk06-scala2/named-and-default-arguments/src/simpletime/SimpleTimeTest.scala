package simpletime

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Named & Default Arguments Q.6 - 10
  * Mark Channer
  */

class SimpleTime(val hours: Int, val minutes: Int)

class SimpleTime2(val hours: Int, val minutes: Int = 0)

object TestSimpleTime extends App {
  // Question 6
  val t = new SimpleTime(hours = 5, minutes = 30)
  t.hours is 5
  t.minutes is 30

  // Question 7
  val t2 = new SimpleTime2(hours = 10)
  t2.hours is 10
  t2.minutes is 0


}

