package oop.object.exam01;

public class HashSample {
    public static void main(String[] args) {
        String str1 = "Test";

        System.out.println(str1);
        System.out.println(str1.hashCode());

        Object obj1 = new Object();
        System.out.println(obj1.hashCode());

    }
    
}
