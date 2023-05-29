package gr.aueb.cf.ch10;

/**
 * Assume an array: { 1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 9, 9 }.
 * The App returns the low and high inder for a key (integer key)
 * that is included int the array. If the key was 8, the algorithm
 * should return {7, 9}
 */
public class Ch6LowAndHighIndexApp {

    public static void main(String[] args) {

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }

        return new int[] { low, high };
    }
}
