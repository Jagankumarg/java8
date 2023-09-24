package com.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateLamda {

    public static void main(String[] args){

        //Anonymous implementation
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0)
                    return true;
                else
                return false;
            }
        };

        boolean result=predicate.test(2);
        System.out.println(result);

        //lamda representation
        //()->{}
        Predicate<Integer> predicatelambda=(Integer integer) ->(integer%2==0);

        System.out.println(predicatelambda.test(2));

    };
}
