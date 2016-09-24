/**
 * Created by Sneeuwpopsneeuw on 23-Feb-16.
 */
public class Problem3_LargestPrimeFactor {
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
