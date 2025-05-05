package org.example.generics;

public class GenericsDriver {

    public static void main(String [] args){
        Box box = new Box(100); // new Box(100.5);
        System.out.println(box.getData());
//        GenericBox<String> stringBox = new GenericBox<>("Ford");
//        System.out.println(stringBox.getData());
//
//        GenericBox<Double> doubleBox = new GenericBox<>(99.5);
//        System.out.println(doubleBox.getData());

        //GenericBox<Parent> parentBox;
        GenericBox<Child> childBox;
        GenericBox<GrandChild> grandChildBox;

    }
}
