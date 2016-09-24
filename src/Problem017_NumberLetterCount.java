import java.util.Scanner;
/**
 * Created by Sneeuwpopsneeuw on 27-Apr-16.
 */
/* MADE BY: _TIMO_STRATING_
 *
 * number:  999.999
 *           |   |
 *    ex <---/   \---> ex
 *    |                 |                  ex            |      |          ex               |    |            ex        |   |       ex      |   |   ....
 *  ~~~~~ +"duizend"+ ~~~~~ = negenhonderdnegenennegentigduizendnegenhonderdnegenennegentig
 */
public class Problem017_NumberLetterCount {
    static String format = "%-40s%s%n";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("0 to run oneToAThausend() ");
        System.out.println("1-9283759827349729347927349287439827834278348927352938239487 to get the text version");
        System.out.println("--------------------------");
        while (true) {
            System.out.print("Please enter any positive number : ");
            String inputString = sc.nextLine();
            if(inputString.equals("`") || inputString.equals("exit")){ break; }  /*HACK: break; for the infinite loop*/
            run(inputString);
        }
    }

    public static void run(String inputString) {
        String[] macthenVanDuizend = {"", "Duizend", "Miljoen", "Miljard", "Biljoen", "Biljard", "Triljoen", "Triljard", "Quadriljoen", "Quadriljard", "Quintiljoen", "Quintiljard", "Sextiljoen", "Sextiljard", "Septiljoen", "Septiljard",
                "Octiljoen", "Octiljard", "Noniljoen", "Noniljard", "Deciljoen", "Deciljard", "Undeciljoen", "Undeciljard", "Duodeciljoen", "Duodeciljard", "Tredeciljoen", "Tredeciljard", "Quattuordeciljoen", "Quattuordeciljard", "Quindeciljoen",
                "Quindeciljard", "Sedeciljoen", "Sedeciljard", "Septendeciljoen", "Septendeciljard", "Octodeciljoen", "Octodeciljard", "Novemdeciljoen", "Novemdeciljard", "Vigintiljoen", "Vigintiljard"	};
        if(inputString.substring(0,1).equals("0") || inputString.length() > 100) {
            oneToAThauzend();
            return;
        }

        int c = (inputString.length()-1) /3;
        int j = 0;

        for(int i=0; i<inputString.length(); i+=3) {
            String test = inputString.substring(j, inputString.length() - (c*3) );      /* HACK: 99.999 fix */
            String temp = (test.equals("1") && c==1)? "Duizend" : ex(test) + macthenVanDuizend[c];    /* HACK: EEN duizend fix*/
            System.out.printf( format, temp, temp.length() );
            c--; /*haha leuke grap java eerst c en nu ook al c++*/
            j+= test.length();
        }
        System.out.println();
    }

    // overloading
    public static String ex(String numberString) { /*0 to 999*/
        try {   /*try to search for stupid humans*/
            return ex( Integer.parseInt(numberString) );
        } catch (Exception e) {
            System.err.println("Haha humans are stupid, they do not even know what numbers are.");
        }
        return null;
    }

    public static String ex(int number) { /*0 to 999*/
        String[] eenheden = {"", "one", "two", "three", "four", "five", "six", "zeven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tientallen = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String words = "";

        if ((number / 100) > 0) {
            words += eenheden[number / 100] + "hundred";
            number %= 100;
            words += ((number > 0) ? "and" : "");
        }

        if (number < 20) {
            return (words + eenheden[number]);
        }
        if ((number / 10) >= 0) {
            String temp = tientallen[number / 10];
            number %= 10;
            words += temp;
            if (number > 0)
                words += eenheden[number];

        }
        return words;
    }

    public static void oneToAThauzend() { /*1 to 1000 loop and count*/
        int count = 0;

        for (int i=0; i<1000; i++) {
            System.out.printf( format, ex(i), (count += ex(i).length()) );
        }
        System.out.printf( format, "oneThousand", (count += "oneThousand".length()) );
        System.out.println();
        System.out.println("het aantal karakters dat nodig zijn om de getallen van 1 tot en met 1000 op te schrijven zijn : " + count);
    }
}