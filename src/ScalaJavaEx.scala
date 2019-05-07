import java.time.LocalDate
import java.time.format.{DateTimeFormatter, FormatStyle}
import java.util.Locale

object ScalaJavaEx {
  def main(args: Array[String]): Unit ={
    val now = LocalDate.now
    val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE)
    println(now format df)
  }
}
