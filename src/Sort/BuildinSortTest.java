package Sort;

import java.util.Arrays;

/** Created by Sneeuwpopsneeuw on 26-Jun-16.   BUILD in system */
public class BuildinSortTest extends SortTest {

    @Override
    protected void doTest(int[] array) {
        Arrays.sort(array);
    }
}
