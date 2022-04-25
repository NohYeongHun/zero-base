package polymorphism.exam01;

public class InstanceOfTest {
    
    public static void main(String[] args) {
        Human man = new Human("nyh", 1111);
        Staff manStaff = new Staff("nyh", 12345, "fastCampus", 22222);


        System.out.println("남자 instance of 사람 : " + (man instanceof Human) );
        System.out.println("남자 instance of 교직원 : " + (man instanceof Staff) );
        System.out.println("남자교직원 instance of 사람 : " + (manStaff instanceof Human) );
        System.out.println("남자교직원 instance of 교직원 : " + (manStaff instanceof Staff) );


    }
    
}
