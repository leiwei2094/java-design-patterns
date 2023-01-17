package com.leibangzhu.designpatterns.chain.v2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TemTest {

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");

        String[] arr = list.toArray(new String[list.size()]);

        for (String x : arr)
            System.out.print(x + " ");
    }
}
