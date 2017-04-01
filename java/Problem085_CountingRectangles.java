/**
 * Created by Sneeuwpopsneeuw on 01-Apr-17.
 */
public class Problem085_CountingRectangles extends Problem {
    public static void main(String[] args) {
        long ans=Long.MAX_VALUE;
        int X=0, Y=0;

        for(int x=1; x<99; x++) {
            for(int y=x; y<99; y++) {
                long value = Math.abs(2_000_000L - getContainerAmount(x, y));
                if (value < ans) {
                    ans = value;  X = x;  Y = y;
                }
            }
        }

        println("("+X+","+Y+" ) value: "+ans+"  answer = "+X*Y);
    }

    private static long getContainerAmount(int X, int Y) {
        long counter = 0;

        for (int w = 1; w <= X; w++)  // Loop width
        for (int h = 1; h <= Y; h++)  // Loop height
        for (int x = 0; x+w <= X; x++)  // Loop X - width
        for (int y = 0; y+h <= Y; y++)  // Loop Y - height
        counter++;

        return counter;
    }
}
