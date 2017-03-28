import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem049_PrimePermutations extends Problem{
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i=1_500; i < 10_000; i++)
            if(isPrime(i))      //  9000 -> 1061
                primes.add(i);

        for (int i=0; i < primes.size(); i++) {  // LOOP List
            for (int j=4500; j>3; j-=2) { // (10_000-1000) / 2
                int value = primes.get(i);  // cache value
                if (primes.contains( (value+j) ) && primes.contains( (value+(j*2)) ))  // value+j  AND  value(j/b) must be prime
                    if ( haveSameDigits (value, value+j) && haveSameDigits (value, value+(j*2)) )   // they also must have the same Digits
                        System.out.println("DAMN  " + primes.get(i) +" "+(value+(j*2))+" "+(value+j) +"   +"+j);
            }
        }
    }
}
