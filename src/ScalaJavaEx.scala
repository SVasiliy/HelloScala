import java.util.{Date, Locale}
import java.text.DateFormat._

object ScalaJavaEx {
  def main(args: Array[String]): Unit ={
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
