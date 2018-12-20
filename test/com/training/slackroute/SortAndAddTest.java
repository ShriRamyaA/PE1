package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAndAddTest {

    @Test
    void decreseSort() {
        SortAndAdd sortObj=new SortAndAdd();
        assertEquals("53221",sortObj.decreseSort("32521"));
    }

    @Test
    void addEven() {
        SortAndAdd sortObj=new SortAndAdd();
        assertEquals("4 false",sortObj.addEven("32521"));
    }
}