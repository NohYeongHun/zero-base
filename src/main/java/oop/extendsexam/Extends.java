package oop.extendsexam;

public class Extends {
    public static void main(String[] args) {
        System.out.println("Extends");

        Staff staff = new Staff(22, "nyh", "test","protectedValue", 1);
        System.out.println(staff.name);
        /* 
            priavte 변수의 접근 지정자는
            해당 값을 직접 불러올 수는 없지만
            다른 접근 지정자 권한이 부여된 메소드를 통해
            접근이 가능해질 수 있다.
        */
        staff.protectedPrintSpec();
        staff.publicPrint();
        staff.defaultPrint();
        //staff.privateValuePrint();
        staff.privatePrintPublicMethod();
        
    }
}
