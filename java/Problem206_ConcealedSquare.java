import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 08-Apr-16.
 */
public class Problem206_ConcealedSquare {
    public static void main(String args[]) {

        BigInteger cur = new BigInteger("1000000000");  // <- ^2  .length() = 19

        while (true) {  // pls
            String curText = cur.pow(2).toString();  // "" + (long)Math.pow(cur, 2);

            if(curText.length() == 19) {
                if( '1' == curText.charAt(0) && '2' == curText.charAt(2) && '3' == curText.charAt(4) && '4' == curText.charAt(6) && '5' == curText.charAt(8) ) {
                    System.out.println(cur + " : " + curText);  // show we do something

                    if ('6' == curText.charAt(10) && '7' == curText.charAt(12) && '8' == curText.charAt(14) && '9' == curText.charAt(16) && '0' == curText.charAt(18)) {
                        System.out.println("ans = "+ cur + " : " + curText);  // ans found
                        return;
                    }
                }
            }
            else return;

            cur = cur.add(new BigInteger("10"));  // 1_2_3_4_5_6_7_8_9_0 as you see the answer must end on a 0 so it can only be a multiple of 10
        }
    }
}



//      __THIS_STUFF_DID_NOT_WORK__

//  1_2_3_4_5_6_7_8_9_0

//  final long MIN = 1121314151617181910L;
//  final long MAX = 1929394959697989990L;
//  long cur = (long)Math.sqrt(MIN) + 1;

//  final BigInteger MIN = new BigInteger("1121314151617181910");
//  final BigInteger MAX = new BigInteger("1929394959697989990");
//  final BigInteger MAXSQRT = new BigInteger("1400000");  // sqrt( MAX );