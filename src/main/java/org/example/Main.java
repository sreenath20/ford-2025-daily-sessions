package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Integer data= 10;
//
//        String name= "Sreenath";
//        System.out.println("name :" + name.hashCode());
//        String temp;
//        temp = name;
//
//        name = "India";
//        System.out.println("name with different string:" + name.hashCode());
//        System.out.println("Temp :" + temp.hashCode());
//
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
        String name;

        Employee employee;
        employee =  new Employee();
        Employee employee1 = new Employee("ford01","India",50000.0);
        System.out.println(employee.toString());
        System.out.println(employee1);
        employee1.id="ford02";
        employee1.setBirthDate(LocalDate.of(2000,4,1));
        employee1.setJoinDate(LocalDate.now());
        System.out.println(employee1);

        Product product = new Product(1l,"Laptop",45000.0);
        Product product1  = new Product(2l,"Mouse",500.0,0.1f);
        System.out.println(product);
        System.out.println(product1);


//        }


    }
}