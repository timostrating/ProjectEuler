/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem041_PandigitalPrime extends Problem{
    static int[] numbers = new int[] { 9,8,7,6,5,4,3,2,1};

    public static void main(String[] args) {
        for(long i=987654321; i>1; i--) {
            if(isPandigital(i)) {
                System.out.println("isPandigital : " + i);
                if (isPrime(i)) {
                    System.out.println("isPrime : " + i);
                    return; // biggest PandigitalPrime is found
                }
            }
        }
    }

    public static Boolean isPandigital(long num){
        String text = "" + num;
        boolean flag = false;

        if(num < 9_876_543_210L) { // largest possible Pendigital in base 10
            for (int i = text.length(); i > 0; i--) {
                for (int j = 0; j < text.length(); j++) {
                    if (i == Character.getNumericValue(text.charAt(j))) {
                        if (flag)               // if the flag is already triggered that means we have 2 the same numbers.
                            return (false);
                        else
                            flag = true;        // set flag
                    }
                }

                if (flag == false)              // if flag is not triggerd we dont have found that number
                    return (false);

                flag = false;                   // reset flag
            }
        }
        return(true);                       // 0-9 are found so this is Pandigital
    }

}








//    public static void work(int size) {
//        for(int i=9-size; i<numbers.length; i++) {
//            for(int j=9-size; j<numbers.length; j++) {
//                if (j == i)
//                    continue;
//
//                swap(i,j);
//
//                String numberString = new String();
//                for(int k=0; k<numberString.length(); k++) {
//                    numberString += numbers[k];
//                }
//
//                long number = 1;
//
//                try{ number = Long.parseLong( numberString ); }
//                catch (Exception e) { }
//
//                if( isPrime(number) )
//                    System.out.println(" --------- "+number);
//                else
//                    totalNumbers++;
//
//                if (size > 2)
//                    work(size-1);
//                else
//                    size = 9;
//
//            }
//        }
//    }
//
//    public static void swap(int a, int b) {
//        int tmpA = numbers[a];
//        numbers[a] = numbers[b];
//        numbers[b] = tmpA;
//    }