package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testHello() {
        assertEquals("Hello, Jenkins!", App.hello());
    }
}
