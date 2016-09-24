import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem046_GoldbachOtherConjecture extends Problem{
    public static void main(String[] args) {
        final int SIZE = 10_000;
        boolean flag = false;

        ArrayList<Integer> map = new ArrayList<>();
        for(int i=1; i<100; i++) {
            map.add(2 * (int)Math.pow(i, 2));
        }

        for(int i=9; i<SIZE; i++) {
            if(i % 2 == 1 && isPrime(i) == false) {
//                System.out.println("i = " + i);

                for(int j=i-1; j>0; j--) {
                    if (isPrime(j)) {
                        if(map.contains(i-j)) {
                            System.out.println("i = "+i+"   j = "+j+"    ==  "+(i-j));
                            flag = true;
                            break;
                        } else System.out.println("-- i = "+i+"   j = "+j);
                    }
                }

                if(flag == false) {
                    System.out.println("ans = " + i);
                    return;
                } else {
                    flag = false;
                }
            }
        }
    }
}