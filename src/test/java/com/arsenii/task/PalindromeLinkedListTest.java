package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    private ListNode head;
    private PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    public void setUp(){
        ListNode fourth = new ListNode(1);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(2, third);
        head = new ListNode(1, second);
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void testPalindrome(){
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void testNonPalindrome(){
        head = new ListNode(5, head);
        assertFalse(palindromeLinkedList.isPalindrome(head));
    }


}