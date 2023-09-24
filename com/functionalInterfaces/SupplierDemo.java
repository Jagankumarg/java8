package com.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<Integer> {
    @Override
    public Integer get() {
        return 1;
    }

    public static void main(String args[]){
        System.out.println(new SupplierDemo().get());
    }
}
