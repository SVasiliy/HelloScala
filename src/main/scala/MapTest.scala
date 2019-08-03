object MapTest {

  def main (args:Array[String]): Unit = {

    val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")

    val mapValues = myMap.values

    println(mapValues)
    println(myMap("MI")) // returns just value

    // Map keys may be of mixed type:
    val myMap2 = Map("Ann Arbor" → "MI", 49931 → "MI")

    // Map equivalency is independent of order:
    val myMap3 =
      Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
    val myMap4 =
      Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio")
    println (myMap3.equals(myMap4)) // true
    println (myMap3 == myMap4) // true

  }

}
