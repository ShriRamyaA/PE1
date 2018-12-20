package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelConsonantTest {

    @Test
    void checkLetter() {
        VowelConsonant vcObj=new VowelConsonant();
        assertEquals("r-consonant a-vowel m-consonant y-consonant a-vowel ",vcObj.checkLetter("ramya"));
    }

}