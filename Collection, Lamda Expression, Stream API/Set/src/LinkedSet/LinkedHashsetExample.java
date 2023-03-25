package LinkedSet;

import java.util.LinkedHashSet;

public class LinkedHashsetExample {

    LinkedHashSet<String> set = new LinkedHashSet<String>();

    public void LinkedHashSet1() {
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
    
    LinkedHashSet set2 = new LinkedHashSet();

    public void LinkedHashSet2() {
        set2.add(1200);
        set2.add(2300);
        set2.add(300);
        set2.add(2300);
        set2.add(500);
        set2.add(300);
        System.out.println(set);
    }
}
