import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process results
        * close
        * */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "ecuacion";

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connection established!");
    }
}
