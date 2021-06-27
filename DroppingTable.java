import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DroppingTable {

    public static void main(String[] args) throws SQLException {

      Statement statement =
              MyConnection.connectToDB("mysql","demo","root","1234");

      statement.executeUpdate("DROP TABLE `employee`");
        System.out.println("Successfully dropped table");



    }
}
