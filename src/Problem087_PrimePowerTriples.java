import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 22-Oct-16.
 */
public class Problem087_PrimePowerTriples extends Problem{
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int SIZE= 50_000_000;

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> totalList = new ArrayList<>();

        for(int i=0; i < Math.sqrt(SIZE); i++) {
            if(isPrime(i)) {
                int value = (int)Math.pow(i, 2);
                if(value < SIZE)
                    list2.add( value );

                value = (int)Math.pow(i, 3);
                if(value < SIZE)
                    list3.add( value );

                value = (int)Math.pow(i, 4);
                if(value < SIZE)
                    list4.add( value );
            }
        }

        for(int i=0; i < list4.size(); i++) { // let's brute force it
            for(int j=0; j < list3.size(); j++) {
                for(int k=0; k < list2.size(); k++) {
                    int value = list4.get(i) + list3.get(j) + list2.get(k);
                    if (value < SIZE  &&  totalList.contains(value) == false)
                        totalList.add(value);
                }
            }
            System.out.print("."); // show that we are doing something
        }

        System.out.println("");
        System.out.println("ans = " + totalList.size() + " _ " + ( System.currentTimeMillis() - time ));  // 22.2733667 minutes
    }
}