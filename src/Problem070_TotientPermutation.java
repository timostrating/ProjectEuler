import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 20-Aug-16.
 */
public class Problem070_TotientPermutation extends Problem{  // TODO: Problem070_TotientPermutation   it works but it needs to run faster to get the answer
    public static void main(String[] args) {
        final int SIZE = 10_000_000;
        int ans = 0, phi = 0, counter = 0;
        double ratio = 999D;

        ArrayList<Integer> map = new ArrayList<>();
        for(int i=1; i < SIZE; i++){  // definition of totient: the amount of numbers less than num coprime to it
            if(GCD(SIZE, i) == 1){  // coprime
                map.add(i);
                counter ++;
                System.out.println("counter = "+counter+" : "+i);
            }
        }

        System.out.println("list generated");

        for(int n=SIZE; n > 1; n--) {
            int value = counter;   // counter;

            if( isPermutation (value, n) ) {   //  value is a permutation of n    φ(87109)=79180
                System.out.println(n+" : "+ratio+" "+value);
                if( (double)n / (double)value < ratio ) {
                    ratio = (double)n / (double)value;
                    ans = n;
                    phi = value;

                    System.out.println(" -- "+n+" : "+ratio+" : "+phi);
                }
            }

            if (map.contains(n)) {
                counter --;
            }
        }

        System.out.println("");
        System.out.println("ans = "+ans+" - "+ratio+" - "+phi);
    }


    private static int[] getPhiList(int num) {  // euler's totient function calculator. returns totient
        ArrayList<Integer> map = new ArrayList<>();
        for(int i=1; i < num; i++){  // definition of totient: the amount of numbers less than num coprime to it
            if(GCD(num,i) == 1){  // coprime
                map.add(i);
            }
        }
        return( map.stream().mapToInt(i->i).toArray() );   // List<T>.toArray won't work because there's no conversion from Integer to int, DAMN JAVA
    }


    private static int phi(int num) {  // euler's totient function calculator. returns totient
        int count=0;
        for(int a=1; a < num; a++){  // definition of totient: the amount of numbers less than num coprime to it
            if(GCD(num,a) == 1){  // coprime
                count++;
            }
        }
        return(count);
    }


    private static int GCD(int a, int b) {  // faster euclidean algorithm-see GCD for explanation
        int temp;
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a % b == 0){
            return(b);
        }
        return( GCD(a % b, b) );
    }


    protected static boolean isPermutation (int a, int b) { return isPermutation(a, b, false); }
    protected static boolean isPermutation (int a, int b, boolean seconTime) {                            // recursive +1
        String textA = "" + a;
        String textB = "" + b;
        boolean flag = false;

        if(textA.length() != textB.length())
            return false;

        for (int i = 0; i < textA.length(); i++) {
            for (int j = 0; j < textB.length(); j++) {
                if (Character.getNumericValue(textA.charAt(i)) == Character.getNumericValue(textB.charAt(j))) {  // IF  Pointer A == Pointer B
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return false;

            flag = false;
        }

        return (seconTime) ? true : isPermutation(b, a, true);
    }
}
