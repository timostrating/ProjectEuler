import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem {

    protected static int getAmountOfDividers(int value) {
        int divisors = 1;
        for (int j=2; j < value; j++) {   // we could a loop that goes from 2 to the sqrt of the value
            if (value % j == 0) {
                divisors += j;          // If we did ^^ we also need to calculate  value / 2  and add that to divisors
            }
        }
        return divisors;
    }



    public static int factorial(int n) {
        int fact = 1; // this will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (n.equals(BigInteger.ZERO) == false) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }



    protected static Boolean isPrime(int num){
        if(num <= 1) return(false);  // important
        if(num == 2) return(true);
        for(int i = 2;  i <= (int)Math.sqrt(num) + 1;  i++){ //loops through 2 to sqrt(num). All you need to check- efficient
            if(num % i==0) return(false);
        }
        return(true); // it is prime if we end up here
    }


    protected static Boolean isPrime(long num){
        if(num <= 1L) return(false);  // important
        if(num == 2L) return(true);
        for(long i = 2L;  i <= (long)Math.sqrt(num) + 1L;  i++){ //loops through 2 to sqrt(num). All you need to check- efficient
            if(num % i == 0L) return(false);
        }
        return(true); // it is prime if we end up here
    }





    protected static boolean haveSameDigits(int a, int b) { return haveSameDigits(a, b, false); }
    protected static boolean haveSameDigits(int a, int b, boolean seconTime) {                            // recursive +1
        String textA = "" + a;
        String textB = "" + b;
        boolean flag = false;

        for (int i = 0; i < textA.length(); i++) {
            for (int j = 0; j < textB.length(); j++) {
                if (Character.getNumericValue(textA.charAt(i)) == Character.getNumericValue(textB.charAt(j))) {  // IF  Pointer A == Pointer B
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return false;

            flag = false;
        }

        return (seconTime) ? true : haveSameDigits(b, a, true);
    }


    protected static boolean haveDiferentDigits(int a, int b) {
        String textA = "" + a;
        String textB = "" + b;

        for (int i = 0; i < textA.length(); i++) {
            for (int j = 0; j < textB.length(); j++) {
                if (Character.getNumericValue(textA.charAt(i)) == Character.getNumericValue(textB.charAt(j))) {  // IF  Pointer A == Pointer B
                    return false;
                }
            }
        }

        return true;
    }

}
