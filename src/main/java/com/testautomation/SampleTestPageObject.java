package com.testautomation;

import java.util.ArrayList;
import java.util.List;

public class SampleTestPageObject {

    List<String> allList = new ArrayList<String>();

    public List<String> searchForAllFromTheTable() {
        allList.add("a");
        allList.add("b");
        allList.add("c");
        allList.add("e");
        allList.add("f");

         return allList;

//        if (allList.contains(searchValue)) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
