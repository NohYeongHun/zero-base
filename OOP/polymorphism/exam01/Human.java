package polymorphism.exam01;

public class Human {
    public String name;
    public long privateNumber; // 주민번호

    public Human(){}
    public Human(String name, long privateNumber){
        this.name = name;
        this.privateNumber = privateNumber;
    }

    public long getPrivateNumber(){
        return privateNumber;
    }
}
