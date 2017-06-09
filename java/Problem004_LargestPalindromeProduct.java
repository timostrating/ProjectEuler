/**
 * Created by Sneeuwpopsneeuw on 24-Feb-16.
 */
public class Problem004_LargestPalindromeProduct {
    public static void main (String args[]) {
        for (int i=999; i > 750; i--) {
            for (int j=999; j > 750; j--) {
                String a = i * j + "";
                if (a.charAt(0) == a.charAt(5) && a.charAt(1) == a.charAt(4) && a.charAt(2) == a.charAt(3))
                    System.out.println(i + " * " + j + " = " + a);
            }
        }
    }
}


/*
   A palindromic number reads the same both ways. The largest palindrome made
   from the product of two 2-digit numbers is 9009 = 91 * 99.

   Find the largest palindrome made from the product of two 3-digit numbers.
 */