object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!!")

    val age: Int = 5
    val isSchoolStarted: Boolean = false

    if (1 <= age && age <= 6 && isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }
}
