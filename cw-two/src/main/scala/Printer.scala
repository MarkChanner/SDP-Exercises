object Printer {
  def apply(output: String) = {
    print(output)
  }
}
object printMain extends App {
  Printer(Output.intro)
}