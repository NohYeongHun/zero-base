package oop.collectiontest;
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add("A");


        for(String s : arrayList){
            System.out.println(s);
        }

        System.out.println("정렬 후");
        Collections.sort(arrayList);
        for(String s : arrayList){
            System.out.println(s);
        }

        System.out.println("===============");
        for(String s : linkedList){
            System.out.println(s);
        }

        
    }
}
