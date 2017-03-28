/**
 * Created by Sneeuwpopsneeuw on 22-Aug-16.
 */
public class Problem112_BouncyNumbers {
    public static void main(String[] args) {
        int bouncyAmount = 0;
        int start = 100;

        for (int i=start; i<2_999_999; i++) {
            if (isIncreasing(i))        { System.out.println(" --> "+i); }
            else if(isDecreasing(i))    { System.out.println(" <-- "+i); }
            else {
                bouncyAmount++;
                System.out.println("  ~  "+i);

                if ((bouncyAmount / (double)(i)) >= 0.99d) {
                    System.out.println("           = "+i);
                    return;
                }
            }
        }

    }

    private static boolean isIncreasing(int x) {
        String text = ""+x;
        boolean flag = false;
        for (int j=0; j < text.length()-1; j++) {
            if (Character.getNumericValue( text.charAt(j)) > Character.getNumericValue( text.charAt(j+1)))
                return false;
        }

        return true;
    }

    private static boolean isDecreasing(int x) {
        String text = ""+x;
        boolean flag = false;
        for (int j=0; j < text.length()-1; j++) {
            if (Character.getNumericValue( text.charAt(j)) < Character.getNumericValue( text.charAt(j+1)))
                return false;
        }

        return true;
    }
}


/*

    Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; for example, 134468.
    Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 66420.
    We shall call a positive integer that is neither increasing nor decreasing a "bouncy" number; for example, 155349.

    Clearly there cannot be any bouncy numbers below one-hundred, but just over half of the numbers below one-thousand (525) are bouncy.
    In fact, the least number for which the proportion of bouncy numbers first reaches 50% is 538.
    Surprisingly, bouncy numbers become more and more common and by the time we reach 21780 the proportion of bouncy numbers is equal to 90%.
    Find the least number for which the proportion of bouncy numbers is exactly 99%.

 */