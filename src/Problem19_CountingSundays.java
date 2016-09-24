import java.util.Calendar;

/**
 * Created by Sneeuwpopsneeuw on 12-Aug-16.
 */
public class Problem19_CountingSundays {
    public static void main(String[] args) {
        final int STARTYEAR = 1901,  ENDYEAR = 2000,  MONTHS = 12;
        int ans = 0;
        Calendar date = Calendar.getInstance();

        for(int i=STARTYEAR; i <= ENDYEAR; i++) {  // LOOP Years
            for(int j=0; j < MONTHS; j++) {    // LOOP Months
                date.set(i, j, 1);
                if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    ans ++;
                    System.out.println(date.getTime()+" true");
                }
            }
        }

        System.out.println("ans = " + ans);
    }
}
