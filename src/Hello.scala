object Hello extends App {
  println("Hello, World!")
  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3



  val builder = new StringBuilder

  val x = { builder += 'x'; 1 }
  lazy val y = { builder += 'y'; 2 }
  def z = { builder += 'z'; 3 }

  z + y + x + z + y + x

  println(builder.result())
}