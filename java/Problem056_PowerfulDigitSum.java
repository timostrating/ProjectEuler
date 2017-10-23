import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem056_PowerfulDigitSum extends Problem {
    public static void main(String[] args) {
        final int SIZE = 100;
        long ans = 0;

        for(int a=0; a < SIZE; a++) {
            BigInteger bigA = new BigInteger(""+a);

            for(int b=0; b < SIZE; b++) {
                BigInteger value = bigA.pow( b );

                int sum = digitSum(value);
                if(sum > ans)
                    ans = sum;
            }
        }

        System.out.println(ans);
    }
}
