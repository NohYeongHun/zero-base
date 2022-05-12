package oop.collectiontest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("1");
        hashSet.add("4");

        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("4");

        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("4");

        Iterator<String> hashSetIterator = hashSet.iterator();
        while(hashSetIterator.hasNext()){
            System.out.println(hashSetIterator.next());
        }

        System.out.println("------------------");
        Iterator<String> linkedHashSIterator = linkedHashSet.iterator();
        while(linkedHashSIterator.hasNext()){
            System.out.println(linkedHashSIterator.next());
        }

        System.out.println("------------------");
        Iterator<String> treeSetIterator = treeSet.iterator();
        while(treeSetIterator.hasNext()){
            System.out.println(treeSetIterator.next());
        }

    }
    
}
