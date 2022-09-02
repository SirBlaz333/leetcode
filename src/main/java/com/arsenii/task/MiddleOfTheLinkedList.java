package com.arsenii.task;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        int index = Math.floorDiv(list.size(), 2);
        return list.get(index);
    }
}
