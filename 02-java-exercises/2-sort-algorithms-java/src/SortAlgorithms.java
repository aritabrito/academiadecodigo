import java.util.Arrays;

public class SortAlgorithms {

    public static void main(String[] args) {

        int[] array = {2, 1, 30, 7, 12};

        System.out.println("sorted array: " + Arrays.toString(selectionSort(array)));
        System.out.println("sorted array: " + Arrays.toString(insertionSort(array)));
    }

    /* SELECTION SORT */
    public static int[] selectionSort(int[] array) {

        int minValue, tempValue;

        for (int i = 0; i < array.length; i++) {
            minValue = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValue]) {
                    minValue = j;
                }
            }
            tempValue = array[i];
            array[i] = array[minValue];
            array[minValue] = tempValue;
        }
        return array;
    }


    /* INSERTION SORT */
    public static int[] insertionSort(int[] array) {
        int value;
        int j;

        for (int i = 1; i < array.length; i++) {
            value = array[i];
            for (j = i; array[j - 1] > value; j--) {
                array[j] = array[j - 1];
            }
            array[j] = value;
        }
        return array;
    }
}