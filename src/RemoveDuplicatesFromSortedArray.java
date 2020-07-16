import java.util.Arrays;

/**
 * 26. Remove Duplicates from Sorted Array
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        // Loop through the array
        // For each element, check if the arrays contains that element more than once
        // If yes, shift all elements towards left
        int count = 0, toIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            count = getCount(nums[i], nums, toIndex);
            if (count > 1) {
                toIndex = toIndex - (count - 1);
                leftShift(nums, i, count - 1);
            }
        }
        return toIndex;
    }

    private static void leftShift(int[] arr, int fromIndex, int numOfPlaces) {
        for (int p = 0; p < numOfPlaces; p++) {
            for (int i = fromIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

    private static int getCount(int num, int[] nums, int toIndex) {
        int count = 0;
        for (int i = 0; i < toIndex; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int duplicateCount;
        duplicateCount = removeDuplicates(nums);
        System.out.println("After duplicate removal: " + Arrays.toString(nums));
        System.out.println("Duplicate count: " + duplicateCount);

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        duplicateCount = removeDuplicates(nums2);
        System.out.println("After duplicate removal: " + Arrays.toString(nums2));
        System.out.println("Duplicate count: " + duplicateCount);

        int[] nums3 = {0, 0, 0, 0, 3};
        duplicateCount = removeDuplicates(nums3);
        System.out.println("After duplicate removal: " + Arrays.toString(nums3));
        System.out.println("Duplicate count: " + duplicateCount);
    }
}
