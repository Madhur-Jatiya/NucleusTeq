package InMultipleFiles;

import java.util.List;

public class DeleteElement {

    public static List removeElement(Object element, List list) {
        if (list.isEmpty()) {
            System.err.println("\n\t\tList is Empty");
        } else {
            if (!list.contains(element)) {
                System.err.println("\n\t\tList Not Contain This Element");
            } else {
                list.remove(element);
            }
        }
        return list;
    }
}
