/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem12_HighlyDivisibleTriangularNumber {


    public static void main(String args[]) {
        long cur = 1;
        long n = 2;
        long dividors = 0;

        while( dividors < 500 ) {

            System.out.print(cur + ", ");

            dividors = 0;
            for ( long i = 1; i <= Math.sqrt(cur); i++) {
                if (cur % i == 0) {
                    System.out.print(i + ", ");
                    dividors++;
                }
            }

            System.out.println("    = " + dividors);

            dividors *= 2;  // Math.sqrt(n) hold 50% of the dividors   form wiki
            cur += n;
            n ++;
        }

        System.out.println("");
        System.out.println(" ^^^^^^^ ");

    }
}
