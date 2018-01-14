/**
 * Created by Sneeuwpopsneeuw on 29-Mar-16.
 */
public class Problem014_LongestCollatzSequence {
    public static void main(String args[]) {
        long getal = 1000000;
        int teller = 0;
        int highestTeller = 0;

        for (long i=getal; i > 5; i--) {
            getal = i;
            teller = 0;
            do {
                getal = ((getal % 2 == 0))? getal / 2 : getal * 3 + 1;
                teller++;
            } while (getal > 1);

            if(teller >= highestTeller) {
                highestTeller = teller;
                System.out.println(i + " : " + highestTeller);
            }
        }
    }
}