/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem052_PermutedMultiples extends Problem {
    public static void main(String[] args) {
        final int SIZE = 999_999;

        for(int i=10; i<SIZE; i++) {
            if( haveSameDigits(i, i*2)  &&  haveSameDigits(i*2, i*3)  &&  haveSameDigits(i*3, i*4)  &&  haveSameDigits(i*4, i*5)  &&  haveSameDigits(i*5, i*6))
                System.out.println("wow " + i + " " + i*2+ " " + i*3+ " " + i*4+ " " + i*5+ " " + i*6);
        }
    }
}
