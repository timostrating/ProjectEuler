/**
 * Created by Sneeuwpopsneeuw on 05-Sep-16.
 */
public class Problem179_ConsecutivePositiveDivisors extends Problem {  // TODO: Problem179_ConsecutivePositiveDivisors
    public static void main(String[] args) { new Problem179_ConsecutivePositiveDivisors().start(); }
    public void start() {
//        int n=1, m=0, output=0;
//
//        for (int i=13; i < 15; i++) {
//            m = getAmountOfDividers(i+1);
//
//            if (n == m)
//                output++;
//
//            if (i % 10000 == 0)
//                System.out.print(".");
//
//            n = m;
//        }
//
//        System.out.println("");
//        System.out.println(output);

        System.out.println( getAmountOfDividers(14) );
        System.out.println( getAmountOfDividers(15) );
    }

    public int getAmountOfDividers(int value) {
        return 999;
    }
}


/*

Find the number of integers 1 < n < 107, for which n and n + 1 have the same number of positive divisors.
For example, 14 has the positive divisors 1, 2, 7, 14 while 15 has 1, 3, 5, 15.

 */
