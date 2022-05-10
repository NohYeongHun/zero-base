package oop.generictest;

public class Box<T>{
    private T data;

    public void setBox(T data){
        this.data = data;
    }

    public T getBox() {
        return data;
    }
}
