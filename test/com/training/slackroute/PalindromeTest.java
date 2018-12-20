package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkPalindrome() {
        Palindrome palindrome=new Palindrome();
        assertEquals("true false",palindrome.checkPalindrome("123321"));
    }
}