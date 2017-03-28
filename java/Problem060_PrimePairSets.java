/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem060_PrimePairSets extends Problem {  // TODO: Problem060_PrimePairSets  does not sound hard  -- Primes
    public static void main(String[] args) { new Problem060_PrimePairSets().start(); }
    public void start() {
        System.out.print( isConcatenatedPrimeArray( new int[] {3, 7, 109, 673, 1024} ) );
    }

    private boolean isConcatenatedPrimeArray(int[] myArray) {
        int counter = 0;
        for (int i=0; i < myArray.length; i++)
            for (int j=i; j < myArray.length; j++)
                if (isConcatenatedPrime(myArray[i], myArray[j]))
//                    System.out.println("i = "+myArray[i]+"   j = "+myArray[j] +"   == "+myArray[i]+myArray[j] +" "+myArray[j]+myArray[i]);
                    counter ++;

        System.out.println(counter +" : "+ factorial(myArray.length - 1));

        return (counter >= factorial(myArray.length - 1));
    }

    private boolean isConcatenatedPrime(int a, int b) {
        return (isPrime( Integer.parseInt(concatenate(a, b)) ) && isPrime( Integer.parseInt(concatenate(b, a)) ));
    }
}



/*

The primes 3, 7, 109, and 673, are quite remarkable. By taking any two primes and concatenating them in any order the result will always be prime. For example,
taking 7 and 109, both 7109 and 1097 are prime. The sum of these four primes, 792, represents the lowest sum for a set of four primes with this property.

Find the lowest sum for a set of five primes for which any two primes concatenate to produce another prime.

 */
