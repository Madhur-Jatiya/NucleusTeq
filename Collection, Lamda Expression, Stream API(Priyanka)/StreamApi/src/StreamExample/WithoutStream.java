package StreamExample;

import java.util.*;

public class WithoutStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 24, 543, 654, 2, 7);
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }
        System.out.println(list);
        Collections.sort(evenList);
        System.out.println(evenList);
    }
}
