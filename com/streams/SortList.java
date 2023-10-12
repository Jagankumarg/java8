package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args){
        List<String> str= Arrays.asList("C","D","A");
        System.out.println("Sorting without Streams");
        Collections.sort(str);
        System.out.println(str);
        System.out.println("Sorting using streams");
        System.out.println(str.stream().sorted().toList());




    }
}
