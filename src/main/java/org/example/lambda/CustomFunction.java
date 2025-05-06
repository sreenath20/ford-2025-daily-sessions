package org.example.lambda;

@FunctionalInterface
public interface CustomFunction<T> {
    void display(T name);
   // void display2(String name);
}
