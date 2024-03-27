package evaluationForStreams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class DBStorage {
    private String url = null;
    private String user = null;
    private String password = null;
    private Connection connection;
    private Statement statement;
    private PreparedStatement prepStatement;
    private ResultSet resultSet;

    public DBStorage(){
        this.url = "jdbc:mysql://localhost:3306/December";
        this.user =  "Amogha";
        this.password = "Amoghamaha";
    }

    public DBStorage(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }
    public void createTable(){
        try{
            connection = DriverManager.getConnection(url, user, password);
            String createTable =  "create table JustNames(Names varchar(50))";
            statement = connection.createStatement();
            statement.executeUpdate(createTable);
        }catch(SQLException e){
            e.getMessage();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertIntoTable(String data){
        try {
            connection = DriverManager.getConnection(url, user, password);
            String query = "insert into JustNames values(?)";
            prepStatement = connection.prepareStatement(query);
            prepStatement.setString(1, data);
            prepStatement.executeUpdate();
            System.out.println("Inserted data successfully.");
        } catch(Exception e){
            e.getMessage();
        } finally {
            try {
                if (prepStatement != null) {
                    prepStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void readData() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from JustNames");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
    
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                System.out.print(columnName + "  ");
            }
            System.out.println("\n");
    
            while (resultSet.next()) {
                String columnValue = resultSet.getString(1);
                System.out.print(columnValue + "  ");
                System.out.println();
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void deleteFromTable(String name){
        try {
            connection = DriverManager.getConnection(url, user, password);
            String query = "delete from JustNames where Names = ?";
            prepStatement = connection.prepareStatement(query);
            prepStatement.setString(1, name);
            prepStatement.executeUpdate();
            System.out.println("deleted successfully.");
        } catch(Exception e){
            e.getMessage();
        } finally {
            try {
                if (prepStatement != null) {
                    prepStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
