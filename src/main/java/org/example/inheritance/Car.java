package org.example.inheritance;

public class Car implements HybridVehicle{
    @Override
    public void display() {

        Vehicle.info();
        System.out.println("am normal Car");
    }
    @Override
    public void display2() {
        System.out.println("am Hybrid Car");
    }
    @Override
    public  void defaultFun(){
        System.out.println("Its a Car default functionality!");
    }
}
