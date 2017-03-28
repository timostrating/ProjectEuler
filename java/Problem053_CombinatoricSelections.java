import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem053_CombinatoricSelections extends Problem {
    public static void main(String[] args) {
        final int SIZE = 100;
        long ans = 0;

        for(int n=1; n <= SIZE; n++) {
            for(int r=n; r >= 0; r--) {
                int value = nCr(n,r);
                if (value > 1_000_000) {
                    ans++;
                }
                System.out.println(value+" "+n+" "+r);
            }
        }

        System.out.println("ans = " + ans);
    }

    private static int nCr(int n, int r) {
        BigInteger bigN = new BigInteger(""+n);
        BigInteger bigR = new BigInteger(""+r);
        return nCr(bigN, bigR);
    }

    private static int nCr(BigInteger n, BigInteger r) {
        String nCrString = ( factorial( n ).divide( factorial( r ).multiply( factorial( n.subtract(r))))).toString(); // nCr = n! / (r!(n-r)!)
        if (nCrString.length() > 6) return Integer.MAX_VALUE;   // SLOPPY check if we are around or above the max integer value
        return Integer.parseInt(nCrString);
    }
}
