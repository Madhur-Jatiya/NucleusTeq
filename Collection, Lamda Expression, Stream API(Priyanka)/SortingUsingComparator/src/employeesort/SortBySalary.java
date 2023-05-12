package employeesort;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.employeeSalary > o2.employeeSalary)
        {
            return 1;
        }
        
        return -1;
    }
    
}
