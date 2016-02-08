package fieldsinclasses

import atomicscala.AtomicTest._

class Cup {
  var percentFull = 0
  val max = 100

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }

  def set(percent: Int) = {
    percentFull = percent
  }

  def get() = {
    percentFull
  }
}

object AtomicFrameWorkTest extends App {
  val cup = new Cup
  cup.add (45) is 45
  // Produces errors
  //cup.add (-55) is 0
  //cup.add(10) is 10
  //cup.add (-9) is 1
  //cup.add(-2) is 0

  // Produces error
  //cup.percentFull = 56
  //cup.percentFull is 56

  val cup2 = new Cup
  cup2.set(56)
  cup2.get() is 56

}
