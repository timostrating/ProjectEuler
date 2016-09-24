/**
 * Created by Sneeuwpopsneeuw on 27-Apr-16.
 */
public class Problem6_SumSquareDifference {
    public static void main(String args[]) {
        int amount = 100;
        long a = 0;
        long b = 0;

        for (int i=0; i<=amount; i++) {
            a += i*i;
        }

        for (int i=0; i<=amount; i++) {
            b += i;
        }
        b *= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("antwoord = " + (b - a));
    }
}
