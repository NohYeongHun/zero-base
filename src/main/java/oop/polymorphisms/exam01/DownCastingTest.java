package oop.polymorphisms.exam01;


public class DownCastingTest {
    public static void main(String[] args) {
        Human man = new Human("nyh", 1111);
        System.out.println("이름 : " + man.name + ", 주민번호 : " + man.getPrivateNumber());

        // Staff staff1 = man; // compile error
        // Staff staff1 = (Staff)man;

        /*
            Error
            왜? => staff1은 다운 캐스팅된 인스턴스 이지만 해당 정보를 갖고 있지 않으므로 에러이다.
            다운 캐스팅은 다운 캐스팅 하고자하는 객체의 정보를 가지고 있는 경우에만 가능하다.
        */
        // System.out.println(staff1.schoolName); 
        // System.out.println(staff1.staffNumber);

        System.out.println("-------------");
        Staff downStaff = new Staff("noh", 12345, "fastCampus", 22222);
        System.out.println("이름 : " + downStaff.name + " , 주민번호: " + ((Human)downStaff).getPrivateNumber());
        System.out.println("학교명 : " + downStaff.schoolName + " , 교원번호: " + downStaff.getStaffNumber());

        Human humanMan = downStaff;
        
        Staff downCastingStaff = (Staff)humanMan;
        System.out.println("------------- DownCasting -------------");
        System.out.println("이름 : " + downCastingStaff.name + ", 주민번호 : " + ((Human)downCastingStaff).getPrivateNumber());
        System.out.println("학교명: " + downCastingStaff.schoolName + ", 교직원 번호 : " + downCastingStaff.getStaffNumber());
        

        
    }
    
    
}
