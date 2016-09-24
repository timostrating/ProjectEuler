import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 19-Aug-16.
 */
public class Problem44_PentagonNumbers {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();
        int ans = 0, value, p1, p2;

        ArrayList<Integer> map = new ArrayList<>();

        for (int n=1; n <= 2_500 ; n++) {
            value = n*(3*n -1)/2;
//            System.out.println(" n = "+n+"   value = "+value);
            map.add(value);
        }

        System.out.println("map generated");

        for (int j=0; j < map.size() ; j++) {       // p1 ----------------------------------------------------->
            p1 = map.get(j);
            for (int k=0; k < (j/2) ; k++) {        // p2 --> p1  ^^   p2 -----> p1  ^^   p2 ----------> p1  ^^
                p2 = map.get(k);

                if ( map.contains((p1 + p2)) && map.contains((p1 - p2))) {
                    System.out.println(" D = " + (Math.abs((p1 - p2))) + "      p1 = "+p1+"   p2 = "+p2+"     j = "+j+"   k = "+k);
                    System.out.println("Time: " + (System.currentTimeMillis() - startTime) +" ms");
                    return;
                }
            }
        }

    }
}