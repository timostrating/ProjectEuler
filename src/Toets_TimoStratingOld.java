import java.util.Scanner;

/* number:  999.999
 *           |   |
 *    ex <---/   \---> ex
 *    |                 |                  ex            |      |          ex
 *  ~~~~~ +"duizend"+ ~~~~~ = negenhonderdnegenennegentigduizendnegenhonderdnegenennegentig
 */
public class Toets_TimoStratingOld {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 to run oneToAThauzend() ");
        while (true) {                                              /*FIXME: break; for the infinite loop*/
            System.out.print("Please enter a number : ");
            String inputString = sc.nextLine();
            if(inputString.equals("0"))
                oneToAThauzend();
            if (inputString.length() > 0 && inputString.length() <= 6) { /*0 to 999.999*/  /*FIXME: change to loop for support 0 to infinity */
                if (inputString.length() > 3) {
                    String test = inputString.substring(0, inputString.length() - 3);
                    inputString = inputString.substring(inputString.length() - 3);
                    System.out.print((test.equals("1")) ? "duizend" : ex(test) + "duizend");      /* HACK: EEN duizend fix*/
                }
                System.out.println(ex(inputString));
            } else {
                System.out.println("sorry the exercise sad a number between 1 and 999.999");
            }
            System.out.println();
        }
    }

    // overloading
    public static String ex(String numberString) { /*0 to 999*/
        try {   /*try to search for stupid humans*/
            return ex(Integer.parseInt(numberString));
        } catch (Exception e) {
            System.err.println("Haha humans are stupid, they do not even know what numbers are.");
        }
        return null;
    }

    public static String ex(int number) { /*0 to 999*/
        String[] eenheden = {"", "een", "twee", "drie", "vier", "vijf", "sez", "zeven", "acht", "negen", "tien", "elf", "twaalf", "dertien", "veertien", "vijftien", "seztien", "zeventien", "achttien", "negentien"};
        String[] tientallen = {"", "tien", "twintig", "dertig", "veertig", "vijftig", "zestig", "zeventig", "tachtig", "negentig"};
        String words = "";

        if (number < 20) {
            return eenheden[number];
        }
        if ((number / 100) > 0) {
            words += ((number / 100 == 1) ? "" : eenheden[number / 100]) + "honderd";     /* HACK: EEN honderd fix*/
            number %= 100;
        }
        if ((number / 10) >= 0) {
            String temp = tientallen[number / 10];
            number %= 10;
            if (number > 0)
                words += eenheden[number] + ((temp == "") ? "" : "en");      /*Hack: tweeEN fix*/
            words += temp;
        }
        return words;
    }

    public static void oneToAThauzend() { /*1 to 1000 loop and count*/
        int count = 0;
        String format = "%-40s%s%n";

        for (int i=0; i<1000; i++) {
            System.out.printf( format, ex(i), (count += ex(i).length()) );
        }
        System.out.printf( format, "duizend", (count += "duizend".length()) );
        System.out.println();
        System.out.println("het aantal karakters dat nodig zijn om de getallen van 1 tot en met 1000 op te schrijven zijn : " + count);
    }
}


/*

20577


1097

100 * 7(honderd)
100 * 11(tweehonderd)
100 * 4(tien)
100 * 4(tien)
100 * 4(tien)


null een twee drie vier vijf zes seven acht negen
 0 3 4 4 4 4 3 5 4 5  = 36

null tien twintig dertig veertig vijftig zestig zeventig tachtig negentig
 */