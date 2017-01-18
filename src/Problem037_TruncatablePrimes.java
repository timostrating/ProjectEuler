import java.util.ArrayList;

/**
 * Created by Sneeuwpopsneeuw on 16-Aug-16.
 */
public class Problem037_TruncatablePrimes extends Problem{
    public static void main(String[] args) {
        long ans = 0;

        ArrayList<Integer> map = new ArrayList<>();

        map.add(2);
        for (int i=1; i < 10_000_000; i+=2) {
            if(isPrime(i))
                map.add(i);
        }

        for (int i=map.size()-1; i > 1; i--) {
            String text = ""+map.get(i);
            boolean flag = false;

            if(text.length() <= 1)
                break;

            for (int j=1; j < text.length(); j++) {           //   ----->
                String shortText = text.substring(j, text.length());
                int value = Integer.parseInt(shortText);
//                System.out.println(" -"+shortText+"- "+value);

                if(isPrime(value)) {
//                    System.out.println(" -- "+text + " : " + value);
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                for (int j=0; j < text.length(); j++) {     //   <-----
                    String shortText = text.substring(0, text.length() - j);
                    int value = Integer.parseInt(shortText);

                    if (isPrime(value)) {
//                    System.out.println(text + " : " + value);
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans += map.get(i);
                    System.out.println(i + " : " + map.get(i));
                }
            }
        }

        System.out.println("ans = " + ans);
    }
}