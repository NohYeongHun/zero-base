package oop.object.exam02;

import java.util.Calendar;
import java.util.Date;

public class ToStringSample {
    public static void main(String[] args) {
        
        Object obj1 = new Object();

        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));

        Date dt1 = Calendar.getInstance().getTime();
        System.out.println(dt1.toString());

        String str1 = new String("HongGilDong");
        System.out.println(str1.toString());

        Human Hong = new Human(str1, 20);
        System.out.println("name : " + Hong.toString());
    }
}
