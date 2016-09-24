/**
 * Created by Sneeuwpopsneeuw on 10-Sep-16.
 */
public class Problem108_DiophantineReciprocalsI {   // TODO: Problem108_DiophantineReciprocalsI   fractions class Would be handy
    public static void main(String[] args) {
        int SIZE = 9_999_999;
        long ans = 0;

        for(int n=2; n <= 2000; n++) {
            for (int x=n; x <= n*2; x++) {
                for (int y=SIZE; y >= n*2; y--) {
                    if (1/(double)x + 1/(double)y == 1/(double)n) {
                        SIZE = y;
                        ans++;
                        System.out.println("1/"+x+"   1/"+y);
                        break;
                    }
                }
            }
            SIZE = 9_999_999;
            System.out.println("");

            if (ans > 100) {
                System.out.println("n = "+n+"    ans = "+ans);
                break;
            } else { ans = 0; }
        }
    }
}




/*

1/x  +	1/y  =  1/n

1/5  +	1/20  =  1/4            20 % 4  = 0
1/6  +	1/12  =  1/4            12 % 4  = 0
1/8  +	1/8  =  1/4      <-- we can always have this one

1/4   |
1/5   |
1/6   |
1/8   \- >   this  is special


n = 1260    113 distinct solutions   first time exceeds one hundred.

 */