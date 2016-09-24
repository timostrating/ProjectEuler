/**
 * Created by Sneeuwpopsneeuw on 11-Aug-16.
 */
public class Problem92_SquareDigitChains {
    public static void main(String[] args) {
        long number = 1, value = 1, ans = 0;

        while (number <= 10_000_000) {
            String text = Long.toString(value);      // value to string
            value = 0;

            for (int i=0; i<text.length(); i++)       // string to value
                value += Math.pow( Character.getNumericValue( text.charAt(i) ), 2 );

            if(value == 89)
                ans++;

            if(value <= 1 || value == 89) {
                number++;
                value = number;
            }
        }

        System.out.println("ans = " + ans);
    }
}