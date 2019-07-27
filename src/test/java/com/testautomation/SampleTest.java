package com.testautomation;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

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
        asserting();
    }
    // This method is for assertion
    private void assertingThatCorrectRowIsRemoved() {

        assertThat("wrong description row is deleted, please investigate",
        sampleTestPageObject.searchForAllFromTheTable(),
                contains(row1,row2,row3,row4,row5));

    }

    private void asserting()
    {
        assertThat("something",
                sampleTestPageObject.searchForExcludeFirst(),
                contains(row2,row3,row4,row5));
    }

}