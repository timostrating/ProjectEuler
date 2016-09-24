/**
 * Created by Sneeuwpopsneeuw on 23-Aug-16.
 */
public class Problem145_ReversibleNumbers {
    public static void main(String[] args) {
        long ans = 0;

        for(long i=0; i<1_000_000_000L; i++) {
            if (i % 10 == 0 )
                continue;

            long reverse = Long.parseLong(new StringBuilder(("" + i)).reverse().toString());
            long value = i + reverse;

            if (consistsEntirelyOfOddDigits(value)) {
                if(ans % 5000 == 0)
                    System.out.println(i + " " + reverse + " " + value);
                ans++;
            }
        }

        System.out.println("ans = "+ans);
    }

    private static boolean consistsEntirelyOfOddDigits(long x) {
        String text = ""+x;

        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) == '0' || text.charAt(i) == '2' || text.charAt(i) == '4' || text.charAt(i) == '6' || text.charAt(i) == '8')
                return false;
        }

        return true;
    }


}










/*

    Some positive integers n have the property that the sum [ n + reverse(n) ] consists entirely of odd (decimal) digits.
    For instance, 36 + 63 = 99 and 409 + 904 = 1313. We will call such numbers reversible; so 36, 63, 409, and 904 are reversible.
    Leading zeroes are not allowed in either n or reverse(n).

    There are 120 reversible numbers below one-thousand.
    How many reversible numbers are there below one-billion (109)?

 */