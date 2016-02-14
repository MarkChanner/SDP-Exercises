package person

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Case Classes Q.15 - 16
  * Mark Channer
  *
  * Case class advantages:
  * val not necessary
  * apply() method generated
  * toString(), equals(), hashcode(), and getter/setters generated
  */
case class Person(first: String, last: String, email: String)

object TestPerson extends App {
  // Q.15
  val p1 = Person("Jane", "Smile", "jane@smile.com")
  p1.first is "Jane"
  p1.last is "Smile"
  p1.email is "jane@smile.com"

  //Q.16
  val people = Vector(Person("Jane", "Smile", "jane@smile.com"),
                      Person("Ron", "House", "ron@house.com"),
                      Person("Sally", "Dove", "sally@dove.com"))

  people(0) is "Person(Jane,Smile,jane@smile.com)"
  people(1) is "Person(Ron,House,ron@house.com)"
  people(2) is "Person(Sally,Dove,sally@dove.com)"
}
