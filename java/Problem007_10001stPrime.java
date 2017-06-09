/**
 * Created by Sneeuwpopsneeuw on 12-Apr-16.
 */
public class Problem007_10001stPrime {

    public static void main (String args[]) {
        magic();
    }
    public static void magic() {
        long max = 999999999;   // if it goes wrong it will stop here
        int m = 1;              // number
        int counter = 0;        // amount of counters

        for (int i = 2; i <= max; i++) {        // bijna infinite loop met build in stop
            counter = 0;
            for (int n = 2; n < i; n++)
                if (i % n == 0)
                    counter++;

            if (counter == 0) {                 // dit is een prime
                System.out.println(m+" : "+i);
                m++;
            }

            if (m == (10001 + 1)) {             // als we bij de nummertje 10001 zijn geef het antwoord
                System.out.println("Answere = " + i);
                break;
            }
        }
    }
}


/*
   By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6^th prime is 13.

   What is the 10001^st prime number?
 */