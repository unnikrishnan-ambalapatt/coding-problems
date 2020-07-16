/**
 * 29. Divide Two Integers
 * <p>
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
 * <p>
 * Example 1:
 * <p>
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Explanation: 10/3 = truncate(3.33333..) = 3.
 * Example 2:
 * <p>
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Explanation: 7/-3 = truncate(-2.33333..) = -2.
 * Note:
 * <p>
 * Both dividend and divisor will be 32-bit signed integers.
 * The divisor will never be 0.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 2^31 − 1 when the division result overflows.
 */
public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        if (dividend == divisor) {
            return 1;
        }
        if (1 == divisor) {
            return dividend;
        }
        int quotient = 0;
        boolean isNegative = false, dividendIncremented = false;
        if (divisor < 0) {
            isNegative = !isNegative;
            divisor = -divisor;
        }
        if (dividend < 0) {
            isNegative = !isNegative;
            if (dividend == Integer.MIN_VALUE) {
                dividend++;
                dividendIncremented = true;
            }
            dividend = -dividend;
        }
        if (dividendIncremented && isNegative) {
            dividend++;
        }
        if ((dividend - divisor) == 0) {
            return isNegative ? -1 : 1;
        }
        // Keep on subtracting divisor from dividend until dividend is less than or equal to 0
        // Quotient is the number of times the above step happened
        while ((dividend - divisor) >= 0) {
            dividend = dividend - divisor;
            quotient++;
        }
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));  //3
        System.out.println(divide(7, -3));  //-2
        System.out.println(divide(0, -3));  //0
        System.out.println(divide(-10, 3)); //-3
        System.out.println(divide(1, 1));   //1
        System.out.println(divide(-1, 1));  //-1
        System.out.println(divide(2147483647, 1));  //2147483647
        System.out.println(divide(-2147483648, -1));//2147483647
        System.out.println(divide(-2147483648, 1)); //-2147483648
        System.out.println(divide(-2147483648, -2147483648));   //1
    }
}
