package com.functionalInterfaces;

/**
 *
 */
@FunctionalInterface
interface Calculator {
    void switchOn();
}

public class FunctionalInterfaceDemo {
    public static void main(String args[]) {
        //()->{};
        Calculator call_for_functional_interface = () -> System.out.println("Call for Functional Interface");

        call_for_functional_interface.switchOn();
    }
}
