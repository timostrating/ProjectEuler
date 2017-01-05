/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem076_CountingSummations {  // TODO:   76  -->  77  -->  78
    public static int[] coinValues = new int[0];

    public static void main(String[] args) {
        coinValues = new int[100];
        for (int i=0; i < 100; i++) {
            coinValues[i] = i;
        }
        System.out.println(numWays(100, 100));
    }
    static int numWays(int p, int maxCoin){
        if(p == 1)
            return 1;
        else if(p < 0)
            return 0;

        int ways = 0;
        for(int i=0; i <= 100  &&  coinValues[i] <= maxCoin; i++){
            ways += numWays(p - coinValues[i], coinValues[i]);
        }
        return ways;
    }
}


/*

        for (int a=100; a>0; a-=100) {
            for (int b=a; b>=0; b-=99) {
                for (int c=b; c>=0; c-=98) {
                    for (int d=c; d>=0; d-=97) {
                        for (int e=d; e>=0; e-=96) {
                            for (int f=e; f>=0; f-=95) {
                                for (int g=f; g>=0; g-=94) {
                                    for (int h=g; h>=0; h-=93) {
                                        ...........................
                                            ..........................

        This must be made smart   while + array ?

        */