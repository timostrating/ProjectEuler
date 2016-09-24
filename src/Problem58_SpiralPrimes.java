/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem58_SpiralPrimes extends Problem {
    public static void main(String[] args) {
        int ans = 0, i = 3, numbers = 1;
        double precentage = 1D;

        while (precentage >= 0.1D) {
            int pow = (int)Math.pow(i, 2);

            for(int j=0; j<=3; j++) {
                if(isPrime( pow - (i-1)*j ) )
                    ans++;

                numbers ++;
            }

            precentage = (double)ans/(double)numbers;
            System.out.println( i+" : "+ans+"/"+numbers+" ~ "+precentage);

            i += 2;
        }
    }
}








/*

    __Same_solution_using_a_ArrayList_to_store_the_values__


public static void main() {
    int ans = 0, i = 3;
    ArrayList<Integer> map = new ArrayList<>();
    double precentage = 1D;

    map.add(1);
    while (precentage >= 0.1D) {            // the main loop should be changed
        int pow = (int)Math.pow(i, 2);

        map.add(pow);
        for(int j=1; j<=3; j++) {
            map.add( pow - (i-1)*j );
        }

        for(int j=map.size()-1; j>map.size()-4-1; j--) {
            if(isPrime( map.get(j)) ) {
                ans++;
            }
        }

        precentage = (double)ans/(double)map.size();
        System.out.println( i+" : "+ans+"/"+map.size()+" ~ "+ precentage );

        i += 2;
    }
}

 */