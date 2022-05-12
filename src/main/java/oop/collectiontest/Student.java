package oop.collectiontest;

public class Student implements Comparable<Student>{
    private int no;
    private String name;

    public Student(int no, String name){    
        this.no = no;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.no - o.no;
    }

    @Override
    public String toString(){   
        
        return String.format("학번 " + no + ", 이름 : " + name);
    }
}
