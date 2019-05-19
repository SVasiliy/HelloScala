object ForWithFlatMap {
  def main(args: Array[String]): Unit = {

    // define a List of Lists
    val list:List[List[Int]] = List(List(1,2,3),List(4,5,6))
    println(list.flatMap(x => x))

    val listStr:List[String] = List("one","two","three")
    println(listStr.flatMap(x => x))



    println(
      /*

          List(
              // listStr.map(y => (y, x) for List(1,2,3)
              List(
                  (one, List(1,2,3))
                  (two, List(1,2,3))
                  (three, List(1,2,3))
              )
              // listStr.map(y => (y, x) for List(4,5,6)
              List(
                  (one, List(4,5,6))
                  (two, List(4,5,6))
                  (three, List(4,5,5))
              )
      */

      list.map(x => listStr.map(y => (y, x)))

    )

    println(
      /*

          List(
                  (one, List(1,2,3))
                  (two, List(1,2,3))
                  (three, List(1,2,3))
                  (one, List(4,5,6))
                  (two, List(4,5,6))
                  (three, List(4,5,5))
              )
      */

      list.flatMap(x => listStr.map(y => (y, x)))

    )

  }
}

