/**
 * Created by Sneeuwpopsneeuw on 17-Aug-16.
 */
public class Problem031_CoinSums {
    public static void main(String[] args) {
        int ans = 0;

        for (int a=200; a>=0; a-=200) {
            for (int b=a; b>=0; b-=100) {
                for (int c=b; c>=0; c-=50) {
                    for (int d=c; d>=0; d-=20) {
                        for (int e=d; e>=0; e-=10) {
                            for (int f=e; f>=0; f-=5) {
                                for (int g=f; g>=0; g-=2) {
                                    ans ++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("ans = " + ans);
    }
}



/*

1 1 1 1 1 1 1 1 1 1
 2  1 1 1 1 1 1 1 1
 2   2  1 1 1 1 1 1
 2   2   2  1 1 1 1
 2   2   2   2  1 1
 2   2   2   2   2
     5    1 1 1 1 1
     5     2  1 1 1
     5     2   2  1
     5        5
         10

 */