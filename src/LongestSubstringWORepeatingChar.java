import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWORepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, length = 0;
        String subStr = "";
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (subStr.contains(s.substring(i, i + 1))) {
                if (charIndexMap.containsKey(s.charAt(i))) {
                    subStr = s.substring(charIndexMap.get(s.charAt(i)), i);
                }
                length = subStr.length();
            } else {
                max = Math.max(max, ++length);
                subStr = subStr + s.charAt(i);
            }
            charIndexMap.put(s.charAt(i), i);
        }

        return max;
    }
}
