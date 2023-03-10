package FileExample;

import java.io.File;

public class DirectryClass {

    public static void main(String[] args) {
        try {
            File f = new File("files\\Madhur");
            if (f.exists()) {
                System.out.println("Directry Exist of Name = " + f.getName() + " of size = " + f.length() + " Bytes");
            } else {
                f.mkdir();
                System.out.println("Created new Directry of name = " + f.getName() + " of size = " + f.length() + " Bytes");
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
