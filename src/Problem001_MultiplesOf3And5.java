/**
 * Created by Sneeuwpopsneeuw on 28-Feb-16.
 */
public class Problem001_MultiplesOf3And5 {
    public static void main(String args[]) {

        int i = 999;
        int sum = 0;

        do {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
            i--;
        } while (i > 1);

        System.out.println(sum);
    }
}
