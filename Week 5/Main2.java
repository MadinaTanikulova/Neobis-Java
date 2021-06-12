import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;

public class Main2 {
    public static void main(String[] args) {
        selectAllFrom();
        addNewCustomer();
        deleteCustomerById();
        updateCustomers();
    }

    /***
     * Подключается к базе данных и возвращает объект connection
     */
    private static Connection getConnection()   {
        final String databaseURL = "jdbc:mysql://localhost:3306/shop";
        final String userName = "root";
        final String password = "mad5ina9217";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //Регистрация драйвера
            connection = DriverManager.getConnection(databaseURL, userName, password);
       } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /***
     * Update
     * По id меняет имя покупателя
     *
     */
   private static void updateCustomers() {
        Connection connection = getConnection();
       Statement statement = null;
        if (connection != null) {
            try {
                 statement = connection.createStatement() ;
                int rowsUpdate = statement.executeUpdate("UPDATE customers SET name_surname = 'Arsen Amatov' WHERE id = 1");
                System.out.printf("Updated %d rows\n", rowsUpdate);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                     e.getStackTrace();
                }
            }
        }
    }

    /***
     * Удаляет запись из таблицы "customers" по id
     */
    public static void deleteCustomerById(){
        Connection connection = getConnection();
        Statement statement = null;
        if(connection != null) {

            try {
                statement = connection.createStatement() ;
                int rowsDelete = statement.executeUpdate("DELETE FROM customers WHERE Id = 7");
                System.out.printf("%d row(s) deleted\n", rowsDelete);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }

    }


    /***
     * Данный метод додавляет 2 новые записи в таблицу "customers"
     *
     */
   public static void addNewCustomer() {
        Connection connection = getConnection();
       Statement statement = null;
        if (connection != null) {

            try {
                statement = connection.createStatement() ;
                int rowsInsert = statement.executeUpdate("INSERT customers(id, name_surname, gender, address, phoneNumber) VALUES (6,'Aynagul Osmonova','female','Ahunbaeva 44434','0557854789'),(7,'Bektur Usenov','male','Lenina 56','0770214563');");
                System.out.printf("Added %d rows\n", rowsInsert);

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }

    }

    /***
     * Выводит все данные из базы данных на консоль
     */
    private static void selectAllFrom() {
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = getConnection();
        if (connection != null) {
            try {
                statement = connection.createStatement();
                String sql = "SELECT * FROM customers";
                rs = statement.executeQuery(sql);

                while(rs.next()){

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
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null)  rs.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }

    }

}
