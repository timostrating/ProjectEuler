import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem36_DoubleBasePalindromes {  // used c#
    public static void main(String[] args) {
        final int SIZE = 1_000;
        long ans = 0;
        BigInteger value;


        for(int i=1; i<SIZE; i++) {
            System.out.println(Integer.toString(i, 2));
        }

        System.out.println("ans = " + ans);
    }
}


/*

 */