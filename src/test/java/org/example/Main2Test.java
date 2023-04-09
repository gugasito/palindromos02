package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    String rEsp = "a na";
    boolean rOb = Main2.esPalindromo(rEsp);

    @Test
    void testPalindromo() {
        assertTrue(rOb);
    }
}