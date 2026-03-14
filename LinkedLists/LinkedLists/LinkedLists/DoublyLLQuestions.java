package LinkedLists;

public class DoublyLLQuestions {
    //Q1 Palindrome

    // step1: find tail
    // function banana h : boolean isPalindrome
    // while(head != tail) {
    //     if(head.val != tail.val) return false;
    //     head = head.next;
    //     tail = tail.prev;
    // }

    //Q2 Two sum in a doubly ll
    //Sorted list in non-decreasing order, target

    // while(head.val < tail.val) {
    //     if(head.val + tail.val == target) 
    //         System.out.println();
    //     break;
    //     if(head.val + tail.val > target) t = t.prev;
    //     if(head.val + tail.val < target) h = h.next;
    // }

    //Critical Point max and min distance
    // if(t.val > t.prev.val && t.val > t.next.val) c1 = t
    // if(t.val < t.prev.val && t.val < t.next.val) c1 = t

}
