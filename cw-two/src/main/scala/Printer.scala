object Printer {
  def apply(output: String) = {
    println(output)
  }
}
object printMain extends App {
  Printer(Output.intro)
  Printer(Output.queryGuess(true, SecretCodeGenerator()))
}