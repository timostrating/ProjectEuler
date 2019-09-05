/**
  * Created by Sneeuwpopsneeuw on 18-Aug-17.
  */
object Problem004 extends App {
  override def main(args:Array[String] ) {
    for (i <- 999 to 900 by -1) {
      for (j <- 999 to 900 by -1) {
        val value = (i * j).toString()
        if (value == value.reverse) {
          println(s"$i * $j = $value")
          return
        }
      }
    }
  }
}
