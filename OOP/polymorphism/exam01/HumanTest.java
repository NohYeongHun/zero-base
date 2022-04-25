package polymorphism.exam01;

import javax.sound.sampled.SourceDataLine;

public class HumanTest {

    public static void main(String[] args) {

        Human human = new Human();
        System.out.println(human.name);
        
        Human human1 = new Human("노영훈", 1111);
        System.out.println("이름 : " + human1.name);
        System.out.println("주민번호 : " + human1.privateNumber);
    }
    
    
    
}
