package employeemanagmentsystem;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagmentSystem {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        while (true) {
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

            FileOperation fileOperation = new FileOperation();
            fileOperation.getFile();
            fileOperation.writeEmployeeData(emp);
            System.out.println(emp);

//            System.out.println("\nPress 1 for Exit other key for continue\n");
//            int x = sc.nextInt();
//            if (x == 1) {
//                System.exit(0);
//            } else {
//                continue;
//            }
        }

    }

}
