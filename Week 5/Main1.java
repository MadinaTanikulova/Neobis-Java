import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Main1 {
    public static void main(String[] args) {
        final String databaseURL = "jdbc:mysql://localhost:3306/Shop";
        final String userName = "root";
        final String password = "mad5ina9217";

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
            connection = DriverManager.getConnection(databaseURL, userName, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement = connection.createStatement();
            String sql = "SELECT * FROM customers";
            rs = statement.executeQuery(sql);

            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String name_surname = rs.getString("name_surname");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String phoneNumber = rs.getString("phoneNumber");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name_surname: " + name_surname);
                System.out.print(", Gender: " + gender);
                System.out.print(", Address: " + address);
                System.out.println(", PhoneNumber" + phoneNumber);
            }

            statement = connection.createStatement();
            int rowsInsert = statement.executeUpdate("INSERT customers(id, name_surname, gender, address, phoneNumber) VALUES (6,'Bektur Osmonov','male','Ahunbaeva 34','0557654123');");
            System.out.printf("Added %d rows", rowsInsert);
           int rowsDelete = statement.executeUpdate("DELETE FROM customers WHERE Id = 7");
            System.out.printf("%d row(s) deleted\n", rowsDelete);
            int rowsUpdate = statement.executeUpdate("UPDATE customers SET name_surname = 'Arsen Update' WHERE id = 1");
            System.out.printf("Updated %d rows", rowsUpdate);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}







