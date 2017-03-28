/**
 * Created by Sneeuwpopsneeuw on 28-Feb-16.
 */
public class Problem001_MultiplesOf3And5 {
    public static void main(String args[]) {

        int max = 1000;                             // How many iterations we will do at max
        int sum = 0;                                // here we store the total sum

        for (int i=1; i < max; i++)                 // loop 1 to max
            if (i % 3 == 0 || i % 5 == 0)               // if we divide by 3 or 5 and it is a perfect division
                sum += i;                                   // we add our current index to the total sum

        System.out.println(sum);                    // print the total sum  =  233168
    }
}
