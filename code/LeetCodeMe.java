


// 2. Add Two Numbers
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

// 9. Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        String strInput = String.valueOf(x);
        List<String> strList = Arrays.asList(strInput.split(""));
        Collections.reverse(strList);
        return strList.stream().collect(Collectors.joining()).equals(strInput);
    }
}
