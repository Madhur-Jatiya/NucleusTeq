package MapDemo;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("one", 11);
        myMap.put("two", 2);
        myMap.put("three", 3);
        
        System.out.println(myMap.get("one"));
        System.out.println(myMap.containsKey(1));

        System.out.println(myMap);
    }
}
