package com.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        if(i%2==0)
            return true;
        else
            return false;
    }

    public static void main(String args[]){


        Predicate<Integer> predicateObj=new PredicateDemo();
       Boolean b= predicateObj.test(2);
       System.out.println(b);
    }
}
