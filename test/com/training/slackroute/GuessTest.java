package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTest {

    @Test
    void guessNum() {
        Guess guessObj=new Guess();
        assertEquals("You guessed it right!",guessObj.guessNum(76));
    }
}