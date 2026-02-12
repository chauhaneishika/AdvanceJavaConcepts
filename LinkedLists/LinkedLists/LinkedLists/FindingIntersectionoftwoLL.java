//Two pointers to the rescue
//hint 1: find the length of both lists hint2 : increment the bigger list by (m-n) times
//where m=length of big list, n=length of small list
package LinkedLists;

public class FindingIntersectionoftwoLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNOde headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        while(tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for(int i=1; i<= steps; i++) {
                tempA = tempA.next;
            }
        }
        else {
            int steps = lengthB - lengthA;
            for(int i=1; i<= steps; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;

    }

}
