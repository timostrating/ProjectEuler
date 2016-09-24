import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem032_PandigitalProducts extends Problem{
    public static void main(String args[]) {
        int pandigital = 123456789;
        long sum = 0;
        ArrayList<Integer> map = new ArrayList<>();

        for (int i=1; i<9_999; i++) {
            for (int j=1; j<9_999; j++) {

                if (i != j && haveDiferentDigits(i,j)) {

                    String text = ("" + i) + ("" + j) + ("" + (i * j));
                    if (text.length() == 9) {
                        if (haveDiferentDigits(i, i * j) && haveDiferentDigits(j, i * j)) {

                            int value = Integer.parseInt(text);
                            if (haveSameDigits(value, pandigital)) {
                                if (map.contains(i*j) == false) {
                                    System.out.println(i+" x "+j+" = "+(i*j)+"     "+text);
                                    sum += i*j;
                                    map.add(i*j);
                                }
                            }
                        }
                    }
                }

            }
        }

        System.out.println("ans = "+ sum);
    }
}


/*

    I * IIII = IIII
    I

 */
