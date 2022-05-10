package oop.generictest;

public class GeMethod {
    
    public <T> void print(T[] item){
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public static <T> void print2(T[] item){
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public static <T extends String> void firstStringPrint(T str){

        if(str.length() >0){
            System.out.println(str.charAt(0));
        }
    }

    public static <T extends Person> void displayAge(T item){
        System.out.println(item.getAge());
    }
}
