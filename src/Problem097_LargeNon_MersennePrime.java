import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 10-Aug-16.
 */
public class Problem097_LargeNon_MersennePrime {
    public static void main(String[] args) {
        BigInteger massivePrime = new BigInteger("28433");

        massivePrime = massivePrime.multiply(new BigInteger("2").pow(7830457));
        massivePrime = massivePrime.add(new BigInteger("1"));

        String text = massivePrime.toString();  // 28433 * 2^7830457 + 1

        for (int i = text.length()-10;  i < text.length();  i++)
            System.out.print(text.charAt(i));
    }
}





//  ___NICE_ANSWER___  from the forums


//  long start = 28433;
//  long pow10 = 10000000000L;
//  int power = 7830457;
//
//  for (int loop = 0; loop < power / 29; loop++)
//    start = (start << 29) % pow10;
//
//  start = (start << 22) % pow10 + 1;
//
//  System.out.println ("Last ten digits: " + start);