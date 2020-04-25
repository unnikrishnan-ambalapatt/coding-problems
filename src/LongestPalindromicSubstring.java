import java.util.HashSet;
import java.util.Set;

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
        Set<String> encountered = new HashSet<>();
        if (null != s && !"".equals(s)) {
            for (int i = 0; i <= s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    subStr = s.substring(i, j);
                    if (subStr.length() <= maxLength || encountered.contains(subStr)) {
                        continue;
                    }
                    if (isPalindromeFaster(subStr)) {
                        encountered.add(subStr);
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

    private static boolean isPalindromeFaster(String str) {
        boolean isPal = false;
        String reverseStr = "";
        if (str.length() == 1) {
            return true;
        }
        if (str.length() % 2 == 0) {
            for (int i = str.length() - 1; i >= str.length() / 2; i--) {
                reverseStr = reverseStr + str.charAt(i);
            }
        } else {
            for (int i = str.length() - 1; i > str.length() / 2; i--) {
                reverseStr = reverseStr + str.charAt(i);
            }
        }
        if (str.substring(0, str.length() / 2).equals(reverseStr)) {
            isPal = true;
        }
        return isPal;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindromicSubstring("babad"));
        System.out.println(findLongestPalindromicSubstring("cbbd"));
        System.out.println(findLongestPalindromicSubstring("qabcbadabcbaq"));
        System.out.println(findLongestPalindromicSubstring("aba"));
        System.out.println(findLongestPalindromicSubstring("abcbad"));
        long startTime = System.currentTimeMillis();
        System.out.println(findLongestPalindromicSubstring("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) / 1000);
    }
}
