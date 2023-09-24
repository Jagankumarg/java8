package com.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierLambda {

    public static void main(String args[]){


        Supplier<Integer> supplierObj=()-> 5;
       System.out.println(supplierObj.get());

        //when there is no value present in the list it returns the supplier object
        List<Integer> list= Arrays.asList();

        System.out.println(list.stream().findAny().orElse(supplierObj.get()));
        System.out.println(list.stream().findAny().orElseGet(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        }));





    }
}
