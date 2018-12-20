package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintStringTest {

    @Test
    void checkNumber() {
        PrintString printStringObj=new PrintString();
        assertEquals("Tom",printStringObj.checkNumber(22));
    }


}