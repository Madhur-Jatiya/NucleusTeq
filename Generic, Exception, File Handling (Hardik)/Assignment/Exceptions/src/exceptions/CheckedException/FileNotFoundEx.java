package exceptions.CheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEx {

    public static void main(String[] args) {
        try {
            File f = new File("tech.txt");
            f.createNewFile();
//            f.delete();
            FileReader fileReader = new FileReader(f);
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
