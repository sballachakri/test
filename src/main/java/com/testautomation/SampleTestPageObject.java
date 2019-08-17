package com.testautomation;

import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleTestPageObject {
    public List<String> searchForAllFromTheTable() {
        List<String> allList = new ArrayList<String>();
        allList.add("a");
        allList.add("b");
        allList.add("c");
        allList.add("e");
        allList.add("f");
        System.out.println(allList);


        return allList;
    }
    public List<String> searchForExcludeFirst() {
        List<String> al = new ArrayList<String>();
        ArrayList<String> al1 = new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("e");
        al.add("f");
        Iterator<String> iterator = al.iterator();
        // to skip first element
        iterator.next();
        while (iterator.hasNext()) {
            al1.add(iterator.next());
        }
        return al1;
    }
}