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
        String query = "select * from students";

        //Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connection established!");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        /*resultSet.next();
        String name = resultSet.getString("firstname");
        System.out.println(name);*/

        while(resultSet.next()){
            System.out.print(resultSet.getInt(1) + " -- ");
            System.out.print(resultSet.getString(2) + " -- ");
            System.out.print(resultSet.getString(3) + " -- ");
            System.out.print(resultSet.getString(4));
            System.out.println();
        }

        connection.close();

        System.out.println("Connection close!");


    }
}
