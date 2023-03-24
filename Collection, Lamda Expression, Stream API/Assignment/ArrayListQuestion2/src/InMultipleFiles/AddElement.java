package InMultipleFiles;

import java.util.List;

public class AddElement {

    public static List addNewElement(Object element, List list) {
        list.add(element);
        System.out.println(list);
        return list;
    }
}
