package BufferReaderExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderClass {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("files\\BufferedWriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            

        } catch (Exception e) {
        }
    }
}
