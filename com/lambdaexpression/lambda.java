package com.lambdaexpression;

@FunctionalInterface
interface Operations1{
    void lamdaTest();
}
public class lambda {
    public static void main(String args[]){

        Operations1 op= ()-> System.out.println("Lambda Expression");

        op.lamdaTest();
        //()->{}
    }
}
