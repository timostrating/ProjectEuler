/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem010_SummationOfPrimes extends Problem{
    public static void main (String args[]) {
        long number = 2_000_000, sum = 0;

        while (number > 1) {
            if(isPrime(number))
                sum += number;

            number --;
        }

        System.out.print( " = " + sum);
    }
}
