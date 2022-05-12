package oop.collectiontest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Object> treeMap = new TreeMap<>();

        hashMap.put("B", "B-value");
        hashMap.put("C", "C-value");
        hashMap.put("D", "D-value");
        hashMap.put("A", "A-value");
        hashMap.put("B", "B-value");

        treeMap.put("B", "B-value");
        treeMap.put("A", "A-value");
        treeMap.put("D", "D-value");
        treeMap.put("C", "C-value");
        treeMap.put("B", "B-value");
        
        System.out.println( hashMap.get("A"));


        for(String key : hashMap.keySet()){
            System.out.println(key + " : " + hashMap.get(key));
        }
        
        System.out.println("-----------------");
        System.out.println( treeMap.get("A"));

        for(String key : treeMap.keySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }


        HashMap<String, Object> member = new HashMap<>();
        member.put("user_id", "superman");
        member.put("password", "1234");
        member.put("gender", "M");
        member.put("age", 20);
        member.put("using_yn", true);

        System.out.println("회원 아이디 : " + member.get("user_id"));
    }
}
