package $org$

import xsbti.{ AppMain, AppConfiguration }

object Main {
  def main(args: Array[String]) {
    run(args)
  }
  def run(args: Array[String]): Int = {
    println("$message$: %s" format args)
  }
}

class Script extends AppMain {
  def run(conf: AppConfiguration) =
    Exit(Main.run(conf.arguments))
}

case class Exit(val code: Int) extend xsbti.Exit
