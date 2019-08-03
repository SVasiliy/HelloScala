object OptionTest {

  def main (args:Array[String]): Unit = {
    val number: Option[Int] = Some(3)
    val noNumber: Option[Int] = None
    val result1 = number.map(_ * 1.5)
    val result2 = noNumber.map(_ * 1.5)
    println(result1) // Option[Double]
    println(result2) // Option[Double]

    // This operation will extract the value from the option, or provide a default if the value is None
    val result3 = number.fold(1)(_ * 3)
    val result4 = noNumber.fold(2)(_ * 3)
    println(result3) // function
    println(result4) // function


  }

}
