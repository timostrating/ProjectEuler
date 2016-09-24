import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem48_SelfPower {


    public static void main(String[] args) {

        BigInteger ans = new BigInteger("0");

        for (int i = 1; i <= 1000; i++) {
            BigInteger value = new BigInteger(""+i);
            value = value.pow(i);
            ans = ans.add(value);
            System.out.println("value = " + value);
        }

        System.out.println("ans = " + ans);
    }
}
