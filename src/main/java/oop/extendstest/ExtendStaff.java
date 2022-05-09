package oop.extendstest;

import oop.extendsexam.Staff;

public class ExtendStaff extends Staff{

    ExtendStaff(int age, String name, String privateValue,  String protectedValue, int focus) {
        super(age, name, privateValue, protectedValue, focus);
        System.out.println("ExtendStaff 생성자 호출");
    }

    void extendsValuePrint(){
        System.out.println("Extends Age : " + this.age);
        System.out.println("Extends Name : " + this.name);
        System.out.println("Extends protectedValue : " + this.protectedValue);
    }

    
}
