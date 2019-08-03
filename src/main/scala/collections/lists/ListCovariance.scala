package collections.lists

object ListCovariance {

  def main(args:Array[String]):Unit = {

    val t:List[Int] = List(1, 2, 3)
    println(t)

    val s:List[Any] = List(1, "Two")
    println(s)


  }

}
