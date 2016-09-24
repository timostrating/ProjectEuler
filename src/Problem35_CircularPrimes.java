/**
 * Created by Sneeuwpopsneeuw on 11-Aug-16.
 */
public class Problem35_CircularPrimes extends Problem{
    public static void main(String[] args) {
        long MAX = 1_000_000, ans = 0,  startTime = System.currentTimeMillis();

        for (int i=2; i<MAX; i++)           // loop Numbers
            if(isPrime(i))                  // if we have a prime
                if (isCircularPrime(i))     // and we have a Circular Prime
                    ans++;

        System.out.println("ans = " + ans);  // ans = 55
        System.out.println("Time = " + (System.currentTimeMillis() - startTime) +"ms");
    }


    public static Boolean isCircularPrime(int num) {
        String text = ""+num;
        char[] chars = text.toCharArray();

        if (chars.length == 1)  // if we only have 1 number it is always a Circular Prime
            return true;

        for (int i=0; i<text.length()-1; i++) {         // LOOP all combinations
            char tmp = chars[0];
            for (int j=0; j < chars.length - 1; j++) {  // LOOP chars
                chars[j] = chars[j + 1];                // shift chars
            }
            chars[chars.length - 1] = tmp;              // repair shift

            if(isPrime(Integer.parseInt( new String(chars) )) == false)  // is the shifted number not a prime than it is no Circular Prime
                return false;
        }
        System.out.println("Circular primes = " + text);
        return true;    // all shifted variants are primes so this prime is a Circular Prime
    }
}



/*
    There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97
 */


