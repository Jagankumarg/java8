package com.lambdaexpression;

@FunctionalInterface
interface Operations{
    void lamdaTest();
}
public class AnonymousFunction implements Operations1{
    @Override
    public void lamdaTest() {
        System.out.println("Lambda Expression");
    }

    public static void main(String args[]){
        new AnonymousFunction().lamdaTest();
    }
}
