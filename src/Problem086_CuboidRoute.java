/**
 * Created by Sneeuwpopsneeuw on 20-Dec-16.
 */
public class Problem086_CuboidRoute {
    public static void main(String[] args) { new Problem086_CuboidRoute().start(); }
    public void start() {
        int size = 1750;   // The program goes really slow on the end so I help it a little bit
        long ans = 0;

        while (ans < 1_000_000) {
            size ++;
            for (int i = 1; i <= size; i++) {           // Loop Width
                for (int j = 1; j <= size; j++) {       // Loop Height
                    if (i < j)
                        continue;
                    for (int k = 1; k <= size; k++) {   // Loop Length
                        if (j < k && hasPerfectCuboidRoute(i, j, k))
                            ans++;
                    }
                }
            }
            System.out.println("ans = " + ans);
        }
        System.out.println("size = " + size);   // 1818
    }

    private boolean hasPerfectCuboidRoute(int W, int H, int L){  // The Caps are just there to make it more clear
        double size = Math.sqrt( Math.pow( W , 2) + Math.pow( H + L , 2));  // thanks to mathworld wolfram for the explanation.  http://mathworld.wolfram.com/SpiderandFlyProblem.html
        return (((int)size) == Math.ceil(size));   //     \-->  sqrt( A^2 + (B + C)^2 )
    }
}