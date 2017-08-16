/**
  * Created by Sneeuwpopsneeuw on 17-Aug-17.
  */
object Problem002 extends App {
  def fib( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }

  var out, i = 0
  var value = fib(i)

  while(fib(i) < 4000000) {
    if (fib(i) % 2 == 0)
      out += fib(i)
    i += 1
  }

  println(out)
}
