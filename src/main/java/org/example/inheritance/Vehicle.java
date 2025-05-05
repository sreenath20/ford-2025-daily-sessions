package org.example.inheritance;

public interface Vehicle {

  public abstract  void display();

  public static void info(){
    System.out.println("Parent Utility for all");
  }

  public default void defaultFun(){
    System.out.println("Its a parent default functionality!");
  }

}
