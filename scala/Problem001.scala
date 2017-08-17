/**
  * Created by Sneeuwpopsneeuw on 15-Aug-17.
  */
object Problem001 extends App {
  println(((1 until 1000).filter(_ % 3 == 0).toSet  ++  (1 until 1000).filter(_ % 5 == 0).toSet ).sum)
}
