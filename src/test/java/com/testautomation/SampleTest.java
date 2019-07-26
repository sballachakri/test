package com.testautomation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;

// To ensure d is removed and assert that a, b, c, e, f appear in the table.
public class SampleTest {

    private String toBeDeletedRow = "d";
    private String row1 = "a";
    private String row2 = "b";
    private String row3 = "c";
    private String row4 = "e";
    private String row5 = "f";

    private SampleTestPageObject sampleTestPageObject;

    @Test
    public void sampleTest() {

        sampleTestPageObject = new SampleTestPageObject();
        // code  present here performing all the operation including deleting d
        //using SampleTestPageObject methods

        //////
        assertingThatCorrectRowIsRemoved();
    }

    // This method is for assertion
    private void assertingThatCorrectRowIsRemoved() {

        ArrayList<String> aList=new ArrayList<String>();

        aList.add(row1);
        aList.add(row2);
        aList.add(row3);
        aList.add(row4);
        aList.add(row5);

        assertThat("wrong description row is deleted, please investigate",
                sampleTestPageObject.searchForAllFromTheTable().containsAll(aList));

        System.out.println(sampleTestPageObject.searchForAllFromTheTable().containsAll(aList));
    }

}