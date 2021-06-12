import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Probe1 {
    public static void main(String[] args) {
      //  selectAllFrom("customers");
        addNewCustomers(7,"Ermek Tanikulov","male","Sheralieva 560","0770854512");
       // deleteCustomersById(7);
       // updateCustomers("Rysbek Almazbekov",5);

    }

    /***
     * Подключается к базе данных и возвращает объект connection
     */
    private static Connection getConnection(){
        final String databaseURL = "jdbc:mysql://localhost:3306/shop";
        final String userName = "root";
        final String password = "mad5ina9217";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
            connection = DriverManager.getConnection(databaseURL,userName,password);
        } catch (ClassNotFoundException e){
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
    private static void updateCustomers(String name_surname, int id){
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("UPDATE customers SET name_surname = ? WHERE id = ?");
                preparedStatement.setString(1, name_surname);
                preparedStatement.setDouble(2, id);

                int rows = preparedStatement.executeUpdate();
                System.out.println(rows + " records were updated");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    /***
     * Delete
     * По id удаляет строку
     *
     */
    private static void deleteCustomersById(int id){
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE FROM customers WHERE id = ?;");
                preparedStatement.setInt(1, id);

                int val = preparedStatement.executeUpdate();
                System.out.println(val + " records were deleted");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
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
    private static void addNewCustomers(int id, String name_surname, String gender, String address, String phoneNumber) {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("insert into customers values(?, ?, ?, ?, ?)");
                preparedStatement.setInt(1, id );
                preparedStatement.setString(2, name_surname);
                preparedStatement.setString(3, gender);
                preparedStatement.setString(4, address);
                preparedStatement.setString(5, phoneNumber);


                int val = preparedStatement.executeUpdate();
                System.out.println(val + " records were added ");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
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
    private static  void selectAllFrom(String tableName) {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = getConnection();
        if(connection != null) {
            String query = "SELECT * FROM " + tableName;

            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery(query);
                        ResultSetMetaData metadata = resultSet.getMetaData();
                        int columnCount = metadata.getColumnCount();

                        for (int i = 1; i <= columnCount; i++)
                            System.out.print(metadata.getColumnName(i) + "\t");
                        System.out.println("\n");

                       while (resultSet.next()) {
                            for (int i = 1; i <= columnCount; i++)
                                System.out.print(resultSet.getString(i) + "\t");
                            System.out.println();
                        }
                        System.out.println();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (resultSet != null)  resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.getStackTrace();
                }
            }
        }

    }


}