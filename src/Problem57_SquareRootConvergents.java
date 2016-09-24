import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem57_SquareRootConvergents {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(3,2);
        Fraction oldFraction = new Fraction(1,1);
        Fraction tmpFraction = new Fraction(1,1);
        long ans = 0, startTime = System.currentTimeMillis();


        for(int i=1; i < 1000; i++) {
            tmpFraction.setdata( fraction.A, fraction.B );                  // tmp = new

            fraction.multiply( 2 );                                         // new = new *2
            fraction.add( oldFraction );                                    // new = new + old

            if (fraction.A.toString().length() > fraction.B.toString().length())    // numerator > denominator
                ans ++;

            oldFraction.setdata( tmpFraction.A, tmpFraction.B );            // old = tmp
        }

        System.out.println("ans = "+ans);
        System.out.println("Time = "+(System.currentTimeMillis() - startTime)+"ms");
    }


    private static class Fraction {   // BigInteger fraction class, just here to make it more readable
        public BigInteger A;
        public BigInteger B;

        public Fraction(int a, int b)   {  A = new BigInteger(""+a);  B = new BigInteger(""+b);  }
        public void multiply(int i)     {  A = A.multiply( new BigInteger(""+i) );  B = B.multiply( new BigInteger(""+i) );  }
        public void add(Fraction frac)  {  A = A.add( frac.A );  B = B.add( frac.B );  }

        public void setdata(BigInteger a, BigInteger b)  {  A = a;  B = b;  }
    }
}
