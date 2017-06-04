/**
 * Created by Sneeuwpopsneeuw on 23-Feb-16.
 */
public class Problem002_EvenFibonacciNumbers {
    public static void main (String args[]) {
        int first = 1, second = 1, third = 1;
        int total = 0;

        while (third < 4_000_000) {
			third = first + second;
			first = second;
			second = third;

			if (second % 2 == 0)
				total += second;
		}

		System.out.println("ans = " + total);
    }
}