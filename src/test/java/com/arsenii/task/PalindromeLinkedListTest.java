package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    private PalindromeLinkedList.ListNode head;
    private PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    public void setUp(){
        PalindromeLinkedList.ListNode fourth = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode third = new PalindromeLinkedList.ListNode(2, fourth);
        PalindromeLinkedList.ListNode second = new PalindromeLinkedList.ListNode(2, third);
        head = new PalindromeLinkedList.ListNode(1, second);
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void testPalindrome(){
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void testNonPalindrome(){
        head = new PalindromeLinkedList.ListNode(5, head);
        assertFalse(palindromeLinkedList.isPalindrome(head));
    }


}