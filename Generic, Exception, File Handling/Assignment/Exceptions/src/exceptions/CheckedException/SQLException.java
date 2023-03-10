package exceptions.CheckedException;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {

    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "123");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (java.sql.SQLException ex) {
            System.out.println(ex);
        }
    }
}
