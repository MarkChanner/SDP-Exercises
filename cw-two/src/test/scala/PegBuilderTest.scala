import org.scalatest.FunSuite

class PegBuilderTest extends FunSuite {

  test("Tests PegBuilder object") {
    assert(PegBuilder("B") == Blue)
    assert(PegBuilder("G") == Green)
    assert(PegBuilder("O") == Orange)
    assert(PegBuilder("P") == Purple)
    assert(PegBuilder("R") == Red)
    assert(PegBuilder("Y") == Yellow)
  }
}