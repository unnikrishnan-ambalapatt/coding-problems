import java.util.Arrays;

/**
 * Given an integer array, output all pairs that sum up to a specific value k.
 */
public class ArrayPairSum {

    /**
     * Intuitive way with complexity O(N^2).
     *
     * @param arr - Given array
     * @param k   - Sum
     */
    public static void arrayPairSum(int[] arr, int k) {
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (k == i + j) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }

    /**
     * Two pointer way, scanning from both ends with O(NlogN) complexity.
     *
     * @param arr - Given array
     * @param k   - Sum
     */
    public static void arrayPairSumUnique(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (k == arr[i] + arr[j]) {
                System.out.println(arr[i] + ", " + arr[j]);
                i++;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, -15, 20, -11, 1, 25, 32, 56, 32, 64};
        arrayPairSum(arr, 10);
        System.out.println("-----");
        arrayPairSumUnique(arr, 10);
    }
}
