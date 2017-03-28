import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 18-Dec-16.
 */
public class Problem123_PrimeSquareRemainders extends Problem {   // TODO Problem123_PrimeSquareRemainders
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>();
        p.add(0);

        for (int i=1; i < 2_000_000; i++) {
            if (isPrime(i))
                p.add(i);
        }

        for (int n=1; n < 3000; n++) {
//            System.out.println( Math.pow( p.get(n)-1, n) +"  +  "+ Math.pow( p.get(n)+1, n));
            System.out.println( Math.pow( p.get(n)-1, n) +"  +  "+ Math.pow( p.get(n)+1, n) +"  =  "+ ( Math.pow( p.get(n)-1, n) + Math.pow( p.get(n)+1, n)) );
//            System.out.println( Math.pow( p.get(n)-1, n) +"  +  "+ Math.pow( p.get(n)+1, n) +"  /  p[n]^2  =  "+ ( Math.pow( p.get(n)-1, n) + Math.pow( p.get(n)+1, n) / Math.pow(p.get(n), 2) ));
            System.out.println( "" );
        }
    }
}

