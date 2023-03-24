package InMultipleFiles;

import java.util.*;

public class ArrayListQuestion2 {

    public static void main(String[] args) {
        List list = new ArrayList();
        while (true) {
            int choice = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("\nPress 1 for Add");
            System.out.println("Press 2 for Remove");
            System.out.println("Press 3 for View");
            System.out.println("Press 4 for Exit");
            System.out.print("\nEnter = ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("\nEnter new Element = ");
                        Object newElement = sc.next();
                        list = AddElement.addNewElement(newElement, list);
                        break;
                    case 2:
                        System.out.print("\nEnter element want to Delete = ");
                        Object delElement = sc.next();
                        list = DeleteElement.removeElement(delElement, list);
                        break;
                    case 3:
                        DisplayElements.viewElement(list);
                        break;
                    case 4:
                        System.err.println("\n\t\tExit");
                        return;
                    default:
                        System.err.println("\n\t\tPlease Enter Correct Input");
                }
            } catch (Exception e) {
                System.err.println("\n\t\tPlease enter Integer btwn 1 to 4");
            }
        }
    }
}
