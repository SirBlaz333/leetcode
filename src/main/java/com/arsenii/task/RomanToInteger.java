package com.arsenii.task;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is designed to implement solution for leetcode problem number 13 (Roman to Integer)
 *
 * @author Arsenii
 */
public class RomanToInteger {
    private final Map<String, Integer> romanToInt;

    public RomanToInteger() {
        romanToInt = new HashMap<>();
        romanToInt.put("I", 1);
        romanToInt.put("IV", 4);
        romanToInt.put("V", 5);
        romanToInt.put("IX", 9);
        romanToInt.put("X", 10);
        romanToInt.put("XL", 40);
        romanToInt.put("L", 50);
        romanToInt.put("XC", 90);
        romanToInt.put("C", 100);
        romanToInt.put("CD", 400);
        romanToInt.put("D", 500);
        romanToInt.put("CM", 900);
        romanToInt.put("M", 1000);
    }

    public int romanToInt(String s) {
        int index = 0;
        int number = 0;
        while (index < s.length()) {
            String roman = getRoman(s, index);
            index += roman.length();
            number += romanToInt.get(roman);
        }
        return number;
    }

    private String getRoman(String s, int index) {
        String roman = null;
        try {
            roman = s.substring(index, index + 1);
            String twoCharNumber = s.substring(index, index + 2);
            if (romanToInt.get(twoCharNumber) != null) {
                roman = twoCharNumber;
            }
        } catch (IndexOutOfBoundsException e){
            //Do nothing
        }
        return roman;
    }
}
