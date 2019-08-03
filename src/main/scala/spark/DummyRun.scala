package spark

object DummyRun extends App{

  println("go")

  val seq = Seq(1,2,3,1,5,1,1,2,3)
  val set = seq.toSet

  println(set)

}
