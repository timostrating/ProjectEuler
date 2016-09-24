import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 17-Aug-16.
 */
public class Problem62_CubicPermutations {
    public static void main(String[] args) {
        final int SIZE = 10_000;
        ArrayList<Long> cubes = new ArrayList<>();

        for (int i=1; i<SIZE; i++) {
            cubes.add( (long)Math.pow(i, 3) );
//            System.out.println((long)Math.pow(i, 3));
        }

        System.out.println("list generated");

        for (int i=0; i<cubes.size(); i++) {
            Long value = cubes.get(i);
            int counter = 0;

            long[] array = new long[10];

            for (int j=0; j<cubes.size(); j++) {
                if (i == j)
                    continue;

                if ((double)j / (double)i > 10D)
                    break;

                if (haveSameDigits(value, cubes.get(j))) {
//                    System.out.println(value + " : " + cubes.get(j));
                    array[counter] = cubes.get(j);
                    counter++;
                }
            }

            if (counter == 4) {  // damn text
                System.out.println(value +" "+i);
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println(array[3]);
                return;
            }
        }
    }

    private static boolean haveSameDigits(long a, long b) { return haveSameDigits(a, b, false); }
    private static boolean haveSameDigits(long a, long b, boolean seconTime) {                            // recursive +1
        char[] textA = new String((""+a)).toCharArray();
        char[] textB = new String((""+b)).toCharArray();
        boolean flag = false;

//        if (textA.length != textB.length)
//            return false;

        for(int i=0; i < textA.length; i++) {
            for(int j=0; j < textB.length; j++) {
                if (Character.getNumericValue( textA[i] ) == Character.getNumericValue( textB[j] )) {  // IF  Pointer A == Pointer B
                    flag = true;
                    textB[j] = '~';
                    break;
                }
            }

            if (flag == false)
                return false;

            flag = false;
        }

        return (seconTime)? true : haveSameDigits(b, a, true);
    }
}



/*
    41_063_625
 */