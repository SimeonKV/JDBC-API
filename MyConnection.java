import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

    public static Statement connectToDB(String db, String databaseName, String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:" + db + "://localhost/" +databaseName,username,password);
        return connection.createStatement();
    }

}
