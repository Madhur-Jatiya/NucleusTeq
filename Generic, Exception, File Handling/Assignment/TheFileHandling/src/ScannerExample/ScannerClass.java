package ScannerExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        try {
            File file = new File("files\\PrintWriter.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
