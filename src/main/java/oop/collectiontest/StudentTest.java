package oop.collectiontest;
import java.util.*;


public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();      

        students.add(new Student(2, "Hong"));
        students.add(new Student(3, "Mong"));
        students.add(new Student(4, "Jong"));
        students.add(new Student(5, "Nong"));
        students.add(new Student(1, "Tong"));

        for(Student std : students){
            System.out.println(std.toString());
        }

        Collections.sort(students);
        System.out.println("정렬 후 =========");
        for(Student std : students){
            System.out.println(std.toString());
        }
    }
}
