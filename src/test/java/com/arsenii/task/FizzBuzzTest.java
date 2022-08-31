package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testInput3(){
        List<String> result = fizzBuzz.fizzBuzz(3);
        assertEquals(List.of("1","2","Fizz"), result);
    }

    @Test
    public void testInput5(){
        List<String> result = fizzBuzz.fizzBuzz(5);
        assertEquals(List.of("1","2","Fizz","4","Buzz"), result);
    }

    @Test
    public void testInput15(){
        List<String> result = fizzBuzz.fizzBuzz(15);
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), result);
    }
}