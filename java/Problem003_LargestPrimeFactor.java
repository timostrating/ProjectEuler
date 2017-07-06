/**
 * Created by Sneeuwpopsneeuw on 23-Feb-16.
 */
public class Problem003_LargestPrimeFactor {
    public static void main (String args[]) {
        long N = 600851475143L;
        long p = 2;

        while (N > p*p) {
            if(N % p == 0) {
                System.out.println(p);
                N = N /p;
            } else {
                p++;
            }
        }
        System.out.println("ans = " +N);
    }
}


/*
   The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143 ?
 */