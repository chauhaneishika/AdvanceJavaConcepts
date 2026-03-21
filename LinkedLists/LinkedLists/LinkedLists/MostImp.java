// Given a linked list, split it into two lists such that one contains
// odd values, while the other contains even values.
package LinkedLists;

public class MostImp {
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
    public ListNode[] splitOddEven(ListNode head) {
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        ListNode curr = head;

        while(curr != null) {
            if(curr.val % 2 == 0) {
                evenTail.next = curr;
                evenTail = evenTail.next;
            } else {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }
        evenTail.next = null; 
        oddTail.next = null;

        return new ListNode[]{oddDummy.next, evenDummy.next};

    }
}
}



// Remove dupicates from a sorted Linked List
