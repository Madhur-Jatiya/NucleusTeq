package FileOutpuStreamExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOutpuStreamClass {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("files\\FileOutpuStream.txt");
            String s = "Hello India";
            byte bytes[] = s.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            System.out.println("Write Successfully");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
