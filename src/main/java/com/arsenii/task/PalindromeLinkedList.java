package com.arsenii.task;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int listSize = list.size();
        for (int i = 0; i < Math.floorDiv(listSize, 2); i++) {
            if (!list.get(i).equals(list.get(listSize - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
