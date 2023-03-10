package employeemanagmentsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagmentSystem {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("files\\employee.txt", true));

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.print("Enter Name = ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Age = ");
        emp.setAge(sc.nextInt());

        System.out.print("Enter Email = ");
        emp.setEmailId(sc.next());

        System.out.print("Enter Mobile = ");
        emp.setMobileNumber(sc.next());

        System.out.print("Enter Salary = ");
        emp.setSalary(sc.nextDouble());

        writer.write(" \n \n" + emp.toString());
        writer.close();
        System.out.println(emp);

    }

}
