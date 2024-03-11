// 2. Add Two Numbers
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}


// 148. Sort List 
// Medium
class Solution {
    public ListNode sortList(ListNode head) {
       List<Integer> intFirstList = new ArrayList<>();
        while (head != null) {
            intFirstList.add(head.val);
            if (head.next == null) {
                break;
            }
            head = head.next;
        }
        Optional<ListNode> result = intFirstList.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).mapToObj(a -> new ListNode(a)).reduce((a, b) -> {
                    b.next = a;
                    return b;
                }
        );
        return result.isPresent() ? result.get() : null;
    }
}
