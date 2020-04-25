/**
 * ZigZag Conversion
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */

public class ZigZagConversion {

    private static String convertToZigZag(String s, int numRows) {
        String[][] arr = new String[numRows][];
        String convertedStr = "";
        int charPointer = 0, rowCounter = 0, colCounter = 0;

        //TODO: Approach:
        //Go top to botton until 'numRows' is reached.
        //Then go diagonally from bottom-left to top-right 'numRows' times.
        //Repeat both the above steps until all characters are run out from s.
        return convertedStr;
    }
}
