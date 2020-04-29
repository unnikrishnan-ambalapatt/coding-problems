/**
 * 9. Palindrome Number
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    private static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
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
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
