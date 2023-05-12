package FileInputStreamExample;

import java.io.FileInputStream;

public class FileInputStreamClass {

    public static void main(String[] args) {
        try {
            FileInputStream fileReader = new FileInputStream("files\\FileOutpuStream.txt");

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
