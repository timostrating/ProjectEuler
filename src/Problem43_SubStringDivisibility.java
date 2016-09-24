/**
 * Created by Sneeuwpopsneeuw on 19-Aug-16.
 */
public class Problem43_SubStringDivisibility {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        long ans = 0;

        int[] divisors = { 1,  2, 3, 5, 7, 11, 13, 17 };
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (long n=1; n < factorial(10); n++) {

            int length = array.length;
            int i = length - 1;
            while (array[i - 1] >= array[i]) {          // LOOP i
                i = i - 1;
            }

            int j = length;
            while (array[j - 1] <= array[i - 1]) {      // LOOP J
                j = j - 1;
            }

            swap(array, i-1, j-1);  // swap values at position i-1 and j-1

            i++;
            j = length;
            while (i < j) {                             // LOOP magic
                swap(array, i-1, j-1);
                i++;
                j--;
            }

            boolean flag = true;
            int value = 0;

            for (int k=divisors.length-1; k > 0; k--) {
                int d = k+2;
                value = Integer.parseInt(("" + array[d-2] + array[d-1] + array[d]));
//                System.out.println(value);
                if (value % divisors[k] == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag)
                ans += Long.parseLong( "" + array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9] );

        }

        System.out.println(" ans = "+ans+"          Time: " + (System.currentTimeMillis() - startTime) +" ms");
    }

    private static void swap( int[] x, int a, int b) {
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

    public static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
