package org.example.stream;

public class DemoObject {

    public DemoObject() {
    }

    // Class method
    static void display(String name){

        System.out.println(name);
    }

    //Instance method
    public int fun(int number1,int number2){
        return number1 * number2;
    }
}
