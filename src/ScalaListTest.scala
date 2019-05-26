import scala.collection.mutable.ListBuffer

object ScalaListTest {
  def main(args: Array[String]): Unit ={

      val myList: List[String] = List("apple","mango","orange","pear")

      for (x <- myList)
        println(x)


      println("--- --- test ListBuffer --- ---")

      val myListBuffer: ListBuffer[String] = myList.to[ListBuffer]
      myListBuffer += "peach"

      for (x <- myListBuffer)
        println(x)

  }
}

