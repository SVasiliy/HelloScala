package collections.iterables

object SameElements {

  def main(args:Array[String]):Unit = {

    val xs = List("Manny", "Moe", "Jack")
    val ys = List("Manny", "Moe", "Jack")
    println(xs sameElements ys) // true

    val xt = List("Manny", "Moe", "Jack")
    val yt = List("Manny", "Jack", "Moe")
    println(xt sameElements yt) // false


    // https://stackoverflow.com/questions/29008500/scala-sets-contain-the-same-elements-but-sameelements-returns-false
    val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
    println(xs1 sameElements ys1) // true

    val xt1 = Set(1, 2, 3)
    val yt1 = Set(3, 2, 1)
    println(xt1 sameElements yt1) // false

  }

}
