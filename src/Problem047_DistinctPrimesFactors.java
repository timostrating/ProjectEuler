/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem047_DistinctPrimesFactors extends Problem{
    public static void main(String[] args) {
        int ans = 0, size = 1000, amount = 4, count = 0;

        int[] map = new int[size];

        map[0] = 2;
        int n = 1;
        for (int i=1; i < 999_999; i+=2) {
            if(isPrime(i)) {
                map[n] = i;
                n++;

                if (n >= size)
                    break;
            }
        }

        for (int i=0; i < 999_999; i++) {
            for (int j=0; j < size; j++) {
                if ( i / (double)map[j] == Math.floor(i / (double)map[j]))
                    count ++;
            }

            ans = (count == amount)? ++ans : 0;
            count = 0;

            if (ans == amount) {
                System.out.println("ans = " + (i - amount+1));
                break;
            }
        }
    }
}