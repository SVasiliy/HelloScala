

object ScalaListTest {
  def main(args: Array[String]): Unit ={

      val myList: List[String] = List("apple","mango","orange","pear")

      for (x <- myList)
        println(x)

  }
}

