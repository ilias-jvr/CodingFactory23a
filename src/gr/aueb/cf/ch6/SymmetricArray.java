package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 8, 4, 3, 2, 1} ;
        boolean isSymmetric = false;

        isSymmetric = isArraySymmetric(arr);
//        isSymmetric = isArrSymmetric(arr);

        System.out.println(isSymmetric);

    }

    public static boolean isArraySymmetric (int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0,j = arr.length -1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }

    public static boolean isArrSymmetric (int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }

}
