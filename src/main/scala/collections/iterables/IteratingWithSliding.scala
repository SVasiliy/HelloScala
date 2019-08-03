package collections.iterables

object IteratingWithSliding {

  def main (args:Array[String]):Unit = {
    val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    val it = list sliding 3

    println(it.next) // List(3, 5, 9)
    println(it.next) // List(5, 9, 11)
    println(it.next) // List(9, 11, 15)
  }

}
