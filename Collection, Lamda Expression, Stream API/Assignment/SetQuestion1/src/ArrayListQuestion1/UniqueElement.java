package ArrayListQuestion1;

import java.util.*;

public class UniqueElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 3, 3, 3};

        //Before Operation
        System.out.println("Array Elements");
        System.out.println(Arrays.toString(arr));

        Set<Integer> set = new HashSet();
        for (int i : arr) {
            set.add(i);
        }

        //After Operation
        System.out.println("After Delete Unique Elements");
        System.out.println(set);
    }
}
