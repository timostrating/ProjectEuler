import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem50_ConsecutivePrimeSum extends Problem{  // random guess work at play
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i=1; i < 5_000; i++) {
            if (isPrime(i))
                primeList.add(i);
        }

        int j = 0, value = 0;
        while (value + primeList.get(j) < 1_000_000) {  // we assume we go over the limit
            value += primeList.get(j);
            j ++;
        }

        int oldJ = j;
        while (isPrime(value) == false) {  // we now build our self's back together
            value -= primeList.get( oldJ - j );
            j --;
        }

        System.out.println( "value = "+value+"   "+(System.currentTimeMillis()-startTime)+"ms ");
    }
}