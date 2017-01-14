import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem051_ConsecutivePrimeSum extends Problem{  // TODO: Problem051_ConsecutivePrimeSum
    public static void main(String[] args) { new Problem051_ConsecutivePrimeSum().start(); }
    public void start() {
//        ArrayList<Integer> primeList = new ArrayList<>();
//        for (int i = 1; i < 10_000; i++) {
//            if (isPrime(i))
//                primeList.add(i);
//        }
        int index = 0;
        while (true) {
            String str = "" + index;
            ArrayList<Integer> oldNumbers = new ArrayList<>();

            if (index % 1000 == 0)
                System.out.println(index);

            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    char[] array = str.toCharArray();

                    for (char ch = '0'; ch < '9'; ch++) {
                        array[i] = ch;
                        array[j] = ch;

                        int number = Integer.parseInt(String.valueOf(array));
                        if (isPrime(number))
                            oldNumbers.add(number);
                    }

                    if (oldNumbers.size() == 7) {
                        System.out.println("");
                        System.out.println(Arrays.toString(oldNumbers.toArray()));
                        return;
                    } else oldNumbers.clear();
                }
            }
            index++;
        }
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