package Demo2

object CommandLineInputs {

  def main(args: Array[String]): Unit = {
    // updated the IntelliJ Run Argument inputs as 1 12 123
    println("Hello, " + args(0))
    println("Now printing args,.....")
    args.foreach(println)
  }

}
