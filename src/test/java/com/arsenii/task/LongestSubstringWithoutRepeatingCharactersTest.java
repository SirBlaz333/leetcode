package com.arsenii.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testOnlyOneLetter(){
        String s = "bbbbbbb";
        int expected = 1;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimpleString(){
        String s = "abcabcbb";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubsequence(){
        String s = "pwwkew";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testOneChar(){
        String s = "a";
        int expected = 1;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        String s = "aab";
        int expected = 2;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        String s = "vdvf";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        String s ="tmmzuxt";
        int expected = 5;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        String s ="bbtablud";
        int expected = 6;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        String s = "aabaab!bb";
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}