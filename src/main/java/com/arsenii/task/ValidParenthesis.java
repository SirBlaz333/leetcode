package com.arsenii.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    private static final Map<Character, Character> BRACKETS = new HashMap<>();

    static {
        BRACKETS.put('(', ')');
        BRACKETS.put('{', '}');
        BRACKETS.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> strings = new Stack<>();
        for (Character character : s.toCharArray()) {
            if (BRACKETS.containsKey(character)) {
                strings.push(character);
            } else if (!strings.isEmpty() && character == BRACKETS.get(strings.peek())) {
                strings.pop();
            } else {
                return false;
            }
        }
        return strings.isEmpty();
    }
}
