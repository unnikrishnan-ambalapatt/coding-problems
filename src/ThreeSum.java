import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * 15. 3Sum
 * <p>
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletList = new ArrayList<>();
        boolean isPresent = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < nums.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (0 == (nums[i] + nums[j] + nums[k])) {
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        isPresent = false;
                        Collections.sort(triplets);
                        if (tripletList.size() > 0) {
                            for (List<Integer> list : tripletList) {
                                if (list.containsAll(triplets) && triplets.containsAll(list)) {
                                    isPresent = true;
                                }
                            }
                            if (!isPresent) {
                                Collections.sort(triplets);
                                tripletList.add(triplets);
                            }
                        } else {
                            tripletList.add(triplets);
                        }
                    }
                }
            }
        }
        return tripletList;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1, 0, 0, 0};
        System.out.println(threeSum(arr));
        int[] arr2 = {-1, 0, 1, 2, -1, -4, 5, 2};
        System.out.println(threeSum(arr2));
        int[] arr3 = {3, 4, -2};
        System.out.println(threeSum(arr3));
        int[] arr4 = {7, 3, 2};
        System.out.println(threeSum(arr4));
    }
}
