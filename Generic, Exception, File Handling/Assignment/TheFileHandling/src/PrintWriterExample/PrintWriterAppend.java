package PrintWriterExample;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterAppend {

    public static void main(String[] args) {
        try {
            File f = new File("files\\PrintWriter.txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(f, true));
            
            printWriter.println("Append text");
            
            System.out.println("Append Successfully");
            printWriter.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
