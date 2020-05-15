import java.util.*;

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
        boolean isPresent;
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
                        if (tripletList.size() > 0) {
                            for (List<Integer> list : tripletList) {
                                if (list.containsAll(triplets) && triplets.containsAll(list)) {
                                    isPresent = true;
                                }
                            }
                            if (!isPresent) {
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

    public static Set<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> tripletList = new HashSet<>();
        boolean isPresent;
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
                        tripletList.add(triplets);
                        isPresent = false;
                        if (tripletList.size() > 0) {
                            for (List<Integer> list : tripletList) {
                                if (list.containsAll(triplets) && triplets.containsAll(list)) {
                                    isPresent = true;
                                }
                            }
                            if (!isPresent) {
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
        int[] arr5 = {-9,-14,-3,2,0,-11,-5,11,5,-5,4,-4,5,-15,14,-8,-11,10,-6,1,-14,-12,-13,-11,9,-7,-2,-13,2,2,-15,1,3,-3,-12,-12,1,-2,6,14,0,-4,-13,-10,-12,8,-2,-8,3,-1,8,4,-6,2,1,10,2,14,4,12,1,4,-2,11,9,-7,6,-13,7,-3,8,14,8,10,12,11,-4,-13,10,14,1,-4,-4,2,5,4,-11,-7,3,8,-10,11,-11,-5,7,13,3,-2,8,-13,2,1,9,-12,-11,6};
        System.out.println(threeSum(arr5));
        int[] arr6 = {0,8,2,-9,-14,5,2,-5,-5,-9,-1,3,1,-8,0,-3,-12,2,11,9,13,-14,2,-15,4,10,9,7,14,-8,-2,-1,-15,-15,-2,8,-3,7,-12,8,6,2,-12,-8,1,-4,-3,5,13,-7,-1,11,-13,8,4,6,3,-2,-2,3,-2,3,9,-10,-4,-8,14,8,7,9,1,-2,-3,5,5,5,8,9,-5,6,-12,1,-5,12,-6,14,3,5,-11,8,-7,2,-12,9,8,-1,9,-1,-7,1,-7,1,14,-3,13,-4,-12,6,-9,-10,-10,-14,7,0,13,8,-9,1,-2,-5,-14};
        System.out.println(threeSum(arr6));
        int[] arr7 = {0,8,2,-9,-14,5,2,-5,-5,-9,-1,3,1,-8,0,-3,-12,2,11,9,13,-14,2,-15,4,10,9,7,14,-8,-2,-1,-15,-15,-2,8,-3,7,-12,8,6,2,-12,-8,1,-4,-3,5,13,-7,-1,11,-13,8,4,6,3,-2,-2,3,-2,3,9,-10,-4,-8,14,8,7,9,1,-2,-3,5,5,5,8,9,-5,6,-12,1,-5,12,-6,14,3,5,-11,8,-7,2,-12,9,8,-1,9,-1,-7,1,-7,1,14,-3,13,-4,-12,6,-9,-10,-10,-14,7,0,13,8,-9,1,-2,-5,-14};
        System.out.println(threeSum2(arr7));
    }
}
