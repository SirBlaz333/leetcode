package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {
    private MiddleOfTheLinkedList middleOfTheLinkedList;

    @BeforeEach
    public void setUp(){
        middleOfTheLinkedList = new MiddleOfTheLinkedList();
    }

    @Test
    public void testOddSize(){
        ListNode third = new ListNode(2);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        ListNode actual = middleOfTheLinkedList.middleNode(head);
        assertEquals(second, actual);
    }

    @Test
    public void testEvenSize(){
        ListNode fourth = new ListNode(2);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        ListNode actual = middleOfTheLinkedList.middleNode(head);
        assertEquals(third, actual);
    }

}