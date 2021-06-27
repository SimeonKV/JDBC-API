import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDbAndTable {

    public static void main(String[] args) throws SQLException {
        Connection con = null;

        try {
            // Connecting to mysql using JDBC
             con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234");

            //Calling a statement class whose role is to create mysql queries
            Statement statement = con.createStatement();

            //Creating a db
            statement.executeUpdate("CREATE DATABASE  IF NOT EXISTS `demo`;");
            //Calling the db in use
            statement.executeUpdate("USE `demo`");
            //Creating a table in the given db
            statement.executeUpdate("CREATE table `employee`(`id` INT PRIMARY KEY AUTO_INCREMENT," +
                    "`name` VARCHAR(30) NOT NULL," +
                    "`salary` DECIMAL(10,2) NOT NULL)");





        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //Closing the connection
            con.close();
        }


    }


}
