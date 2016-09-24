package Sort;

import java.util.ArrayList;
import java.util.List;

/** Created by Sneeuwpopsneeuw on 04-Jun-16.  FROM THE INTERNET */
public class RadixSortTest extends SortTest {


    @Override
    public void doTest(int[] x) {
        radixsort(x);
    }


    public void radixsort(int[] input) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // move to next digit
            placement *= RADIX;
        }
    }
}
