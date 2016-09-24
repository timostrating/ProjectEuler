/**
 * Created by Sneeuwpopsneeuw on 10-Aug-16.
 */
public class Problem21_AmicableNumbers {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        int ans = 0, value = 0;

        for (int i=2; i<10_000; i++) {
            value = d(i);   // we cache the result
            if ( d( value ) == i  &&  value != i) {
                System.out.println("i = "+i+"   d(i) = "+d(i));
                ans += i;
            }
        }

        System.out.println("ans: "+ans);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) +" ms");
    }


    private static int d(int value) {
        int divisors = 1;
        for (int j=2; j<value; j++) {   // we could a loop that goes from 2 to the sqrt of the value
            if (value % j == 0) {
                divisors += j;          // If we did ^^ we also need to calculate  value / 2  and add that to divisors
            }
        }

        return divisors;
    }
}
