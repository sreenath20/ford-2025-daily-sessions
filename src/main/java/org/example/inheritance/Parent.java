package org.example.inheritance;

public class Parent extends Object{
    String name;

    public Parent() {
    }

    public Parent(String name) {
        this.name = name;
    }
    public void parentDisplay() {
        System.out.println("Am Parent ");
    }

    public void display() {
        System.out.println("Parent :" + name);
    }
}
