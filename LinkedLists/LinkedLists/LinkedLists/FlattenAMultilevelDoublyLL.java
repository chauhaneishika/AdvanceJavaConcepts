package LinkedLists;

public class FlattenAMultilevelDoublyLL {
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

    public Node flatten(Node head) {
        Node temp = head;
        while(temp != null) {
            Node t = temp.next;
            if(temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                // c ko aage le jaao
                while(c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if(t != null ) t.prev = c;
            }
            temp.child = null; // very imp
            temp = t;
        }
        return head;
    }

}
