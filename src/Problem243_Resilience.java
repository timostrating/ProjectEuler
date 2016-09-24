import java.util.Random;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem243_Resilience extends Problem {  // TODO: Problem243_Resilience   it works but it is far far to slow to find the answer
    public static void main(String[] args) {
        Random random = new Random();

        for(int i=4; i < Integer.MAX_VALUE; i++) {
            if (R(i) < (15499D / 94744D)) {  // 15499D / 94744D
                System.out.println("");
                System.out.println("ans = " + i);
                break;
            }
//            else { i += random.nextInt(10_000); }
        }
    }


    public static double R(int d) {  //
        int numerator = 2;
        int denominator = d-1;

        if ( isPrime(d) ) {
            return 1;
        } else {
            for (int i=1; i <= denominator; i++) {
                numerator ++;
                for (int j=i; j > 1; j--) {
                    if(i % j == 0  &&  d % j == 0) {
                        numerator --;
                        break;
                    }
                }
            }
        }

        System.out.println("numerator = "+numerator);
        System.out.println("denominator = "+denominator);
        System.out.println("");

        return( (double)numerator / (double)denominator );
    }

//    1/12 , _2/12_ , _3/12_ , _4/12_ , 5/12 , _6/12_ , 7/12 , _8/12_ , _9/12_ , _10/12_ , 11/12



//    protected class fraction {   // if more precision is needed we would switch to a fraction class containing two  int's || long's
//        int numerator;
//        int denominator;
//
//        public fraction(int numerator, int denominator) {
//            this.numerator = numerator;
//            this.denominator = denominator;
//        }
//    }
}





/*

//            for (int i=1; i <= denominator; i++) {
//                numerator ++;
//                for (int j=i; j > 1; j--) {
//                    if(i % j == 0  &&  d % j == 0) {
//                        numerator --;
//                        break;
//                    }
//                }
//            }


    A positive fraction whose numerator is less than its denominator is called a proper fraction.
    For any denominator, d, there will be d−1 proper fractions; for example, with d = 12:
    1/12 , 2/12 , 3/12 , 4/12 , 5/12 , 6/12 , 7/12 , 8/12 , 9/12 , 10/12 , 11/12 .

    We shall call a fraction that cannot be cancelled down a resilient fraction.
    Furthermore we shall define the resilience of a denominator, R(d), to be the ratio of its proper fractions that are resilient; for example, R(12) = 4/11 .
    In fact, d = 12 is the smallest denominator having a resilience R(d) < 4/10 .

    Find the smallest denominator d, having a resilience R(d) < 15499/94744 .

 */