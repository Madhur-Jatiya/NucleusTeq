package arraylistsortusingcomparator;

import java.util.ArrayList;

public class ArrayListSortUSingComparator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(135);
        list.add(123);
        list.add(1324);
        list.add(1634);
        list.add(165);
        list.add(143);
        list.add(781);
        
        System.out.println("Before Sort");
        
        for (Integer integer : list) {
            System.out.println(integer);
        }
        
        SortByValue sortByValue = new SortByValue();
        
        list.sort(sortByValue);
        
        System.out.println("\nAfter Sort");
        
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
    
}
