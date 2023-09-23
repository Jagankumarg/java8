package com.lambdaexpression;

interface Addition{
    int addition(int a,int b);
}
public class LambdaWithReturnType {

    public static void main(String[] args){

        Addition res=(a,b)->(a+b);

        System.out.println(res.addition(2,3));

        //()->{}


    }


}
