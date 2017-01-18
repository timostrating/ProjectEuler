import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem029_DistinctPowers {
    public static void main(String[] args) {
        final int SIZE = 100;

        ArrayList<BigInteger> map = new ArrayList<>();
        BigInteger curVal;

        for(int a=2; a<=SIZE; a++) {
            for(int b=2; b<=SIZE; b++) {
                curVal = new BigInteger(""+a).pow(b);

                if (map.contains( curVal )) {
                    System.out.println( " * Map already contains this value * " );
                } else {
                    map.add( curVal );
                    System.out.println(curVal);
                }
            }
        }

        System.out.println("ans = " + map.size());   // 9183
}
}


/*

 */
