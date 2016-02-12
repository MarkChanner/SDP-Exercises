package tea

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Constructors Q.11
  * Mark Channer
  */
class Tea(val name: String = "Earl Grey",
          val decaf: Boolean = false,
          val milk: Boolean = false,
          val sugar: Boolean = false) {

  def describe() = {
    var description: String = name
    if (decaf) description += " decaf"
    if (milk) description += " + milk"
    if (sugar) description += " + sugar"
    description
  }

  def calories() = {
    var cals = 0
    if (milk) cals += 100
    if (sugar) cals += 16
    cals
  }
}

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0

  val lemonZinger = new Tea(decaf = true, name = "Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0

  val sweetGreen = new Tea(name = "Jasmine Green", sugar = true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16

  val teaLatte = new Tea(sugar = true, milk = true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}
