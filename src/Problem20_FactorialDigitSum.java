import java.math.BigInteger;

/**
 * Created by Sneeuwpopsneeuw on 08-Apr-16.
 */
public class Problem20_FactorialDigitSum {
    public static void main(String args[]) {
        int number = 100;
        int output = 0;
        BigInteger answer = new BigInteger("1");

        while( number > 0 ){
            answer = answer.multiply(new BigInteger(""+number));
            System.out.println(number + " : " + answer);
            number--;
        }

        System.out.println("             "+answer);
        String answerString = answer.toString();

        for (int i=0; i<answerString.length(); i++){
            output += Character.getNumericValue( answerString.charAt(i) );
            System.out.println( " CHAR: " + answerString.charAt(i) + "   OUTPUT: " + output);
        }

        System.out.println("             output: "+output);
    }
}
