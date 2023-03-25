package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    TreeSet<String> set = new TreeSet<String>();

    public void treeSet1() {
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
    
    TreeSet set2 = new TreeSet();

    public void treeSet2() {
        set2.add(1100);
        set2.add(200);
        set2.add(300);
        set2.add(200);
        set2.add(500);
        set2.add(300);
        
        Iterator itr = set2.iterator();
        while (itr.hasNext()) {            
            itr.next();
            System.out.println("hyy");
        }
//        System.out.println(set2);
    }
    
                
//        public void treeSet3() {
////            System.out.println(set2.stream());
//            System.out.println(set2.first());
//        }

}
