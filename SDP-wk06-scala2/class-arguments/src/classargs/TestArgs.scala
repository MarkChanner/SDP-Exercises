package classargs

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Class Arguments Q.3 - Q.5
  * Mark Channer
  */

class Family(val members : String*) {

  def familySize() = members.size

}

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3

}
