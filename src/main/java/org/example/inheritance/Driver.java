package org.example.inheritance;

public class Driver {
    public static void main(String[] args){

//
//
//        Parent parent = new Parent("Ford");
//        parent.display();
//
//        Child child = new Child("India");
//        child.display();
//
//
//        Parent parentRef;
//        parentRef = parent;
//        parentRef.display();
//        parentRef=child;
//        parentRef.display();
//    // Abstraction
//
//        Service service;
//       // service = new Service("Payment");
//        service = new PaymentService("Ford India");
//        service.display();
//
//        // interfaces
//        Vehicle vehicle;
//        Car car = new Car();
//        car.display();
//        car.display2();
//        vehicle = car;
//        vehicle.display();
////        vehicle.display2();
//HybridVehicle hybridVehicle;
//hybridVehicle = car;
//    hybridVehicle.display2();
//    hybridVehicle.display2();
//
//    Employee employee = new Employee();
//    employee = car;

    Parent parent = new Parent();
    Child child = new Child();
    Parent parentRef;
    Child childRef;
 //   childRef =(Child) parent;
        parentRef = child;
        parentRef.parentDisplay();
        //parentRef.childDisplay();
        System.out.println("End of my application");

    Vehicle.info();
    HybridVehicle.info();
    Car car = new Car();
    Vehicle vehicle = car;
    vehicle.defaultFun();
    HybridVehicle hybridVehicle;
    hybridVehicle = car;
    hybridVehicle.defaultFun();




    }

}
