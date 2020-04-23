import java.util.Arrays;

/**
 * 4. Median of Two Sorted Arrays
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOfSortedArrays {

    public static double getMedianOf(int[] nums1, int[] nums2) {
        double median = 0;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[nums1.length + nums2.length];
        while (true) {
            if (i >= nums1.length && j < nums2.length) {
                merged[k++] = nums2[j++];
            } else if (i < nums1.length && j >= nums2.length) {
                merged[k++] = nums1[i++];
            } else if (i >= nums1.length && j >= nums2.length) {
                break;
            } else {
                if (nums1[i] < nums2[j]) {
                    merged[k++] = nums1[i++];
                } else if (nums1[i] > nums2[j]) {
                    merged[k++] = nums2[j++];
                } else {
                    merged[k++] = nums1[i++];
                    merged[k++] = nums2[j++];
                }
            }
        }
        if (merged.length % 2 == 0) {
            median = (merged[(merged.length / 2) - 1] + merged[merged.length / 2]) / 2d;
        } else {
            median = merged[(merged.length / 2)];
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double median = getMedianOf(nums1, nums2);
        System.out.println("Median of " + Arrays.toString(nums1) + " and " + Arrays.toString(nums2) + " is " + median);
        int[] nums3 = {1, 3};
        int[] nums4 = {2};
        median = getMedianOf(nums3, nums4);
        System.out.println("Median of " + Arrays.toString(nums3) + " and " + Arrays.toString(nums4) + " is " + median);
    }
}
