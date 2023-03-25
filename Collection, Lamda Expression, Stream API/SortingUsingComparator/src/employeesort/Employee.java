package employeesort;

public class Employee{
    public String employeeName;
    public String employeeSurName;
    public Double employeeSalary;

    public Employee(String employeeName, String employeeSurName, Double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSurName = employeeSurName;
        this.employeeSalary = employeeSalary;
    }
    
    @Override
    public String toString()
    {
       return "Full Name : " + employeeName + " " + employeeSurName + " --> Salary : " + employeeSalary; 
    }
}
