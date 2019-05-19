import scala.util.{Failure, Success, Try}

object ScalaTryTest {
  def main(args: Array[String]): Unit = {

      def returnTry(v: String): Try[String] =
        if (v == "test") Success(v)
        else Failure(new IllegalArgumentException("value is not 'test'"))

      val x = "test"
      println(returnTry("tsdf"))


      val is: (Int, String) = (42, "foo")
      println(is)

  }
}

