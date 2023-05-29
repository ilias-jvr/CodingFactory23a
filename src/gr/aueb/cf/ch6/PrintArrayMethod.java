package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει ένα πίνακα με τη χρήση της
 * μεθόδου.
 */
public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] ages = {19, 25, 34, 42};
        printArray(ages);
        printArray(ages, 0, 3);
    }

    public static void printArray (int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
//        if (arr == null) return;
//        if (low < 0 || high > arr.length - 1) return;
        if (arr == null || low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
