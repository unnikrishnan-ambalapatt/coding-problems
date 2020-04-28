/**
 * 8. String to Integer (atoi)
 * <p>
 * Implement atoi which converts a string to an integer.
 * <p>
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * <p>
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * <p>
 * If no valid conversion could be performed, a zero value is returned.
 * <p>
 * Note:
 * <p>
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. If the numerical value is out of the range of representable values, INT_MAX (2^31 − 1) or INT_MIN (−2^31) is returned.
 * Example 1:
 * <p>
 * Input: "42"
 * Output: 42
 * Example 2:
 * <p>
 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 * Then take as many numerical digits as possible, which gets 42.
 * Example 3:
 * <p>
 * Input: "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 * Example 4:
 * <p>
 * Input: "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical
 * digit or a +/- sign. Therefore no valid conversion could be performed.
 * Example 5:
 * <p>
 * Input: "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 * Thefore INT_MIN (−2^31) is returned.
 */

public class StringToInteger {

    private static int stringToInteger(String str) {
        int num = 0;
        long factor = 1;
        final int ASCII_A = 48;
        boolean isNegative = false;
        if (null == str || "".equals(str.trim())) {
            return num;
        }
        str = str.trim();
        if ('-' == str.charAt(0)) {
            isNegative = true;
            num = num * -1;
        }
        if (str.length() > 1 && ('+' == str.charAt(1) || '-' == str.charAt(1))) {
            return num;
        }
        //Remove leading zeros
        int zeroCounter = 0;
        if (isNegative) {
            zeroCounter = 1;
        }
        for (; zeroCounter < str.length(); zeroCounter++) {
            if ('0' != str.charAt(zeroCounter)) {
                str = str.substring(zeroCounter);
                break;
            } else if (zeroCounter == str.length() - 1) {
                return num;
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                if (c == '+') {
                    continue;
                }
                if (c != '-') {
                    num = 0;
                    factor = 1;
                }
                continue;
            } else {
                if (isNegative) {
                    if (factor > Integer.MAX_VALUE) {
                        num = Integer.MIN_VALUE;
                        break;
                    }
                    if ((num + ((c - ASCII_A) * factor)) < Integer.MIN_VALUE) {
                        num = Integer.MIN_VALUE;
                        break;
                    }
                    num = num - ((c - ASCII_A) * (int) factor);
                } else {
                    if (factor > Integer.MAX_VALUE) {
                        num = Integer.MAX_VALUE;
                        break;
                    }
                    if ((num + ((c - ASCII_A) * factor)) > Integer.MAX_VALUE) {
                        num = Integer.MAX_VALUE;
                        break;
                    }
                    num = num + ((c - ASCII_A) * (int) factor);
                }
                factor = factor * 10;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(stringToInteger("42"));
        System.out.println(stringToInteger("-42"));
        System.out.println(stringToInteger("4193 with words"));
        System.out.println(stringToInteger("words and 987"));
        System.out.println(stringToInteger("-91283472332"));
        System.out.println(stringToInteger("91283472332"));
        System.out.println(stringToInteger("3.14159"));
        System.out.println(stringToInteger("+1"));
        System.out.println(stringToInteger("   00012345678"));
        System.out.println(stringToInteger("    0000000000000   "));
        System.out.println(stringToInteger("-000000000000001"));
        System.out.println(stringToInteger("-+2"));
    }
}
