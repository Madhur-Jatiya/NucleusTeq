package FileExample;

import java.io.File;

public class FileClass {

    public static void main(String[] args) {
        try {
            File f = new File("files\\File.txt");
            if (f.exists()) {
                System.out.println("File Exist of Name = " + f.getName() + " of size = " + f.length() + " Bytes");
            } else {
                f.createNewFile();
                System.out.println("Created new file of name = " + f.getName() + " of size = " + f.length() + " Bytes");
            }

            System.out.println("Can Read = " + f.canRead());
            System.out.println("Can Write = " + f.canWrite());
            System.out.println("Path = " + f.getPath());
            System.out.println("Parent folder = " + f.getParent());
            System.out.println("Delete Successfully = " + f.delete());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
