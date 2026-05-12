package com.codeprep;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    @Test
    public void testPalindromeTrue() {
        String input = "a dog! a panic in a pagoda.";
        assertTrue(ValidPalindrome.is_palindrome_valid(input),
                   "Should return true for valid palindrome");
    }

    @Test
    public void testPalindromeFalse() {
        String input = "abc123";
        assertFalse(ValidPalindrome.is_palindrome_valid(input),
                    "Should return false for invalid palindrome");
    }
}

