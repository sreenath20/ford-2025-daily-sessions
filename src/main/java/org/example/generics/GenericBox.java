package org.example.generics;

public class GenericBox < T extends Child>{
    private T data;

    public GenericBox() {
    }

    public GenericBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
