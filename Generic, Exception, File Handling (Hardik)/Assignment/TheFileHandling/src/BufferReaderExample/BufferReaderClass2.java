package BufferReaderExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass2 {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("files\\BufferedWriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int data = bufferedReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = bufferedReader.read();
            }
            System.out.println("");
        } catch (IOException e) {
        }
    }
}
