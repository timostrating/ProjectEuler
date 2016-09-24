/**
 * Created by Sneeuwpopsneeuw on 17-Aug-16.
 */
public class Problem66_DiophantineEquation {  // TODO Problem66_DiophantineEquation   !  gives the wrong answer  !
    public static void main(String[] args) {
        double value = 0D;
        long ans = 0;

        for(long d=2; d <= 1000; d++) {
            if( Math.sqrt(d) == Math.floor( Math.sqrt(d)) )
                continue;

            for(long y=1; y < Long.MAX_VALUE; y++) {
                value = Math.sqrt( (d*Math.pow(y,2))+1L );  //  x = sqrt( Dy^2 +1 )
//                System.out.println(" -- v = " + value + "     i = " + i + "     j = " + j);
                if (value == Math.floor(value)) {
                    System.out.println("x = " + (long) value + "     D = " + d + "     y = " + y);
                    if (secondTest(d, value)) {
                        if ((long) value > ans) {
                            ans = (long) value;
                            System.out.println(" -- x = " + (long) value + "     D = " + d + "     y = " + y);
                        }
                    }

                    break;
                }
            }
        }

        System.out.println("ans = "+ans+"    "+Integer.MAX_VALUE+" "+Double.MAX_VALUE+" "+Long.MAX_VALUE);
    }


    public static boolean secondTest(long d, double value) {
        for(long x=2; x < Long.MAX_VALUE; x++) {
//            if (Math.pow(x, 2) % d == 1) {
                double tmp = (Math.pow(x, 2)-1) / d;
                if ( Math.sqrt(tmp) == Math.floor( Math.sqrt(tmp) )) {
                    return (x == (long)value);
                }
//            }
        }


        return false;
    }
}






/*

    x^2 - Dy^2  =  1
    x^2 - Dy^2 -1  =  0
    - Dy^2 -1  =  - x^2
    Dy^2 +1  =  x^2

    sqrt( Dy^2 +1 )  =  x




    x^2 - Dy^2  =  1
    x^2 - Dy^2 -1  =  0
    x^2 -1  =  Dy^2
    (x^2 -1) /D =  y^2
    sqrt( (x^2 -1) / D ) =  y

 */






