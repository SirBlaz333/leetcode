package com.arsenii.task;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 3 == 0) {
               result = result.concat("Fizz");
            }
            if (i % 5 == 0) {
                result = result.concat("Buzz");
            }
            if(result.equals("")){
                result = result.concat(Integer.toString(i));
            }
            list.add(result);
        }
        return list;
    }
}
