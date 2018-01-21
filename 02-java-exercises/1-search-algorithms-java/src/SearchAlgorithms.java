public class SearchAlgorithms {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        int number = 2;

        System.out.println(linearSearch(array, number));
        System.out.println(binarySearch(array, number));
    }

    /* LINEAR SEARCH */
    public static String linearSearch(int[] array, int searchElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return "The element " + searchElement + " was found at position: " + i + ".";
            }
        }
        return "Element not found.";
    }


    /* BINARY SEARCH */
    public static String binarySearch(int[] array, int searchElement) {
        int min = 0;
        int max = array.length - 1;
        int mid = array[(int) Math.floor(max / 2)];

        while (min <= max) {
            if (mid == searchElement) {
                return "The element " + searchElement + " was found.";
            }
            if (mid < searchElement) {
                min = mid + 1;
            }
            if (mid > searchElement) {
                max = mid - 1;
            }
            mid = (int) Math.floor((min + max) / 2);
        }
        return "Element not found.";
    }
}