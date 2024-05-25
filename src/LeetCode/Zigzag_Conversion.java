package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Zigzag_Conversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.convert("PAYPALISHIRING", 5);
    }
}

class Solution {
    public String convert(String s, int numRows) {
        List<String> list = new ArrayList<>();
        char[] charArray = s.toCharArray();
        int i = 1;
        int j = 2;
        System.out.println(s);
        String row = "";
        List<String> resultRowStr = new ArrayList<>();
        for (Character cha : charArray) {
            if (i % (numRows + 1) == 0) {
                row += "'" + " ".repeat(numRows - j - 1) + String.valueOf(cha) + " ".repeat(j) + "'";
                resultRowStr.add(row);
                row = "";
                j = 2;
            } else {
                row += String.valueOf(cha);
                if ((i + 1) % (numRows + 1) == 0) {
                    j--;
                    resultRowStr.add(row);
                    row = "";
                } else if (i == charArray.length) {
                    j--;
                    resultRowStr.add(row);
                }
            }
            System.out.println(resultRowStr);
            i++;
        }
        return "";
    }
}