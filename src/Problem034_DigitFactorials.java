/**
 * Created by Sneeuwpopsneeuw on 10-Aug-16.
 */
public class Problem034_DigitFactorials extends Problem {

    public static void main(String args[]) {
        int ans = 0;

        for (int i = 3; i < 999_999; i++) {
            int value = 0;
            String numberString = "" + i;
            for (int j = 0; j < numberString.length(); j++) {
                value += factorial(Character.getNumericValue( numberString.charAt(j) ));
            }
            if ( value == i ) {
                ans += value;
                System.out.println(value);
            }
        }

        System.out.println(ans);
    }
}
