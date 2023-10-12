package com.methodreference;

interface MethodReferenceTest{
    public void instanceMethod(int i);


}

interface MethodReferenceStatic{
    public int staticMethod(int i);


}
public class MethodReferenceDemo {
    public static void main(String args[]){
        //lambda
        MethodReferenceTest test=(i)->System.out.println(i);
        MethodReferenceTest test1=MethodReferenceDemo::getPrintln;

        test1.instanceMethod(2);

        MethodReferenceStatic methodReferenceStatic=MethodReferenceDemo::getAnInt;
       System.out.println(methodReferenceStatic.staticMethod(2));


    }

    private static int getAnInt(int i) {
        return i * 2;
    }

    private static void getPrintln(int i) {
        System.out.println(i);
    }
    private  void getPrintlnStatic(int i) {
        System.out.println(i);
    }
}
