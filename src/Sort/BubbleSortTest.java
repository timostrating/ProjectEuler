package Sort;

/** Created by Sneeuwpopsneeuw on 27-Jun-16. */
public class BubbleSortTest extends SortTest {

    @Override
    protected void doTest(int[] array) {
        int i, j, tijdelijk;
        for (j = 0; j < array.length; j++) {
            for (i = 1; i < array.length - j; i++) {
                if (array[i-1] > array[i]) {
                    tijdelijk = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tijdelijk;
                }
            }
        }
    }
}
