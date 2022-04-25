package polymorphism.exam01;

public class Staff extends Human {
    public String schoolName;
    public long staffNumber; // 사원 번호

    public Staff(){}

    public Staff(String name, long privateNumber, String schoolName, int staffNumber){
        // 부모의 생성자 호출
        super(name, privateNumber);
        this.schoolName = schoolName;
        this.staffNumber = staffNumber;
    }

    public long getStaffNumber(){
        return staffNumber;
    }

}
