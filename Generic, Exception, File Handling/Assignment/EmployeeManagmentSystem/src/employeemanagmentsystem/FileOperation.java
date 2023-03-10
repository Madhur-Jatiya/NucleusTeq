package employeemanagmentsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

    BufferedWriter writer;

    public void getFile() {
        try {
            writer = new BufferedWriter(new FileWriter("files\\employee.txt", true));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void writeEmployeeData(Employee employee) throws IOException {
        writer.write(employee.toString() + "\n \n");
        writer.close();
        System.out.println("Write Successfully");
    }
}
