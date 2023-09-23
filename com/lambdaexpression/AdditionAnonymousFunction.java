package com.lambdaexpression;

interface Addition1{
    int addition(int a, int b);
}
public class AdditionAnonymousFunction implements Addition1 {
    @Override
    public int addition(int a, int b) {
        return a+b;
    }
    public static void main(String args[]){
        AdditionAnonymousFunction j=new AdditionAnonymousFunction();

        int a=j.addition(2,3);
        System.out.println(a);
    }
}
