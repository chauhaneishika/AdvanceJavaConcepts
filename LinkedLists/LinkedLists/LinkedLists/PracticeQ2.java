//Find the maximum twin sum of a linked list of even length.
//Twin of any node at (i)th index is the node at (n-i-1)th index.
//Twin sum is the sum of values of a node and its twin.

package LinkedLists;

public class PracticeQ2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        int maxSum = 0;
        ListNode head1 = head;
        ListNode head2 = slow.next;
        while(head2 != null) {
            int sum = head1.val + head2.val;
            if(maxSum < sum) {
                maxSum = sum;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return maxSum;
    }
}



