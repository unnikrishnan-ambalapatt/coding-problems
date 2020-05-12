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
        boolean shorterStrFound;
        do {
            chars.clear();
            shorterStrFound = false;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < position + 1) {
                    shorterStrFound = true;
                    continue;
                }
                chars.add(strs[i].substring(position, position + 1));
            }
            if (chars.size() == 1 && strs[0].length() >= position + 1 && !shorterStrFound) {
                longest = longest + strs[0].substring(position, position + 1);
            }
            position++;
        } while (chars.size() == 1);

        return longest;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(arr2));
        String[] arr3 = {"", "b"};
        System.out.println(longestCommonPrefix(arr3));
        String[] arr4 = {"aa", "a"};
        System.out.println(longestCommonPrefix(arr4));
    }
}
