/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem039_IntegerRightTriangles {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int ans = 0, counter = 0, pValue = 0;

        for(int p=1; p <= 1_000; p++) {

            for(int a=1; a < (p/2); a++) {
                for(int b=1; b < (p/2); b++) {

                    if( p - a - b == Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) ))  // p - a - b = c
                        counter++;
                }
            }

            if (counter > ans) {
                ans = counter;
                pValue = p;
            }

            counter = 0;
        }

        System.out.println("p = "+pValue+" ans = "+ans);
        System.out.println("Time : "+(System.currentTimeMillis() - startTime)+" ms");
    }
}







/*

    12410 ms    first
     4173 ms    loop A to 1000 -> (p/2)
     1063 ms    loop B to 1000 -> (p/2)
      902 ms    if(c + a + b = p)  -->  if(p - a - b = c)
      895 ms    loops start 0  -->  1

*/