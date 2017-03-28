/**
 * Created by Sneeuwpopsneeuw on 11-Aug-16.
 */
public class Problem301_Nim {
    public static void main(String[] args) {
//        long ans = 0;
//
//        for (long i=1; i <= (long)Math.pow(2, 30); i++) {
//            System.out.print(i+" / "+(long)Math.pow(2, 30) + "    ");
//            ans += (X(i, 2*i, 3*i)) ? 1 : 0;
//        }
//
//        System.out.println("ans = " + ans);

        long a = 0;
        long b = 1;
        for (int i=0; i <= (30+1); i++) {
            long tmp = a + b;
            a = b;
            b = tmp;
        }
        System.out.println("ans = "+a);
    }

//    private static boolean X(long n1, long n2, long n3)  {
//        BigInteger bn1 = new BigInteger( Long.toBinaryString(n1) );
//        BigInteger bn2 = new BigInteger( Long.toBinaryString(n2) );
//        BigInteger bn3 = new BigInteger( Long.toBinaryString(n3) );
//        BigInteger total = bn1.add(bn2).add(bn3);
//
//        System.out.println(bn1+"  "+bn2+"  "+bn3+"    "+ total + " : " + (total.longValue() % 2 == 0));
//
//        return (total.longValue() % 2 == 0);
//    }
}


/*

- At the start of the game there are three heaps of stones.
- On his turn the player removes any positive number of stones from any single heap.
- The first player unable to move (because no stones remain) loses.

 */
