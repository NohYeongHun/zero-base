package oop.generictest;

public class BoxTest {
    public static void main(String[] args) {
        /* 
            ClassCast Exception
            형 변환을 수행해야 하고
            데이터 형식이 정확하지 않아 오류가 발생
        */
        // Integer count = (Integer)b1.getBox();
        // System.out.println(count);

        /*
            형 변환 수행시마다
            형에 맞는 클래스를 생성할 것인가?.
        */
        BoxInteger b3 = new BoxInteger();
        b3.setBox(25);
        Integer age3 = b3.getBox();
        System.out.println(age3);

        /*
            해결 방안 : 제네릭 클래스
            선언 시 타입이 결정 된다.
        */
        Box<String> b1 = new Box<String>();
        b1.setBox("홍길동");
        String name = b1.getBox();

        System.out.println(name);

        Box<Integer> b2 = new Box<Integer>();
        b2.setBox(25);
        Integer age = b2.getBox();
        System.out.println(age);
    }
    
}
