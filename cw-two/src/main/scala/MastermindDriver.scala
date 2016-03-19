object MastermindDriver {
  def main(args: Array[String]) {
   // var g: Game = Factory.getInstance(classOf[Game], true)
    var g: Game = Mastermind(true)
    g.runGames
    //g = Factory.getInstance(classOf[Game], false)
    //g = Mastermind(false)
    //g.runGames
  }
}