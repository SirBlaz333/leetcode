package com.arsenii.task;

public class ReverseInteger {
    public int reverse(int x) {
        int sign = 1;
        if (x <= 0) {
            sign = -1;
        }
        long number = 0;
        x = sign * x;
        while (x > 0) {
            number = number * 10 + (x % 10);
            x /= 10;
        }
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            return 0;
        }
        return sign * (int) number;
    }
}
