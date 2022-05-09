package oop.object.exam01;

import java.util.Calendar;
import java.util.Date;


public class EqualSample{


    public static boolean isEqualString(String str1, String str2){
        if(str1 == null){
            System.out.println("String is null can't compare");
            return false;
        }

        else if(str1.equals(str2)){
            return true;
        }

        return false;        
    }

    public static boolean isYH(String compareStr){
        
        if("YH".equals(compareStr)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);
        
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = null;
        
        
        System.out.println(isEqualString(str1, str2));
        /*
            NullPointer Exception
            String s1 = null;
            String s2 = "obj";

            s1.equals(s2) => Error
            null값은 equals method를 사용할 수 없음

        */
        System.out.println(isEqualString(str3, str1));

        System.out.println("YH? " + isYH("YH"));
        System.out.println("YH? " + isYH("SS"));
    }
}