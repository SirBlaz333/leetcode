package com.arsenii.task;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String token : tokens) {
            try {
                numbers.push(Integer.parseInt(token));
            } catch (Exception e) {
                numbers.push(calculateRPN(numbers.pop(), numbers.pop(), token));
            }
        }
        return numbers.pop();
    }

    private int calculateRPN(int number2, int number1, String operator) {
        if (operator.equals("+")) {
            return number1 + number2;
        }
        if (operator.equals("-")) {
            return number1 - number2;
        }
        if (operator.equals("*")) {
            return number1 * number2;
        }
        if (operator.equals("/")) {
            return number1 / number2;
        }
        return 0;
    }
}
