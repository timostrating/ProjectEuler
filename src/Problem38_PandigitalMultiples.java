/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem38_PandigitalMultiples extends Problem {
    public static void main(String[] args) {
        int maxPandigital  = 987654321;
        int ans  = 0;

        for(int i=1; i<9999; i++) {  // we must take the concatenating of the sums   we know  maxLength = 9     We also must let the while loop minimally loop twice
            String text = "";
            int j = 1;
            while (text.length() < 9){
                text += i * j;
                j++;
            }

            if (text.length() == 9) {
                int value = Integer.parseInt(text);
                if (haveSameDigits(maxPandigital, value)) {
                    if (value > ans) {
                        System.out.println(i + " : " + text);
                        ans = value;
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("ans = " +ans);
    }
}



/*

Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where  n > 1?

 */