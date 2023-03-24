package ArrayListQuestion1;

import java.util.*;

public class UniqueElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);

        //Before Operation
        System.out.println("Before Delete Unique Elements");
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        
        //After Operation
        System.out.println("After Delete Unique Elements");
        System.out.println(list);
    }
}
