import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

    public static void main(String[] args) throws SQLException {

        Statement statement =
                 MyConnection.connectToDB("mysql","demo","root","1234");

        int res = statement.executeUpdate("INSERT INTO `employee`(`id`,`name`,`salary`) VALUES('1','Simo',1000000) ");
        System.out.println("Number of insertions: " + res);









    }

}
