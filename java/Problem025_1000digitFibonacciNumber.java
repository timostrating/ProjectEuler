import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem025_1000digitFibonacciNumber {


    public static void main(String args[]) {

        BigInteger n = new BigInteger("1");
        BigInteger n1 = new BigInteger("2");
        BigInteger oldN = new BigInteger("0");
        long i = 3;

        while ( i < 10000 ) {
            oldN = n;

            n = n1;
            n1 = n1.add(oldN);

            if (n.toString().length() >= 1000) {
                System.out.println("n = " + n);
                System.out.println("n1 = " + n1);
                System.out.println("i = " + i);
                return;
            }

            i++;
        }
    }
}
