/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem28_NumberSpiralDiagonals {
    public static void main(String[] args) {
        final int SIZE = 1001;
        long ans = 1;

        for(int i=3; i<=SIZE; i+=2) {
            long pow = (int)Math.pow(i, 2);

            ans += pow;
//            System.out.println(pow);
            for(int j=1; j<=3; j++) {
//                System.out.println(pow - (i-1)*j);
                ans += pow - (i-1)*j;
            }
        }

        System.out.println("ans = " + ans);  // 669171001
    }
}


/*
    1001 * 1001  =  1002001

    1002001 / 2  = 501.000.5 ~ 501001

    5 * 5  =  25,   325,
    3 * 3  =  9,    45,     25
 */