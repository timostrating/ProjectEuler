/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem030_DigitFifthPowers {
    public static void main(String args[]) {
        int ans = 0;

        for (int i=2; i < 999999; i++) {  // while true
            int value = 0;
            String numberString = "" + i;
            for (int j = 0; j < numberString.length(); j++)   // loop each char in our numberString
                value += Math.pow( Character.getNumericValue( numberString.charAt(j) ), 5);     // we add this char ^ 5 to the total value
            if ( value == i )   // if our total value == our current number
                System.out.println( ans += value );     // bad way to do this but it works
        }
    }
}
