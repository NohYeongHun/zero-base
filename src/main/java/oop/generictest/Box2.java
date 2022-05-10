package oop.generictest;

public class Box2<T> {

    private T name;
    private T gender;

    public void setData(T name, T gender){
        this.name = name;
        this.gender = gender;
    }

    public T getName() {
        return name;
    }
    public T getGender(){
        return gender;
    }

    
}
