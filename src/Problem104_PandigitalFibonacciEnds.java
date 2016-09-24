import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 12-Aug-16.
 */
public class Problem104_PandigitalFibonacciEnds {
    public static void main(String[] args) {

        BigInteger n = new BigInteger("1");
        BigInteger n1 = new BigInteger("2");
        BigInteger nold = new BigInteger("1");

        for(int i=3; i<1_999_999; i++) {

            nold = n1;
            n1 = n1.add(n);
            n = nold;

            if(i < 300_000)
                continue;

            String text = n.toString();

            boolean isSpecial = true , hasNumber = false;
            for (int j=1; j < 10; j++) {  // 1
                for (int k=0; k < 9; k++) {
                    if(Character.getNumericValue(text.charAt(k)) == j) {
//                        System.out.print(j+"K ");
                        hasNumber = true;
                        break;
                    }
                }
                if (hasNumber == false) {
                    isSpecial = false;
                    break;
                }
                hasNumber = false;
            }

            if ( isSpecial ) {
                System.out.println(""+i+" "+text);
            }

            for (int j=1; j < 10; j++) {  // 1
                for (int k=0; k < 9; k++) {
                    if(Character.getNumericValue(text.charAt(text.length()-k-1)) == j) {
//                        System.out.print(j+"K2 ");
                        hasNumber = true;
                        break;
                    }
                }
                if (hasNumber == false) {
                    isSpecial = false;
                    break;
                }
                hasNumber = false;
            }

            if ( isSpecial ) {
                System.out.println("ans = "+i+" "+text);
                return;
            } else if ( i % 1000 == 0 ) {
                System.out.print(".");
            }
        }
    }
}


/*

The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
It turns out that F541, which contains 113 digits, is the first Fibonacci number for which the last nine digits are 1-9 pandigital (contain all the digits 1 to 9,
but not necessarily in order). And F2749, which contains 575 digits, is the first Fibonacci number for which the first nine digits are 1-9 pandigital.

Given that Fk is the first Fibonacci number for which the first nine digits AND the last nine digits are 1-9 pandigital, find k.

 */