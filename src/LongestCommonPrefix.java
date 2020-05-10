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

    public String longestCommonPrefix(String[] strs) {
        String longest = "", temp = "";
        int position = 1;
        temp = strs[0].substring(0, position);
        for (int i = 1; i < strs.length; i++) {
            if(!temp.equals(strs[i].substring(0, position))) {

            }
            temp = strs[i].substring(0, position);
        }
        return longest;
    }

    public static void main(String[] args) {

    }
}
