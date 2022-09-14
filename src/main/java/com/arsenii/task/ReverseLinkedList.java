package com.arsenii.task;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        return reverse(head, head.next);
    }

    public ListNode reverse(ListNode current, ListNode next){
        if(current != null){
            next = reverse(next, next.next);
            next.next = current;
            return current;
        }
        return current;
    }
}
