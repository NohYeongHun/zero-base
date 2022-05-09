package oop.polymorphisms.exam01;

public class StaffTest {
    public static void main(String[] args) {

        Staff nyh = new Staff("노영훈", 1111, "패캠", 2222);
        
        System.out.println("====== Default ============");
        System.out.println("이름 : " + nyh.name);
        System.out.println("주민번호 : " + nyh.getPrivateNumber());
        System.out.println("학교명 : " + nyh.schoolName);
        System.out.println("교원번호 : " + nyh.getStaffNumber());

        Human human1 = nyh;
        
        // UpCasting 하면 하위 객체의 멤버를 참조할 수 없음.
        System.out.println("======== Up Casting ============");
        System.out.println("이름 : " + human1.name);
        System.out.println("주민번호 : " + human1.getPrivateNumber());
        // System.out.println(human1.schoolName); => 접근 불가
        // System.out.println(human1.getStaffNumber()); => 접근 불가

    }
}
