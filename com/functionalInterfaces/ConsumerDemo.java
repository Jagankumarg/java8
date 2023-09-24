package com.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

public static void main (String args[]){
    Consumer<Integer> obj=new ConsumerDemo();

    obj.accept(2);
}
    @Override
    public void accept(Integer o) {
        System.out.println(o);
    }
}



/*
public class ConsumerDemo {

    public static void main(String[] args){

    }
}
*/
