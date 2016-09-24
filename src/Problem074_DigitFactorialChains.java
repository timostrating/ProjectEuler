import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 28-Aug-16.
 */
public class Problem074_DigitFactorialChains extends Problem {
    public static void main(String[] args) {
        ArrayList<BigInteger> map = new ArrayList<>();
        int ans = 0;

        int[] factorials = new int[10];
        for(int i=0; i<factorials.length; i++) {
            factorials[i] = factorial(i);
//            System.out.println(factorials[i]);
        }

        for (int i=1; i<1_000_000; i++) {

            int counter = 1;
            BigInteger value = new BigInteger(""+i);
            while (true) {
                String text = value.toString();

                map.add(value);
                value = new BigInteger("0");

                for (int j=0; j<text.length(); j++) {
                    BigInteger factorialPart = new BigInteger(""+ factorial( Character.getNumericValue(text.charAt(j)) ) );
                    value = value.add( factorialPart );
                }

                if (map.contains(value))
                    break;
                else
                    counter ++;
            }

            if(counter == 60) {
                ans++;
                System.out.println("~~~~~~");
            }

            map.clear();
        }

        System.out.println("ans = " + ans);
    }
}
