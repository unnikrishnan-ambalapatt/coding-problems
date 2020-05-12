import java.util.HashSet;
import java.util.Set;

/**
 * 14. Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String longest = "";
        Set<String> chars = new HashSet<>();
        int position = 0;
        do {
            for (int i = 0; i < strs.length; i++) {
                chars.add(strs[i].substring(position, position + 1));
            }
            longest = strs[0].substring(0, position + 1);
            position++;
        } while (chars.size() == 1);

        return longest;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
