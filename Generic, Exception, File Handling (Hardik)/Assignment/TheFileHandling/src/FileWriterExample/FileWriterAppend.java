package FileWriterExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppend {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("files\\FileWriter.txt", true);
            fileWriter.write("\n Append");

            System.out.println("Write Sucessfully");

            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
