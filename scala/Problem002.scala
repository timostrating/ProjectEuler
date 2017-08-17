/**
  * Created by Sneeuwpopsneeuw on 17-Aug-17.
  */
object Problem002 extends App {
  def fib( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }

  var out, i, value = 0

  while(value < 4000000) {
    if (value % 2 == 0)
      out += value
    i += 1
    value = fib(i)
  }

  println(out)
}
