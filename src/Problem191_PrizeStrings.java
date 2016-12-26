/**
 * Created by Sneeuwpopsneeuw on 20-Dec-16.
 */
public class Problem191_PrizeStrings {   // TODO Problem191_PrizeStrings
    public static void main(String[] args) { new Problem191_PrizeStrings().start(); }
    public void start() {
        char[] results = "OOOO".toCharArray();
        char[] options = "OLA".toCharArray();


        for (int i=0; i < Math.pow(options.length, results.length); i++) {   // DMANN let's do  205_891_132_094_649  iterations
            char[] tmp = Integer.toString(i, 3).toCharArray();
            System.out.print(tmp);

            for (int j=0; j < tmp.length; j++)
                results[results.length -1 -j] = options[ Integer.parseInt( ""+tmp[tmp.length -1 -j] ) ];

            System.out.print( "\t \t" );
            System.out.println( results );
        }

    }
}


/*

A particular school offers cash rewards to children with good attendance and punctuality.
If they are Absent for 3 CONDECUTIVE DAYS  ||  Late on  > one  occasion then they FORFEIT their prize.

During an n-day period a trinary string is formed for each child consisting of L's (late), O's (on time), and A's (absent).

Although there are  81  trinary strings for a 4-day period that can be formed, exactly  43  strings would lead to a prize:

OOOO OOOA OOOL OOAO OOAA OOAL OOLO OOLA OAOO OAOA
OAOL OAAO OAAL OALO OALA OLOO OLOA OLAO OLAA AOOO
AOOA AOOL AOAO AOAA AOAL AOLO AOLA AAOO AAOA AAOL
AALO AALA ALOO ALOA ALAO ALAA LOOO LOOA LOAO LOAA
LAOO LAOA LAAO

How many "prize" strings exist over a 30-day period?

 */