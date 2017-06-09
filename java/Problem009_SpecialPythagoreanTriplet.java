/**
 * Created by Sneeuwpopsneeuw on 09-Aug-16.
 */
public class Problem009_SpecialPythagoreanTriplet {
    public static void main (String args[]) {
        for (int a=1; a < 1000; a++) {
            for (int b=1; b < 1000; b++) {
                for (int c=1; c < 1000; c++) {

                    if ( a + b + c == 1000 ) {                  //  a + b + c = 1000
                        if (a < b  &&  b < c) {                 //  a < b < c
                            if (a * a + b * b == c * c) {       //  a^2 + b^2 = c^2
                                System.out.println("DAMN: " + a + " " + b + " " + c);
                                System.out.println("____: " + a * b * c);

                                return;
                            }
                        }
                    }

                }
            }
        }
    }
}


/*
   A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
                                a^2 + b^2 = c^2

   For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
   There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 */