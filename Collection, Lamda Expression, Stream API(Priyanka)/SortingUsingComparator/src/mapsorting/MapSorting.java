
package mapsorting;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class MapSorting {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1550);
        map.put("b", 1560);
        map.put("c", 1065);
        map.put("d", 1043);
        map.put("e", 15430);
        map.put("f", 1310);

        System.out.println("Before Sort");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());

        }

        System.out.println("\nAfter Sort");

        Comparator comparator = new SortByValue(map);

        TreeMap<String, Integer> map1 = new TreeMap<>(comparator);

        map1.putAll(map);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());

        }
    }

}
