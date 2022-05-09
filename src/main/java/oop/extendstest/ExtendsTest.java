package oop.extendstest;

import oop.extendsexam.Staff;

public class ExtendsTest {
    public static void main(String[] args) {
        System.out.println("Human => Staff 상속");
        Staff staff = new Staff(22, "nyh", "privateValue", "protectedValue", 10);
        /* 
            priavte 변수의 Scope는
            해당 값을 직접 불러올 수는 없지만
            다른 접근 지정자 권한이 부여된 메소드를 통해
            접근이 가능해질 수 있다.

            default, protected 접근 지정자는 다른 패키지에서는 사용이 불가능하다.
            default : 선언된 해당 패키지 내부에서 자유롭게 사용가능 => 다른 패키지에서는 사용 불가능
            protected : 상속받은 클래스 또는 해당 패키지 내부에서만 사용 가능함.  
            다른 패키지 에서는 private 접근지정자를 사용 불가능
        */
        staff.publicPrint();
        staff.protectedValuePrint();
        //staff.protectedPrintSpec(); => ERROR
        //staff.defaultPrint(); => ERROR
        //staff.privateValuePrint(); => ERROR
        staff.privatePrintPublicMethod();

        System.out.println();

        System.out.println("Human => Staff => ExtendStaff 상속");
        ExtendStaff extendStaff = new ExtendStaff(22, "nyh", "privateValue", "protectedValue", 10);
        extendStaff.publicPrint();
        // default 접근 지정자는 선언된 해당 패키지 내부에서만 사용 가능하다 => 상속해도 사용이 불가능하다.
        // extendStaff.defaultPrint(); => ERROR
        extendStaff.protectedValuePrint();
        extendStaff.privatePrintPublicMethod();

        System.out.println();

        System.out.println("=== 변경 전 ===");
        extendStaff.valuePrint();
        System.out.println();
        System.out.println("=== 변경 후 ===");
        extendStaff.age = 10;
        extendStaff.valuePrint();
        extendStaff.extendsValuePrint();
        extendStaff.protectedValuePrint();
    }
}
