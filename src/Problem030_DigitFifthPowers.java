/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem030_DigitFifthPowers {


    public static void main(String args[]) {
        final byte FIVE = 5; // five six
        int ans = 0;

        for (int i = 2; i < 999999; i++) {

            int value = 0;
            String numberString = "" + i;
            for (int j = 0; j < numberString.length(); j++) {
                value += Math.pow( Character.getNumericValue( numberString.charAt(j) ), FIVE);
            }
            if ( value == i ) {
                ans += value;
                System.out.println(value);
            }

        }

        System.out.println("");
        System.out.println(ans);
    }
}
