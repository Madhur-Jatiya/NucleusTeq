package FileReaderExample;

import java.io.FileReader;

public class FileReaderClass {

    public static void main(String[] args) {
        try {
//            File f = new File("files\\fileWriter.txt");
//            FileReader fileReader = new FileReader(f);
//            OR
            FileReader fileReader = new FileReader("files\\fileWriter.txt");

            int data = fileReader.read();
            
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            
            System.out.println("");
            fileReader.close();
        } catch (Exception e) {
        }
    }
}
