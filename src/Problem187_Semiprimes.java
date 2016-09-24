/**
 * Created by Sneeuwpopsneeuw on 09-Sep-16.
 */
public class Problem187_Semiprimes extends Problem{  // TODO: Problem187_Semiprimes   far to heavy loops
    public static void main(String[] args) {
        long ans = 0;

        for(int i=0; i < 100_000_000; i++) {  // loop 50% of size        ~ 50.000
            if (isPrime(i) == false)
                ans++;
        }

        System.out.println("ans = " + ans);
    }
}







/*

        final long SIZE = 100_000;
        long ans = 0;

        ArrayList<Integer> map = new ArrayList<>();
        ArrayList<Long> ansMap = new ArrayList<>();

        for(int i=0; i < (SIZE/2); i++) { // minPrime/2\ * maxprime/50_000_000\ is the largest value before we exceed 10^8
            if (isPrime(i))
                map.add(i);

            if (i % 100_000 == 0)  // keep the user awake while we compute all the prime we are going to need
                System.out.print(".");
        }

        System.out.println("map.size() = "+map.size());

        for(int i=0; i < map.size(); i++) {  // loop 50% of size        ~ 50.000
            for(int j=0; j < map.size(); j++) {  // loop 50% of size        ~ 50.000            2_500_000_000  i
                long value = map.get(i) * map.get(j);
                String text = ""+value;

                if (ansMap.contains(value) == false) {
                    ansMap.add(value);
                    ans++;
                    System.out.println(ans+"  :  "+value);
                } else if (text.length() > 7 ) { break; }
            }
        }

        System.out.println("ans = " + ans);





A composite is a number containing at least two prime factors. For example, 15 = 3 × 5; 9 = 3 × 3; 12 = 2 × 2 × 3.

There are ten composites below thirty containing precisely two, not necessarily distinct, prime factors: 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.

How many composite integers, n < 108, have precisely two, not necessarily distinct, prime factors?

 */