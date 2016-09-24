/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem061_CyclicalFigurateNumbers {  // TODO: Problem061_CyclicalFigurateNumbers
    public static void main(String[] args) {
        final int SIZE = 10000;
        long ans = 0;

        for(int i=1; i<200; i++) {
            String text = ""+(int)Math.pow(i,2);
            if(text.length() < 4)
                continue;
            else if (text.length() >= 5)
                break;

            System.out.println(text);
        }

        System.out.println("ans = " + ans);
    }
}
