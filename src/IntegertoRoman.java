import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 12. Integer to Roman
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 *
 * Example 1:
 *
 * Input: 3
 * Output: "III"
 * Example 2:
 *
 * Input: 4
 * Output: "IV"
 * Example 3:
 *
 * Input: 9
 * Output: "IX"
 * Example 4:
 *
 * Input: 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 *
 * Input: 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class IntegertoRoman {

    public static String intToRoman(int num) {
        String roman = "";
        List<String> digits = new ArrayList<>();
        if(num < 1 || num > 3999) {
            return "Input is out of range";
        }
        while(num > 0) {
            digits.add(String.valueOf(num % 10));
            num = num / 10;
        }

        //TODO: Main logic for int to Roman conversion

        return digits.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(250).equals("CCL"));
        System.out.println(intToRoman(2995).equals("MMCMXCV"));
        System.out.println(intToRoman(3999).equals("MMMCMXCIX"));
        System.out.println(intToRoman(1).equals("I"));
        System.out.println(intToRoman(100).equals("C"));
        System.out.println(intToRoman(99).equals("XCIX"));
    }
}
