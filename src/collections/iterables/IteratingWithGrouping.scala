package collections.iterables

object IteratingWithGrouping {

  def main (args:Array[String]):Unit = {
    val list = List(3, 5, 9, 11, 15, 19, 21, 24)
    val it = list grouped 3

    println(it.next) // List(3, 5, 9)
    println(it.next) // List(11, 15, 19)
    println(it.next) // List(21, 24)  -- just 2 elements
  }

}
