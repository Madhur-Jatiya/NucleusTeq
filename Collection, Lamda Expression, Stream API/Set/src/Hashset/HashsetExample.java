package Hashset;

import java.util.HashSet;

public class HashsetExample {

    HashSet<String> set = new HashSet<String>();

    public void hashSet1() {
        set.add("Madhur Jatiya");
        set.add("Madhur Jatiya");
        set.add("Lokesh");
        set.add("Anurag");
        set.add("Anurag");
        set.add("Raani");
        set.add("Junnu");
        set.add("Piyu");
        System.out.println(set);
    }
    
    HashSet set2 = new HashSet();

    public void hashSet2() {
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(200);
        set2.add(500);
        set2.add(300);
        System.out.println(set2);
    }
    
        HashSet set3 = new HashSet();
        
        public void hashSet3() {
            set3.addAll(set);
            set3.addAll(set2);
            
            
//            System.out.println(set3.hashCode());
//            System.out.println(set3.spliterator());
//            System.out.println(set3.size());
//            set3.retainAll(set);
//            System.out.println(set3.iterator());
            System.out.println(set3);
        }
}
