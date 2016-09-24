/**
 * Created by Sneeuwpopsneeuw on 17-Aug-16.
 */
public class Problem040_ChampernowneConstant {
    public static void main(String[] args) {
        final int SIZE = 999_999;
        int ans = 1;
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=SIZE; i++) {
//            System.out.print(i);
            if (sb.length()+(""+i).length() > 1_000_000) {
                System.out.println("sb.length() = "+sb.length());
                System.out.println("i = "+i);
                System.out.println("    ^ ");
                break;
            }

            sb.append(i);
        }

        ans *= Character.getNumericValue( sb.charAt(0) );
        System.out.println(sb.charAt(0));
        ans *= Character.getNumericValue( sb.charAt(10-1) );
        System.out.println(sb.charAt(10-1));
        ans *= Character.getNumericValue( sb.charAt(100-1) );
        System.out.println(sb.charAt(100-1));
        ans *= Character.getNumericValue( sb.charAt(1000-1) );
        System.out.println(sb.charAt(1000-1));
        ans *= Character.getNumericValue( sb.charAt(10000-1) );
        System.out.println(sb.charAt(10000-1));
        ans *= Character.getNumericValue( sb.charAt(100000-1) );
        System.out.println(sb.charAt(100000-1));
//        ans *= Character.getNumericValue( sb.charAt(1000000) );

        System.out.println("ans = " + ans);  // 210 * 1 = 2010
    }
}