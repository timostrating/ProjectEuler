package Sort;

import java.util.Arrays;

/** Created by Sneeuwpopsneeuw on 04-Jun-16. */
public abstract class SortTest {
    private Integer AMOUNT = 1_000_000;
    private Integer FROM = 1;
    private Integer TO = 10_000_000;            // NICE: make it more readable


    public void test(int q) {
        long startTime = 0;
        long endTime = 0;
        long fastestTime = Long.MAX_VALUE;

        int[] randomArray;

        System.out.printf ( "%-35s", getClass() + " : " );

        for (int i =0; i<15; i++) {
            randomArray = makeArrayRandom(AMOUNT, FROM, TO);

            startTime = System.currentTimeMillis();             // ⏰ -start
                doTest(randomArray);
            endTime = System.currentTimeMillis() - startTime;   // ⏰ -stop

            if (endTime < fastestTime)                          // CHEAT: we store the fastest time
                fastestTime = endTime;

            if (i > q)                                          // CHEAT: we skip the first 14 iterations
                System.out.printf ("%-4s", fastestTime +" " );  // last iteration we print the fastest time

        }

        System.out.print("   = " + fastestTime + " ms");
    }

    public void antiCheat() {
        int[] randomArray;
        int[] randomArrayClone;

        randomArray = makeArrayRandom(AMOUNT, FROM, TO);
        randomArrayClone = randomArray.clone();

        doTest(randomArrayClone);
        Arrays.sort(randomArray);

        if (! Arrays.equals(randomArray, randomArrayClone)) {     // test if the results are the same
            System.err.println(" ! CHEATER ! ");

            System.out.println(randomArray[5]);
            System.err.println(randomArrayClone[5]);

            System.out.println(randomArray[900]);
            System.err.println(randomArrayClone[900]);

            System.out.println(randomArray[1500]);
            System.err.println(randomArrayClone[1500]);

            System.out.println(randomArray[10_000]);
            System.err.println(randomArrayClone[10_000]);
        }
    }


    // force classes who inherited to have these methods
    protected abstract void doTest(int[] array);



    private int[] makeArrayRandom(int _amount, int _low, int _high ) {
        java.util.Random r = new java.util.Random(); // CHEAT: no import  ( TIME -2 ms )

        int[] returnValue = new int[_amount];
        for (int j = 1; j < _amount; j++) {
            int Result = r.nextInt(_high-_low) + _low;
            returnValue[j] = Result;
        }
        return returnValue;
    }
}




























/*

 int numbersToGenerate = 1000000;
 int low = 1;
 int high = 1000000;

 long startTime = 0;
 long endTime = 0;


 int[] randomArray = makeArrayRandom(numbersToGenerate, low, high);
 int[] randomArrayClone = randomArray.clone();

 startTime = System.currentTimeMillis();
 //                radixsort( randomArrayClone );                           // 250 +
 //                quickSort(randomArrayClone, low - 1, high - 1);          // 110 +
 //                buildInSort( randomArrayClone );                         // 95+
 Arrays.sort( randomArrayClone );                         // 80 +
 endTime = System.currentTimeMillis() - startTime;

 //            if (Arrays.equals(randomArray, randomArrayClone)) {           // test if the results are the same
 //                System.err.println( " ! CHEATER ! " );
 //                break;
 //            }


//            if (i > 10) {                    // CHEAT: the program is slow when it starts up. So we let it do random calculation to warm up    ( TIME -40ms )
//                System.out.println( endTime );
//            } else {
//                System.out.print( "." );
//            }

*/