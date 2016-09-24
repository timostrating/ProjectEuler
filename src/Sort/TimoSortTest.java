package Sort;

/** Created by Sneeuwpopsneeuw on 26-Jun-16.    explanation - https://www.youtube.com/watch?v=aQiWF4E8flQ */
public class TimoSortTest extends SortTest {


    private int[] array = {6,5,1,3,8,4,7,9,2};  // default value
    private static boolean DEBUG = false;
    private final String FORMAT = "%-30s%-54s%-50s%n";


    @Override
    protected void doTest(int[] array) {
        this.array = array;
        timoSort(0, array.length-1);
    }

    protected void testTheTest() {
        DEBUG = true;
        System.out.println("");
        System.out.println("QUICKSORT IMPLEMENTATION BY TIMO STRATING: ");
        System.out.println("");
        doTest(array);
    }

    public static void main(String[] args){
        TimoSortTest timoSortTest = new TimoSortTest();
        timoSortTest.testTheTest();
    }


    /*
                                    !               #
    left           |6|  5   1   3   8   4   7   9   2
    right           6   5   1   3   8   4   7   9  |2|
    pivot           6   5   1   3  |8|  4   7   9   2
                                                            l++ l++ l++ l++ l++
                                    #               !       swap()
                   |1|  5   6   3   2   4   7   9   8
                    1   5   6   3   2   4   7   9  |8|
                    1   5   6   3  |2|  4   7   9   8
                                                            split()

                                  REPEAT

     */



    private void timoSort(int left, int right) {  // CLEAN VERSION BELOW

        int l = left;                   // wall
        int r = right;                  // current
        int p = (l+r)/2;                // center
        int pValue = array[p];

        if(DEBUG) { System.out.printf( FORMAT,  java.util.Arrays.toString(array), getDetails(l,r), ""); }


        while (l <= r) {    // loop left to right
            while ( array[l] < pValue) {
                l++;
                if(DEBUG) { System.out.printf( FORMAT, "  l++", getDetails(l,r), "while ( left -> p) :   " + array[l] + " < " + pValue); }
            }
            while (array[r] > pValue) {
                r--;
                if(DEBUG) { System.out.printf( FORMAT, "  r--", getDetails(l,r), "while ( p <- right) :   " + array[r] + " > " + pValue); }
            }

            if(l < r) {
                if(DEBUG) { System.out.printf ("%100s%20s%n",  "swap( ["+l+"], ["+r+"] )",  "draaiom( "+array[l]+", "+array[r]+" )"); }
                swap(l,r);
                l++;
                r--;
            } else if( l == r) {    // we dont have to swap if the numbers in the cunk are the same
                l++;
                r--;
            }

            if(DEBUG) { System.out.printf( FORMAT,  java.util.Arrays.toString(array),  getDetails(l,r), ""); }
        }

        if (left < r)
            timoSort(left, r);
        if (l < right)
            timoSort(l, right);
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private String getDetails(int l, int r) {
        return  "      l:[" + l +
                     "] = " + array[l] +
                "      r:[" + r +
                     "] = " + array[r] +
                "      p:[" + (l+r)/2 +
                     "] = " + array[(l+r)/2];
    }










    private void TIMOSORT(int left, int right) {        // short DEMO version
        int l = left;                       // wall
        int r = right;                      // current
        int pValue = array[(l+r)/2];        // center value

        while (l <= r) {                    // |  ->  ->  ->  |

            while ( array[l] < pValue)      // |6,2,1 ->  p=8 |
                l++;                        // |     /        |

            while (array[r] > pValue)       // | p=8  <- 4,9,7|
                r--;                        // |        \     |

            if(l < r) {                     /* |2            4| */
                swap(l,r);                  // |4            2|
                l++;                        // ||
                r--;                        //               ||

            } else if( l == r) {            /*     |6 6 |6      */    // there is no point for doing anything here we just want to  break  but we cant easily :(   1 ms optimisation if we are lucky in the rng
                l++;                        // ||
                r--;                        //               ||
            }
        }

        if (left < r)                       /* |_2           4| */
            timoSort(left, r);              // |    O    |    |

        if (l < right)                      /* |2           _4| */
            timoSort(l, right);             // |    |    O    |
    }
}
