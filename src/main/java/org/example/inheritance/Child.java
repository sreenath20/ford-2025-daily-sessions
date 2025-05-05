package org.example.inheritance;

public class Child extends Parent{
    public Child(){}
    public Child(String name) {
        super(name);
    }
    public void childDisplay(){
        System.out.println("child:"+super.name);
    }

    // @Override
    public void display(){
        System.out.println("child:"+super.name);
    }
}
