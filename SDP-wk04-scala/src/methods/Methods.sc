
// Methods
// Q.1
def getSquare(value: Int) = value * value
print(getSquare(4))
val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)
// Q.2
def isArg1GreaterThanArg2(x: Double, y: Double) = x > y
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false)
val t2 =  isArg1GreaterThanArg2(2.1, 1.2)
assert(t2 == true)

// Q.3
def manyTimesString(text : String, max : Int) = {
  var result = ""
  for (i <- 1 to max) result += text
  result
}
assert("abcabcabc" == manyTimesString("abc", 3))
assert("123123" == manyTimesString("123", 2))

// Classes and Object
// Q.1




