/**
 * Created by Sneeuwpopsneeuw on 20-Dec-16.
 */
public class Problem142_PerfectSquareCollection {   // TODO Problem142_PerfectSquareCollection
    public static void main(String[] args) { new Problem142_PerfectSquareCollection().start( 2000 ); }
    public void start(int max) {
        for (int x=0; x < max; x++)
            for (int y=0; y < x; y++)
                for (int z=0; z < y; z++)
                    if( isPerfectSquare(x + y) && isPerfectSquare(x - y) && isPerfectSquare(x + z) && isPerfectSquare(x + z) && isPerfectSquare(y + z) && isPerfectSquare(y - z) )
                        System.out.format("%s > %s > %s   %20s, %s, \t %s, %s, \t %s, %s, \t= %s\n", x, y, z, x+y, x-y, x+z, x-z, y+z, y-z, (x+y+z));
    }

    private boolean isPerfectSquare(int value) {
        double tmp = Math.sqrt(value);
        return (Math.floor(tmp) == Math.ceil(tmp));
    }
}

// 329 is NOT correct
// Find the smallest x + y + z with integers x > y > z > 0 such that x + y,  x − y,  x + z,  x − z,  y + z,  y − z are all perfect squares.