import java.time.LocalDate
import java.time.format.{DateTimeFormatter, FormatStyle}
import java.util.Locale

class Student(var name: String, var rollNo: Int) {
  override def toString: String = s"($name, $rollNo)"
}

object ScalaJavaEx {
  def main(args: Array[String]): Unit ={
    val now = LocalDate.now
    val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE)
    println(now format df)

    val test = new Student("sdf", 4)
    println(test toString)
  }
}

