import java.util.Arrays;
import java.util.Random;

public class IntegerQuicksort {

    public static void sort(int[] array) {
        sort(array, 0, array.length);
    }

    public static void sort(int[] array, int fromIndex, int toIndex) {
        if (toIndex - fromIndex < 2) {
            return;
        }

        int pivot = array[fromIndex];
        int leftPartitionLength = 0;
        int rightPartitionLength = 0;
        int index = fromIndex;

        while (index < toIndex - rightPartitionLength) {
            int current = array[index];

            if (current > pivot) {
                ++rightPartitionLength;
                int tmp = array[toIndex - rightPartitionLength];
                array[toIndex - rightPartitionLength] = current;
                array[index] = tmp;
            } else if (current < pivot) {
                int tmp = array[fromIndex + leftPartitionLength];
                array[fromIndex + leftPartitionLength] = current;
                array[index] = tmp;

                ++index;
                ++leftPartitionLength;
            } else {
                ++index;
            }
        }

        sort(array, fromIndex, fromIndex + leftPartitionLength);
        sort(array, toIndex - rightPartitionLength, toIndex);
    }

    private static final int SIZE = 500_000;
    private static final int FROM = 100;
    private static final int TO = SIZE - 100;

    public static void main(final String... args) {
        long seed = System.nanoTime();
        Random random = new Random(seed);
        int[] array1 = getRandomArray(SIZE, -1000, 1000, random);
        int[] array2 = array1.clone();

        System.out.println("Seed: " + seed);
        long startTime = System.nanoTime();
        sort(array1, FROM, TO);
        long endTime = System.nanoTime();

        System.out.printf("IntegerQuicksort.sort in %.2f milliseconds.\n",
                (endTime - startTime) / 1e6);

        startTime = System.nanoTime();
        Arrays.sort(array2, FROM, TO);
        endTime = System.nanoTime();

        System.out.printf("Arrays.sort in %.2f milliseconds.\n",
                (endTime - startTime) / 1e6);

        System.out.println(Arrays.equals(array1, array2));
    }

    public static int[] getRandomArray(int size,
                                       int minimum,
                                       int maximum,
                                       Random random) {
        int[] array = new int[size];

        for (int i = 0; i < size; ++i) {
            array[i] = random.nextInt(maximum - minimum + 1) + minimum;
        }

        return array;
    }
}