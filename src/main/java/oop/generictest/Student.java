package oop.generictest;

public class Student extends Person{
    public static void main(String[] args) {

        Person p1 = new Person();
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        GeMethod.displayAge(p1);
        GeMethod.displayAge(s1);

        // 불가능
        // GeMethod.displayAge(t1);
    }
}
