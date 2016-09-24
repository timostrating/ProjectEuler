/**
 * Created by Sneeuwpopsneeuw on 02-Apr-16.
 */
public class Problem15_LatticePaths {
    public static void main(String args[]) {
        int width = 4;
        int height = 4;
        long routes = 2;

        for(int x = 0; x < width -1; x++) {
            for (int y = 0; y < height -1; y++) {
                routes += 1;
                System.out.println(routes);
            }
        }
    }
}
