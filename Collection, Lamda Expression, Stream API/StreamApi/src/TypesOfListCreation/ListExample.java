package TypesOfListCreation;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

//        Ways to create list
//        1st way (immutable list)
        String[] array = {"foo", "bar", "baz"};
        List<String> list = Arrays.asList(array);
//        list.add("hyy"); //gives runtine error
        System.out.println(list);

//        2nd way (immutable list)
        List<String> list2 = List.of("foo", "bar", "baz");
//        list2.add("mjs"); //gives runtine error
        System.out.println(list2);

//        3rd way (mutable list)
        List<String> list3 = new ArrayList<>();
        list3.add("Madhur");    //no error
        System.out.println(list3);
    }

}
