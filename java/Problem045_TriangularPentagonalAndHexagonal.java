import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 12-Aug-16.
 */
public class Problem045_TriangularPentagonalAndHexagonal {
    public static void main(String[] args) {
        final int SIZE = 100_000;

        ArrayList<Long> tMap = new ArrayList<>();
        ArrayList<Long> pMap = new ArrayList<>();
        ArrayList<Long> hMap = new ArrayList<>();

        for (long n=0; n<SIZE; n++) {
            tMap.add( n*(n+1L)/2L );
//                System.out.print(n*(n+1L)/2L +" ");         //  Tn= n(n+1)/2
            pMap.add( n*(3L*n-1L)/2L );
//                System.out.print(n*(3L*n-1L)/2L +" ");      //  Pn= n(3n−1)/2
            hMap.add( n*(2L*n-1));
//                System.out.println(n*(2L*n-1L) +" ");       //  Hn= n(2n−1)
        }

        for (int n=286; n<SIZE; n++) { // we skip to 286
            Long value = tMap.get(n);         // this is a Triangle
            if( pMap.contains(value) ) {      // is this a Pentagonal
                if (hMap.contains(value)) {   // is this a Hexagonal
                    System.out.println("ans = " + value);
                    return;
                }
            }

        }
    }
}


/*
    Triangle	 	    Tn= n(n+1)/2	    1, 3, 6, 10, 15, ...    55385
    Pentagonal	 	    Pn= n(3n−1)/2	    1, 5, 12, 22, 35, ...   31977
    Hexagonal	 	    Hn= n(2n−1)	 	    1, 6, 15, 28, 45, ...   27693
*/