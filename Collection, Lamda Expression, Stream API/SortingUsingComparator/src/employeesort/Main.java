package employeesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    Employee employee;
    
    public static void main(String[] args) {
        
        ArrayList<Employee> list = new ArrayList<>();        
        list.add(new Employee("Madhur","Jatiya",244300.0));
        list.add(new Employee("Vipin","Gupta",10340.0));
        list.add(new Employee("Lokesh","Nargesh",454100.0));
        list.add(new Employee("Anushka","Gadak",255100.0));
        list.add(new Employee("Ashvini","Bhandari",233100.0));
        list.add(new Employee("Rani","Ahire",10860.0));
        list.add(new Employee("Sanskriti","Maheshwari",954100.0));
        
        System.out.println("\nBefore Sorting\n");
        
        for (Employee employee : list) {
            System.out.println(employee);
        }
        
                    //Sort By Salary
                    
        System.out.println("\nAfter Sort by Salary\n");
        
        Comparator comparator = new SortBySalary();
        Collections.sort(list, comparator);

        
        for (Employee employee : list) {
            System.out.println(employee);
        }
        
                //Sort By Name
        
        System.out.println("\nAfter Sort by Name\n");
        
        Comparator comparator1 = new SortByName();
        Collections.sort(list, comparator1);

        for (Employee employee : list) {
            System.out.println(employee);
        }
        
                //Sort By SurName
        
        System.out.println("\nAfter Sort by SurName\n");
        
        Comparator comparator2 = new SortBySurname();
        Collections.sort(list, comparator2);
        
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    
}
