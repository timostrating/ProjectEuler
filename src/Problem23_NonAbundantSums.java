import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem23_NonAbundantSums {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        int ans = 0, value = 0;

        ArrayList<Integer> map = new ArrayList<>();

        for (int i=1; i <= 28123 ; i++) {
            if ( d(i) > i) {
//                System.out.println("abundant number i = "+i+"   d(i) = "+d(i));
                map.add(i);
            }
        }

        System.out.println("abundant number map generated");

        boolean flag = false;
        int checkedValue = 0;

        for (int i=1; i <= 28123 ; i++) {
            for (int j=0; j < map.size() ; j++) {
                checkedValue = map.get(j);
                if (map.contains(i-checkedValue)) {
                    flag = true;
                    break;
                } else if (checkedValue > i) break;
            }

            if (flag == false) {
                System.out.println(" -- "+ans+"   - i = " + i);
                ans += i;
            }

            flag = false;
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






/*

    1 -> 28123

 */