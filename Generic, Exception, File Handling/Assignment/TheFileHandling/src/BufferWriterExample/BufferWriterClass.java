package BufferWriterExample;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterClass {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("files\\BufferedWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hyy everyone");
            bufferedWriter.newLine();
            bufferedWriter.write("How are you?");
            System.out.println("Write Successfully");
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
