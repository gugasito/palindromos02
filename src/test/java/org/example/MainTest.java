package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String rEsp ="acas";
    boolean rOb=Main.palindromo(rEsp);

    @Test
    void testPalindromo() {
        assertFalse(rOb);
    }
}