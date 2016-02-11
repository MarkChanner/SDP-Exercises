package classargs

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Class Arguments Q.3 - Q.5
  * Mark Channer
  */
class Family(val members: String*) {
  def familySize() = members.size
}

class FlexibleFamily(val mum: String, val dad: String, val children: String*) {
  def familySize() = children.size + 2
}

object TestArgs extends App {
  // Question 3
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3

  // Question 4
  val family3 = new Family("Mum", "Dad", "Sally2", "Dick")
  family3.familySize() is 4
  val family4 = new Family("Mum", "Dad", "Harry")
  family4.familySize() is 3

  // Question 5
  def squareThem(values: Int*): Int = {
    var result = 0
    for (v <- values) {
      result += v * v
    }
    result
  }

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21
}
