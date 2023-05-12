package mapquestion;

import java.util.*;

public class MapQuestion1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(20);
        list.add(20);

        Map<Integer, Integer> map = new LinkedHashMap();

        for (int i : list) {
            if (map.containsKey(i)) {
                int count = map.get(i) + 1;
                map.put(i, count);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(map);

    }
}
