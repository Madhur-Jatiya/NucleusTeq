package ArrayListQuestion1;

import java.util.*;

public class UniqueElement2 {

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

        List<Integer> list2 = new ArrayList<>();

        //Before Operation
        System.out.println("Before Delete Unique Elements");
        System.out.println(list);

        for (Integer integer : list) {
            if (!list2.contains(integer)) {
                list2.add(integer);
            }
        }

        list.clear();
        list.addAll(list2);

        //After Operation
        System.out.println("After Delete Unique Elements");
        System.out.println(list);
    }
}
