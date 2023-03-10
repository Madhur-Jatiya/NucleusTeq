package FileWriterExample;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) throws IOException {
        try {
//            File f = new File("files\\fileWriter.txt");
//            FileWriter fileWriter1 = new FileWriter(f);
//            OR
            FileWriter fileWriter = new FileWriter("files\\FileWriter.txt");

            fileWriter.write('I');

            System.out.println("Write Character");
            
            fileWriter.write(" am Madhur Jatiya.");

            System.out.println("Write String");

            fileWriter.close();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
