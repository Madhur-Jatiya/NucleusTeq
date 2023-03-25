package mapquestion;

import java.util.*;

public class MapQuestion2 {

    public static void main(String[] args) {
        List<Character> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String sentence = sc.nextLine();

        for (char ch : sentence.toCharArray()) {
            list.add(ch);
        }

        Character c = ' ';
        list.remove(c);

        Map<Object, Integer> map = new LinkedHashMap();
        for (Object object : list) {
            if (map.containsKey(object)) {
                int count = map.get(object) + 1;
                map.put(object, count);
            } else {
                map.put(object, 1);
            }
        }

        System.out.println(map);

    }
}
