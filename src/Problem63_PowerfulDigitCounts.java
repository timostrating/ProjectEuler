import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 10-Aug-16.
 */
public class Problem63_PowerfulDigitCounts {

    public static void main(String[] args) {
        long ans = 0;

        for (int p=1; p < 1_000; p++) {  // power
            BigInteger value = new BigInteger("0");

            for (int i=1; i<=10; i++) {
                value = new BigInteger(""+i).pow(p);
//                System.out.println(value+" : "+p);

                if (value.toString().length() == p) {
                    ans++;
                    System.out.println(value +" = "+i+"^"+p);
//                    break;    // damn text you need to read it AND UNDERSTAND IT
                }
            }
        }

        System.out.println("ans = " + ans);
    }
}
