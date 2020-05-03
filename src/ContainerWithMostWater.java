/**
 * 11. Container With Most Water
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * Example:
 * <p>
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 */
public class ContainerWithMostWater {

    public static Integer maxVolume(int[] height) {
        int maxVolume = 0, w, h;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                w = j - i;
                if (height[i] >= height[j]) {
                    h = height[j];
                } else {
                    h = height[i];
                }
                if ((h * w) > maxVolume) {
                    maxVolume = h * w;
                }
            }
        }
        return maxVolume;
    }

    public static void main(String[] args) {
        System.out.println(maxVolume(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxVolume(new int[]{1, 1}));
    }
}
