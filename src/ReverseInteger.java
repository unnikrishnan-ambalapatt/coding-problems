/**
 * 7. Reverse Integer
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 */
public class ReverseInteger {

    public static int reverse(int x) {
        char [] chars = String.valueOf(x).toCharArray();
        String reversedStr = "";
        for(int i = chars.length - 1; i >= 0; i--) {
            reversedStr = reversedStr + chars[i];
        }
        if(reversedStr.charAt(reversedStr.length() - 1) == '-') {
            reversedStr = '-' + reversedStr.substring(0, reversedStr.length() - 1);
        }
        int i = 0;
        try {
            i = Integer.parseInt(reversedStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
}
