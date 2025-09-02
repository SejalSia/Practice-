import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class nelinkedlist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push digits into stacks
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        // Pop and add digits
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;
        }

        return result;
    }
}