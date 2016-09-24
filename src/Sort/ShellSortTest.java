package Sort;

/** Created by Sneeuwpopsneeuw on 27-Jun-16. */
public class ShellSortTest extends SortTest{
    @Override
    protected void doTest(int[] array) {

        //first section gets the Knuth's interval sequence (very efficient)
        int h=1;
        while(h<= array.length/3){
            h = 3*h + 1;   //h is equal to highest sequence of h<=length/3 (1,4,13,40...)
        }

        //next section
        while(h>0){    //for array of length 10, h=4

            //similar to insertion sort below
            for(int i=0; i<array.length; i++){

                int temp = array[i];
                int j;

                for(j=i; j>h-1 && array[j-h] >= temp; j=j-h){
                    array[j] = array[j-h];
                }
                array[j] = temp;
            }
            h = (h-1)/3;
        }
    }

    public void shellSort( ) {

    }
}
