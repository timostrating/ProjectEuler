package Sort;

/** Created by Sneeuwpopsneeuw on 04-Jun-16.    FROM THE INTERNET */
public class OptimizedSortTest extends SortTest {


    @Override
    public void doTest(int[] x) {
        buildInSort(x, 0, x.length);
    }

    private void buildInSort(int x[], int off, int len) {

        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int o = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                o = med3(x, o-2*s, o-s, o);
            }
            m = med3(x, l, m, o); // Mid-size, med of 3
        }
        int v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            buildInSort(x, off, s);
        if ((s = d-c) > 1)
            buildInSort(x, n-s, s);
    }

    private void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    private void vecswap(int x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    private int med3(int x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }
}
