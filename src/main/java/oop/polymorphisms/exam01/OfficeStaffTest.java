package oop.polymorphisms.exam01;

public class OfficeStaffTest {
    public static void main(String[] args) {
        Human man = new Human("nyh", 1111);
        System.out.println("남자 이름 : " + man.name);
        System.out.println("주민번호 : " + man.getPrivateNumber());
        System.out.println();

        System.out.println("====== Up Casting ======");
        Staff staff = new Staff("ssh", 2222, "fastCampus", 11111);
        Human woman = staff;
        System.out.println("이름 : " + woman.name);
        System.out.println("주민번호 : " + woman.getPrivateNumber());
        // System.out.println("학교명 : " + woman.schoolName); // => UpCasting시 출력 불가
        // System.out.println("교원 번호 : " + woman.getStaffNumber()); // => UpCasting시 출력 불가

        System.out.println("가지고 있지만 출력하지 못하는 정보들");
        System.out.println("학교명 : " + staff.schoolName);
        System.out.println("교원 번호 : " + staff.getStaffNumber());

        System.out.println();
        System.out.println("--------------------------------");
        OfficeStaff officeStaff = new OfficeStaff("nyh", 11111, "fastCampus", 33333, "경영지원");
        Human human3 = officeStaff; // 사무직원 => 사람 업캐스팅
        Staff staff2 = officeStaff; // 사무직원 => 직원
        System.out.println("이름 : " + human3.name);
        System.out.println("주민번호 : " + human3.getPrivateNumber());

        System.out.println();
        
        System.out.println("--------------------------------");
        System.out.println("학교명 : " + staff2.schoolName);
        System.out.println("교원 번호 : " + staff2.getStaffNumber());
        // System.out.println("부서 : " + human3.department); // => 불가능
        // System.out.println("부서 : " + staff2.department); // => 불가능
        System.out.println("부서 : " + officeStaff.department);
    }
}
