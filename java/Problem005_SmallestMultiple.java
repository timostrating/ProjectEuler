public class Problem005_SmallestMultiple {
    public static void main (String args[]) { new Problem005_SmallestMultiple(); }

    public Problem005_SmallestMultiple() {
        int number = 1;
        for (int i=1; i<20; i++)
            number = lcm(number, i);

        System.out.println(number);
    }

    int gcd(int m, int n) {  // English  -  Greatest Common Divisor
        return (n == 0)? m : gcd(n, m % n);
    }   // Greatest  Common  Divisor
    int lcm(int m, int n) { return(m * n) / gcd(m, n); }            // Least     Common  Multiple
}


/*
   2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

   What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?
 */