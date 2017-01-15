import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem051_ConsecutivePrimeSum extends Problem{  // TODO: Problem051_ConsecutivePrimeSum
    public static void main(String[] args) { new Problem051_ConsecutivePrimeSum().start(); }
    private void start() {

        for (int index=0; true; index ++) {
            String str = "" + index;

            for (int i = 0; i < str.length(); i++) {
                check(str, i);
            }

            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    check(str, i, j);
                }
            }

            for (int i = 0; i < str.length() - 2; i++) {
                for (int j = i + 1; j < str.length() - 1; j++) {
                    for (int k = j + 1; k < str.length(); k++) {
                        check(str, i, j, k);
                    }
                }
            }
        }
    }

    private void check(String str, int... indexes) {
        ArrayList<Integer> oldNumbers = new ArrayList<>();
        char[] array = str.toCharArray();

        for (char ch = '0'; ch <= '9'; ch++) {
            for (int i : indexes) {
                array[i] = ch;
            }

            int number = Integer.parseInt(String.valueOf(array));
            if (isPrime(number))
                oldNumbers.add(number);
        }

        if (oldNumbers.size() == 8) {
            if (arrayElementsSameStringLengh( oldNumbers.stream().mapToInt(i -> i).toArray() )) {
                System.out.println("");
                System.out.println(Arrays.toString(oldNumbers.toArray()));
                throw new RuntimeException(); // we found something lets quit
            }
        }
    }

    private boolean arrayElementsSameStringLengh( int[] array ) {
        int length = String.valueOf(array[0]).length();
        for (int i=1; i < array.length; i++) {
            if (String.valueOf(array[i]).length() != length)
                return false;
        }

        return true;
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