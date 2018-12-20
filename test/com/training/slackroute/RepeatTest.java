package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatTest {

    @Test
    void repeatString() {
        Repeat repeatObj=new Repeat();
        assertEquals("Ramyamyamyamya",repeatObj.repeatString(3,"Ramya"));
    }
}