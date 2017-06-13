/**
 * Created by Sneeuwpopsneeuw on 11-Jun-17.
 */

import java.util.ArrayList;
import java.util.List;

public class Problem072 extends Problem {

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


    public int calculateMin(int[] arr, int number) {
        int minus = 0;
        for (int i=1; i < (1 << arr.length ); i++) {
            int n = 0, value = 1;

            char[] chars = Integer.toBinaryString(i).toCharArray();                 //   00000000   128 64 32 16 8 4 2 1
//            System.out.println("chars = " + Arrays.toString(chars));

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1') {
                    n++;
                    value *= arr[(chars.length - 1) - j];
//                    System.out.print(arr[(chars.length - 1) - j] + " * ");
                }
            }

//            System.out.println("  = "+value);
            if (n > 1)
                minus = (n % 2 == 1) ? minus + ((number / value) - 1) : minus - ((number / value) - 1);
        }
        return -minus;
    }


    public static void main(String[] args) { new Problem072().start(); }
    public void start() {
        final int MAX = 1_000_000;
        long startTime = System.currentTimeMillis();
        long ans = 0, x = 0;

        for (int i=2; i < MAX; i++) {
            int total = 0;
            int[] primeDivisions = getPrimeDivisions(i);
            for (int prime : primeDivisions)
                total += (i / prime) - 1;

            ans += total - calculateMin(primeDivisions, i);
            x += (i-1);
        }

        System.out.printf("x = %d   ans = %d   x - ans = %d   in %f seconds", x, ans, x-ans, (System.currentTimeMillis() - startTime)/1000.0);
    }
}
