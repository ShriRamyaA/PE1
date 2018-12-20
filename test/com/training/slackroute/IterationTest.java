package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterationTest {

    @Test
    void printIteration() {
        Iteration iterationObj=new Iteration();
        assertEquals("122333444455555",iterationObj.printIteration(5));
    }
}