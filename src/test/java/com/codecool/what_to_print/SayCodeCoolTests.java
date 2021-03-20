package com.codecool.what_to_print;

import org.junit.Test;
import static org.junit.Assert.*;

public class SayCodeCoolTests {
    private final static String[] words = new String[]{"Code", "Cool", "Apple"};

    @Test
    public void testCode() {
        assertEquals("Code", Challenge.decideAndSay(words, 3));
    }

    @Test
    public void testCool() {
        assertEquals("Cool", Challenge.decideAndSay(words, 7));
    }

    @Test
    public void testCodeCool() {
        assertEquals("CodeCool", Challenge.decideAndSay(words, 21));
    }

    @Test
    public void testEmpthyString() {
        assertEquals("", Challenge.decideAndSay(words, 10));
    }
}