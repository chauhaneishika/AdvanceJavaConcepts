//Copy List with Random Pointer: Construct a deep copy of linked list where each node contains
// an additional random pointer which could point to any node in the list or null.
// Step1: Deep Copy
// Step2: Connect the list
package LinkedLists;

public class CopyList {
    public class Node {
        int val;
        Node next;
        Node() {};
        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public Node copyRandomList(Node head) {
        // 7 13 11 10 1
        // n 7 1 11 7
        // 0
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        // creating deep copy 
        while(temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;

        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;
        //alternate connections

        Node temp = new Node(-1);
        while(temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp2 = head2;
        temp1 = head;
        // assigning random pointers
        while(temp1 != null && temp2 != null) {
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp1 != null) temp2 = temp1.next;
        }
        temp2 = head;
        temp1 = head;
        // separating the list
        while(temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1 == null) break;
            temp2.next = temp1.next;
            if(temp2.next == null) break;
             temp2 = temp2.next;
        }
        return head2;
    }
}
