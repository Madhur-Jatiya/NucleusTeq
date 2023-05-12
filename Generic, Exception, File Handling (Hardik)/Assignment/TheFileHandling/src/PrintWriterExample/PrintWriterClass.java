package PrintWriterExample;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterClass {

    public static void main(String[] args) {
        try {
            File f = new File("files\\PrintWriter.txt");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.println("Integer = " + 100);
            printWriter.println("Float = " + 93.23);
            printWriter.println("Character = " + 'M');
            printWriter.println("String = " + "Madhur");
            printWriter.println("Boolean = " + true);
            
            
            System.out.println("Write Successfully");
            printWriter.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
