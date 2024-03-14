


2. Add Two Numbers
// Medium
import java.math.BigInteger;
import java.util.Arrays;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1StrBuilder = new StringBuilder();
        while (true) {
            l1StrBuilder.append(l1.val);
            if (l1.next == null) {
                break;
            }
            l1 = l1.next;
        }
        StringBuilder l2StrBuilder = new StringBuilder();
        while (true) {
            l2StrBuilder.append(l2.val);
            if (l2.next == null) {
                break;
            }
            l2 = l2.next;
        }
        String bigInteger = new BigInteger(l1StrBuilder.reverse().toString()).
                add(new BigInteger(l2StrBuilder.reverse().toString())).toString();
        String[] strArray = new StringBuilder().append(bigInteger)
                .toString().split("");
        ListNode resultNode = Arrays.stream(strArray).mapToInt(Integer::parseInt).mapToObj(a -> new ListNode(a)).reduce((a, b) -> {
                    b.next = a;
                    return b;
                }
        ).get();
        return resultNode;    
    }
}

4. Median of Two Sorted Arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        list = list.stream().sorted().collect(Collectors.toList());
        return list.size() % 2 != 0 ? list.get(list.size() / 2) : (double) (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2;
    }
}

9. Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        String strInput = String.valueOf(x);
        List<String> strList = Arrays.asList(strInput.split(""));
        Collections.reverse(strList);
        return strList.stream().collect(Collectors.joining()).equals(strInput);
    }
}


10. Regular Expression Matching
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isMatch(String s, String p) {
        if (p.contains(".") || p.contains("*")) {
            while (p.contains("**")) {
                p = p.replaceAll("\\*\\*", "\\*");
            }
            String regexp = "^" + p + "$";
            Matcher matcher = Pattern.compile(regexp).matcher(s);
            return matcher.find();
        } else {
            return s.equals(p);
        }
    }
}

12. Integer to Roman
class Solution {
    enum Roman {
        M(1000), CM(900),D(500),CD(400),C(100),XC(90),L(50),XL(40),X(10),IX(9),V(5),IV(4),I(1);
        
        int num;

        Roman(int num) {
            this.num = num;
        }
    }

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            for (Roman roman : Roman.values()) {
                if (num >= roman.num) {
                    stringBuilder.append(roman.toString());
                    num -= roman.num;
                }
            }
        }
        return stringBuilder.toString();
    }
}

13. Roman to Integer
class Solution {
    public int romanToInt(String s) {
        return Arrays.stream(s.replace("IV", "4 ")
                .replace("IV", "4 ")
                .replace("IX", "9 ")
                .replace("XL", "40 ")
                .replace("XC", "90 ")
                .replace("CD", "400 ")
                .replace("CM", "900 ")
                .replace("I", "1 ")
                .replace("V", "5 ")
                .replace("X", "10 ")
                .replace("L", "50 ")
                .replace("C", "100 ")
                .replace("D", "500 ")
                .replace("M", "1000 ").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
}
