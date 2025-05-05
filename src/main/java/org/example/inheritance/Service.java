package org.example.inheritance;

public abstract class Service extends Object{

     String name;

    public Service() {
    }

    public Service(String name) {
        this.name = name;
    }

    public abstract void display();
    public void info(){
        System.out.println("application info!");
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                '}';
    }
}
