package employeesort;

import java.util.Comparator;

public class SortBySurname implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.employeeSurName.compareTo(o2.employeeSurName);
    }

}
