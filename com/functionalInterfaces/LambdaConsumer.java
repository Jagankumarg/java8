package com.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String args[]){

        System.out.println("Consumer interface sample");
       Consumer<Integer> consumerObject=o-> System.out.println(o);
       consumerObject.accept(2);

       List<Integer> integerList=Arrays.asList(3,5,2,1,4);

        System.out.println("Annoymous Function");
        integerList.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("lamda");
        //()->{}
        integerList.forEach(integer ->System.out.println(integer));
        //method reference
        System.out.println("method reference");
        //reference::methodname
        integerList.forEach(System.out::println);


    }
}
