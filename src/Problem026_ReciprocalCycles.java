import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 11-Aug-16.
 */
public class Problem026_ReciprocalCycles {
    public static void main(String[] args) {
        int ansValue = 0, ansI = 0, tmp = 0;

        for (int i=2; i < 1000; i++) {
            if( (1000D % i == 0) == false ) {  // 0,5  0.25 ....    excluded
                if( (i % 16 == 0) == false ) {  //  /16  /32  /64    excluded
                    if( (i % 10 == 0) == false ) {  // the recurring cycle of 6 = 60
                        System.out.println(i + " : " + 1D / (double) i); // prints  7 : 0.14285714285714285

                        tmp = damn( i );
                        if (tmp > ansValue) {
                            ansValue = tmp;
                            ansI = i;
                        }

                        System.out.println( "   "+tmp );
                    }
                }
            }
        }

        System.out.println("ansValue = "+ansValue+"   ansI = "+ansI);
    }

    private static int damn(int x) {
        ArrayList<Integer> map = new ArrayList<>();
        String text = "";
        int value = 1, subtraction = 0;
        boolean firstTime = false;

        for (int i=1; i < 999_999; i++) {

            if (value / x > 1) {
                if (firstTime) {
                    subtraction = i;
                    firstTime = false;
                }
                if (map.contains(value))
                    return i - subtraction;

                map.add(value);
                value = value % x;  // keep remainder
            }

            value *= 10;        // shift
        }

        return 1;
    }
}


/*

 */