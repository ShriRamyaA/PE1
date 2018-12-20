package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseString() {
        Reverse revObj=new Reverse();
        assertEquals("nodnol",revObj.reverseString("london"));
    }
}