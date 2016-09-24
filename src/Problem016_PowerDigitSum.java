import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem016_PowerDigitSum {


    public static void main(String args[]) {

        BigInteger n = new BigInteger("2");

        n = n.pow(1000);

        String text = n.toString();
        System.out.println(text);

        long ans = 0;
        for (int i = 0; i < text.length(); i ++) {
            ans += Character.getNumericValue( text.charAt(i) );
            System.out.print(Character.getNumericValue( text.charAt(i) ) + " + ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println(ans);
    }
}
