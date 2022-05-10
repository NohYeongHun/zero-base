package oop.generictest;

public class Box2Test {
    public static void main(String[] args) {
        
        Box2<String> b2 = new Box2<String>();
        b2.setData("홍길동", "남자");

        String name = b2.getName();
        String gender = b2.getGender();

        System.out.println("이름 : " + name + ", 성별 : " + gender);

    }
}
