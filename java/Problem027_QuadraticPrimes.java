/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem027_QuadraticPrimes extends Problem {
    public static void main(String[] args) {
        final int SIZE = 1000;
        long ans = 0, max = 1, value = 0 ;

        for(int a = -SIZE; a < SIZE; a++) {         // LOOP a           |---0---|
            for(int b = -SIZE; b < SIZE; b++) {     // LOOP b           |---0---|

                for (int n=0; n < 99_999; n++) {    // loop n
                    value = (long)Math.pow(n, 2) + (a*n) + b;  // n^2+an+b
                    if (isPrime(value) == false) {
                        if (n > max) {
                            System.out.println("n^2+an+b = "+value+"  :    a ="+a+"   b ="+b);
                            ans = a*b;
                            max = n;
                        }
                        break;
                    }
                }

            }
        }

        System.out.println("ans = " + ans);  // -59231
    }
}
