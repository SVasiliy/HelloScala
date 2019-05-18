object ScalaOptionTest {
  def main(args: Array[String]): Unit ={

      def returnOption(v: String): Option[String] =
        if (v == "test") None
        else Some("testval")

      val x = "test"
      println(returnOption(null).toString)


  }
}

