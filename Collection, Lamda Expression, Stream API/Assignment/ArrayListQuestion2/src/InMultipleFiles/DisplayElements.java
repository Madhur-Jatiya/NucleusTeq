package InMultipleFiles;

import java.util.List;

public class DisplayElements {

    public static void viewElement(List list) {
        if (list.isEmpty()) {
            System.err.println("\n\t\tList is Empty");
        } else {
            System.out.println();
            for (Object object : list) {
                System.out.println("\t" + object);
            }
        }
    }
}
