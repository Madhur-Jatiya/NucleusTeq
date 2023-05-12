package StreamExample;

import java.util.*;
import java.util.stream.Collectors;

public class WithStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 24, 543, 654, 2, 7);
        System.out.println(list);
        
        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        
        List<Integer> demo = list.stream().filter(x -> x>500).collect(Collectors.toList());
        System.out.println(demo);
    }
}
