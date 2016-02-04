import com.atomicscala.AtomicTest._
/**
  * SDP Exercises - Scala Day One (Part I)
  *
  * @author Mark Channer
  */

//Classes & Objects
// Q.1
val r1 = Range(0, 10)
println(r1.step)

val r2 = Range(0, 10, 2)
println(r2.step)
// Q.2
var s1 = "Sally"
var s2 = "Sally"

if (s1.equals(s2)) {
  println("s1 and s2 are equal")
} else {
  println("s1 and s2 are not equal")
}

// Creating Classes
// Q.1
class Hippo
class Lion
class Tiger
class Monkey
class Giraffe
val hippo = new Hippo
val lion = new Lion
val tiger = new Tiger
val monkey = new Monkey
val giraffe = new Giraffe
println(hippo)
println(lion)
println(tiger)
println(monkey)
println(giraffe)
// Q.2
val lion2 = new Lion
val giraffe2 = new Giraffe
val giraffe3 = new Giraffe
println(lion2)
println(giraffe2)
println(giraffe3)
// Methods inside Classes
// Q.1
class Sailboat {
  def raiseSails() = {
    println("Sails raised")
  }
  def lowerSails() = {
    println("Sails lowered")
  }

  def signal() = {
    val flare = new Flare
    flare.light
  }
}

class Motorboat {

  def startMotor() = {
    "Motor on"
  }
  def stopMotor() = {
    "Motor off"
  }

  def signal() = {
    val flare = new Flare
    flare.light
  }
}

// Comparing values of types Unit and String (Sailboat methods) will always yield false
val sailboat = new Sailboat
val t1 = sailboat.raiseSails
//assert(t1 == "Sails raised", "Expected Sails raised, Got " + t1)
val t2 = sailboat.lowerSails
//assert(t2 == "Sails lowered", "Expected Sails lowered, Got " + t2)
// Motorboat methods return Strings rather than printing, so no problems
val motorboat = new Motorboat
val m1 = motorboat.startMotor
assert(m1 == "Motor on", "Expected Motor on, Got " + m1)
val m2 = motorboat.stopMotor
assert(m2 == "Motor off", "Expected Motor off, Got " + m2)
// Q.2
class Flare {
  def light() = {
    "Flare used!"
  }
}

val flare = new Flare
val n1 = flare.light
assert(n1 == "Flare used!", "Expected Flare used!, Got " + n1)
// Q.3
val sailboat2 = new Sailboat
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used! Got " + signal)

// Fields in  Classes
// Q.1
class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}

val cup = new Cup
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20






