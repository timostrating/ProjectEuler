import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 20-Dec-16.
 */
public class Problem225_TribonacciNonDivisors {   // TODO Problem225_TribonacciNonDivisors
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int t1 = 1;
        int t2 = 1;
        int t3 = 1;
        int MAX = 34;

        for (int i=0; i < MAX; i++) {
            int tmp = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = tmp;
            list.add(t3);
        }

        System.out.print(list);
//        int nthnumber = 0;

        for(int i=0; i < 999; i++) {
            boolean isNonTerm = false;
            for (int j=0; j < MAX; j++) {
//                if (isNonTerm == false)
//                    isNonTerm = (i % list.get(j) == 0)? true : false;
            }

//            if (isNonTerm == false)
//                System.out.println(i);
        }

//        System.out.print(nthnumber);

    }
}




/*

The sequence 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, 355, 653, 1201 ...
is defined by T1 = T2 = T3 = 1 and Tn = Tn-1 + Tn-2 + Tn-3.

It can be shown that 27 does not divide any terms of this sequence.
In fact, 27 is the first odd number with this property.

Find the 124th odd number that does not divide any terms of the above sequence.

 */