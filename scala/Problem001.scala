/**
  * Created by Sneeuwpopsneeuw on 15-Aug-17.
  */
object Problem001 extends App {
  var out = 0

  for(i <- 1 until 1000)
    if(i % 3 == 0  ||  i % 5 == 0)
      out += i

  println( out )
}
