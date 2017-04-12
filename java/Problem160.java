/**
 * Created by Sneeuwpopsneeuw on 11-Apr-17.
 */
public class Problem160 extends Problem {
  public static void main(String args[]) {
    print(fac(20L));
  }

  private static long fac(long n) {
    long fact = 1;
    for (int i=1; i <= n; i++) {
      fact *= i;
      fact = trim(fact);
      println(fact);
    }

    return fact;
  }

  private static long trim(long value) {
    String text = new String(""+value);
    int i = text.length();

    while(text.charAt(i-1) == '0')
      i--;

    return Long.parseLong( text.substring((i-15 < 0)? 0 : i-15, i) );
  }
}




/* 

   For any N, let f(N) be the last five digits before the trailing zeroes in
   N!. For example,

   9! = 362880 so f(9)=36288
   10! = 3628800 so f(10)=36288
   20! = 2432902008176640000 so f(20)=17664

   Find f(1,000,000,000,000)

*/