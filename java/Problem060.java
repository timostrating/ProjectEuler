import java.util.HashSet;

/**
 * Created by Sneeuwpopsneeuw on 20-Mrt-18.
 */
public class Problem060 extends Problem {
    public static void main(String[] args) {
        int primeCounter = 0;
        for (int i=0; i < 1_000_000; i++)
            if (isPrime(i))
                primeCounter++;


        HashSet<Integer> primes = new HashSet<>();
        for (int i=0; i < 1_000_000; i++)
            if (isPrime(i))
                primes.add(i);

        long startTime = System.nanoTime();
        if (primes.contains(104729))
            System.out.println(System.nanoTime() - startTime + " nanotime");



        HashSet<Integer> primes2 = new HashSet<>();
        for (int i=0; i < 1_000_000; i++)
            if (isPrime(i))
                primes2.add(i);

        long startTime2 = System.nanoTime();
        if (primes2.contains(104729))
            System.out.println(System.nanoTime() - startTime2 + " nanotime");
    }
}