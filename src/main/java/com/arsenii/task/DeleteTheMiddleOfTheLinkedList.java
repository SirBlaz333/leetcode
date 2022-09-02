package com.arsenii.task;

import java.util.ArrayList;
import java.util.List;

public class DeleteTheMiddleOfTheLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = beforeMiddleNode(head);
        ListNode nextNode = current.next;
        if(current == head && nextNode == null){
            return null;
        } else if(nextNode == null){
            current.next = null;
        } else {
            current.next = nextNode.next;
        }
        return head;
    }

    public ListNode beforeMiddleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int index = Math.floorDiv(list.size(), 2);
        if(index >= 1){
            index--;
        }
        return list.get(index);
    }
}
