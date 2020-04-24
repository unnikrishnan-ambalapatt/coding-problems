/**
 * 5. Longest Palindromic Substring
 * <p>
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {

    private static String findLongestPalindromicSubstring(String s) {
        String longestSubStr = "", subStr = "";
        int maxLength = 0;
        if (null != s && !"".equals(s)) {
            for (int i = 0; i <= s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    subStr = s.substring(i, j);
                    if (isPalindrome(subStr)) {
                        if (subStr.length() > maxLength) {
                            maxLength = subStr.length();
                            longestSubStr = subStr;
                        }
                    }
                }
            }
        }
        return longestSubStr;
    }

    private static boolean isPalindrome(String str) {
        boolean isPal = false;
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equals(reverseStr)) {
            isPal = true;
        }
        return isPal;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindromicSubstring("babad"));
        System.out.println(findLongestPalindromicSubstring("cbbd"));
        System.out.println(findLongestPalindromicSubstring("qabcbadabcbaq"));
        System.out.println(findLongestPalindromicSubstring("aba"));
    }
}
