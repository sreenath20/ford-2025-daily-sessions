package org.example.inheritance;

public class PaymentService extends Service{

    public PaymentService(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Payment Service :"+ super.name);
    }
}
