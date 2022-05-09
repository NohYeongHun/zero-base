package oop.polymorphisms.exam01;

public class OfficeStaff extends Staff {

    public String department;


    public OfficeStaff(String name, long privateNumber, String schoolName, int staffNumber, String department) {
        super(name, privateNumber, schoolName, staffNumber);
        this.department = department;
    }
    
}
