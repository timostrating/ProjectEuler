/**
 * Created by Sneeuwpopsneeuw on 27-Apr-16.
 */
public class Problem006_SumSquareDifference {
    public static void main(String args[]) {
        int amount = 100;
        long a = 0, b = 0;

        for (int i=0; i <= amount; i++)
            a += i*i;

        for (int i=0; i <= amount; i++)
            b += i;

        b *= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("ans = " + (b - a));
    }
}


/*
   The sum of the squares of the first ten natural numbers is,
                          1^2 + 2^2 + ... + 10^2 = 385

   The square of the sum of the first ten natural numbers is,
                       (1 + 2 + ... + 10)^2 = 55^2 = 3025

   Hence the difference between the sum of the squares of the first ten
   natural numbers and the square of the sum is 3025 385 = 2640.

   Find the difference between the sum of the squares of the first one
   hundred natural numbers and the square of the sum.
 */