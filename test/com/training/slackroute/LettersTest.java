package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LettersTest {

    @Test
    void findLetterType() {
        Letters letterObj=new Letters();
        assertEquals("a is a small letter",letterObj.findLetterType('a'));
    }
}