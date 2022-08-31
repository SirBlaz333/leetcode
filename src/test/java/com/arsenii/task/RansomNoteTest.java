package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    private RansomNote ransomNote;

    @BeforeEach
    public void setUp(){
        ransomNote = new RansomNote();
    }

    @Test
    public void testDisjointLetters(){
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void testJointLettersButCannotConstruct(){
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void testCanConstruct(){
        assertTrue(ransomNote.canConstruct("ab", "aab"));
    }
}