package comparablehashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ComparableHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(135);
        set.add(123);
        set.add(1324);
        set.add(1634);
        set.add(165);
        set.add(143);
        set.add(781);
        
        System.out.println("Before Sort");
        
        for (Integer integer : set) {
            System.out.println(integer);
        }
        
        SortByValue sortByValue = new SortByValue();
        ArrayList<Integer> list = new ArrayList<>(set);
        
        System.out.println("\nAfter Sort");
        list.sort(sortByValue);
        
        HashSet<Integer> set1 = new HashSet<>(list);
        //Not Possible
        for (Integer integer : set1) {
            System.out.println(integer);
        }
        
    }
    
}
