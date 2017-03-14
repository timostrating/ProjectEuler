/**
 * Created by Sneeuwpopsneeuw on 07-Sep-16.
 */
public class Problem357_PrimeGeneratingIntegers extends Problem{  // TODO: Problem357_PrimeGeneratingIntegers
    public static void main(String[] args) { new Problem357_PrimeGeneratingIntegers().start(); }
    private void start() {
        long counter = 0;
        for (int i=0; i <= 100_000_000; i++)
            if (isEveryDivisorPrime(i))
                counter += i;

        println(counter);
    }

    private boolean isEveryDivisorPrime(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                if (isPrime(i + num / i) == false  &&  isPrime((num/i) + num / (num/i)) == false)   // d+30/d is prime
                    return false;

        return true;
    }
}




/*

Consider the divisors of 30: 1,2,3,5,6,10,15,30.
It can be seen that for every divisor d of 30, d+30/d is prime.

Find the sum of all positive integers n not exceeding 100 000 000
such that for every divisor d of n, d+n/d is prime.

 */