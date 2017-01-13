import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem051_ConsecutivePrimeSum extends Problem{  // TODO: Problem051_ConsecutivePrimeSum
    ArrayList<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) { new Problem051_ConsecutivePrimeSum().start(); }
    public void start() {
        for (int i=1; i < 10_000; i++) {
            if (isPrime(i))
                primeList.add(i);
        }

        int value = 0;
        for (int i=100; i <= 500; i++) {
            value = run(i+"", new int[] {0} );   // TODO
            System.out.println( value );

            if (value > 6)
                return;
        }
    }

    public int run(String str, int[] indexes) {
        char[] chars = str.toCharArray();
        int output = 0;

        for (int i=0; i <= 9; i++) {
            for (int j=0; j < indexes.length; j++) {
                chars[indexes[j]] = (char)(48 + i);   // TODO
            }
            if (primeList.contains( Integer.parseInt( new String(chars) ) ))
                output++;
        }

        return output;
    }
}




/*

   By replacing the 1^st digit of *57, it turns out that six of the possible
   values: 157, 257, 457, 557, 757, and 857, are all prime.

   By replacing the 3^rd and 4^th digits of 56**3 with the same digit, this
   5-digit number is the first example having seven primes, yielding the
   family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently
   56003, being the first member of this family, is the smallest prime with
   this property.

   Find the smallest prime which, by replacing part of the number (not
   necessarily adjacent digits) with the same digit, is part of an eight
   prime value family.

 */