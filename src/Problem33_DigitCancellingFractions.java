/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem33_DigitCancellingFractions {
    public static void main(String[] args) {
        final int SIZE = 10;

        for(int i=1; i < SIZE; i++) {
            for(int j=1; j < SIZE; j++) {

                for(int k=1; k < SIZE; k++) {
                    for(int l=1; l < SIZE; l++) {
                        if (i >= k  &&  j >= l )
                            continue;

                        double value = ((i*10)+j) / (double)((k*10)+l);

                        if (value > 1D)
                            continue;

                        if (i == k)
                            if(value == j / (double)l)
                                System.out.println("i == k    "+i+" "+k+"    "+i+j+" / "+k+l);
                        if (i == l)
                            if(value == j / (double)k)
                                System.out.println("i == l    "+i+" "+l+"    "+i+j+" / "+k+l);

                        if (j == k)
                            if(value == i / (double)l)
                                System.out.println("j == k    "+j+" "+k+"    "+i+j+" / "+k+l);
                        if (j == l)
                            if(value == i / (double)k)
                                System.out.println("j == l    "+j+" "+l+"    "+i+j+" / "+k+l);

                    }
                }
            }
        }

        System.out.println("ans = ");
    }
}




/*

1/4
1/5
2/5
1/2


The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may
incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value,
and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

 */