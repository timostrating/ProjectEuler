/**
 * Created by Sneeuwpopsneeuw on 11-Jun-17.
 */

import java.util.ArrayList;
import java.util.List;

public class Problem072 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Problem072().start();
        System.out.println("\t\tin "+ (System.currentTimeMillis() - startTime)/1000.0 +" seconds" );
    }




    public int[] getPrimeDivisions(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i=2; i <= n / i; i++) {
            while (n % i == 0) {
                if (factors.contains(i) == false)
                    factors.add(i);

                n /= i;
            }
        }
        if (n > 1)
            factors.add(n);

        return factors.stream().mapToInt(i->i).toArray();  // fuck you java why can't I convert Interger to int    // (int[]) factors.toArray(new int[factors.size()]);
    }


    public int calculateMin(int[] arr, int number) {                                //   [2, 3, 5], 60
        int minus = 0;
        for (int i=1; i < (1 << arr.length ); i++) {                                //   loop 1  ->  4+2+1     001 -> 111    001 010, 011, 100, 101, 110, 111
            int n = 0, value = 1;

            char[] chars = Integer.toBinaryString(i).toCharArray();                 //   i: 5  ->  00000101   128 64 32 16 8 4 2 1
            for (int j=0; j < chars.length; j++) {
                if (chars[j] == '1') {                                              //   00000101  [2, _, 5]
                    n++;
                    value *= arr[(chars.length - 1) - j];                           //   value:  2 * 5
                }
            }

            if (n > 1)
                minus = (n % 2 == 0) ?  minus + ((number / value) - 1)  :  minus - ((number / value) - 1);    // (60 / value) - 1
        }
        return minus;
    }


    public void start() {
        final int MAX = 1_000_000;
        long value = 0, maxValue = 0, total = 0;

        for (int i=2; i < MAX; i++) {                                               // 60
            total = 0;
            int[] primeDivisions = getPrimeDivisions(i);                            // 60  -->  [2 3, 5]
            for (int prime : primeDivisions)
                total += (i / prime) - 1;                                           // 60 / 2 -1      60 / 3 -1      60 / 5 -1

            value += total - calculateMin(primeDivisions, i);
            maxValue += (i-1);
        }

        System.out.printf("maxValue = %d    value = %d    maxValue - value = %d", maxValue, value, maxValue-value);
    }
}