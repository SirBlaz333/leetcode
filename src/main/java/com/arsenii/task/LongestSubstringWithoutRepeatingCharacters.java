package com.arsenii.task;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> characters = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int i = 0; i< s.length(); i++){
            if(characters.containsKey(s.charAt(i))){
                start = Math.max(start, characters.get(s.charAt(i)) + 1);
            }
            characters.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
