
/** Created by Sneeuwpopsneeuw on 01-Jun-16. */

public class HighSpeedSort {

    private Sort.SortTest[] testObjects = {
            new Sort.BuildinSortTest(),          // Arrays.sort()
            new Sort.OptimizedSortTest(),        // java 8
            new Sort.RadixSortTest(),            // internet
            new Sort.ShellSortTest(),            // internet
//            new Sort.BubbleSortTest(),         // tarable solution
            new Sort.TimoSortTest()              //    MY IMPLEMENTATION OF QUICKSORT
    };


    public static void main(String[] args){
        new HighSpeedSort();
    }       // java magic
    public HighSpeedSort() { start(); }

    public void start() {
        for (int i=0; i<testObjects.length; i++) {

            testObjects[i].test(0);
            testObjects[i].antiCheat();     // prove we don't cheat

            testObjects[i] = null;          // garbage++
            System.out.println("");
        }
        // printF is nice
        System.out.printf("%n %s %n%n %s %n%n%n%n%n%n","- My implementation of quicksort is not the fastest but is around avg so as you can see        ^^^^^^ - TimoSortTest",  "This is how it works");

        Sort.TimoSortTest.main(null);
    }
}