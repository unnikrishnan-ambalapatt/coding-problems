import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    static int[] sumOfTwo(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sumOfTwoComplementWay(int[] nums, int target) {
        Map<Integer, Integer> mapOfNumAndComplement = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (mapOfNumAndComplement.containsKey(nums[i])) {
                return new int[]{nums[i], mapOfNumAndComplement.get(nums[i])};
            }
            mapOfNumAndComplement.put(target - nums[i], nums[i]);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] input = {6, 7, 11, 15, 3};
        int target = 9;
        int[] ints = sumOfTwo(input, target);
        System.out.println(ints[0] + ", " + ints[1]);
        int[] ints2 = sumOfTwoComplementWay(input, target);
        System.out.println(ints[0] + ", " + ints[1]);
    }
}