package oop.object.exam03;

public class EncodingTest {
    public static void main(String[] args) {
        String name = "Hong";
        int age = 24;
        double weight = 80.1;

        System.out.println("이름 : " + name + ", 나이: " + age + ", 몸무게: " + weight);

        String display = String.format("이름 : %s, 나이: %d, 몸무게: %.2f",
            name, age, weight);
        System.out.println(display);
    }
    
}
