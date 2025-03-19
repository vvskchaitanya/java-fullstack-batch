package jdbc.fullstack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsService {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/fullstack";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Idivya1@3";

    public ProductsService(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Unable to load the MySQL Connector Driver, Make sure you have java-mysql-connector library added to classpath");
            e.printStackTrace();
        }
    }
    public void create(Products prod){
        String query = "INSERT INTO products (product_name,price,stock_quantity) VALUES(?,?,?)";
        try(Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1,prod.getName());
            preparedStatement.setDouble(2, prod.getPrice());
            preparedStatement.setInt(3, prod.getQuantity());

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: "+rowsAffected);
        }catch(SQLException e){
            System.out.println("Catch block");
            System.out.println(e.getMessage());
        }
    }

    public void fetch(){
        String sql = "SELECT product_id, product_name, price, stock_quantity FROM products";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("stock_quantity");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id){
        String sql = "DELETE FROM products where product_id=?";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setInt(1, id);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows Deleted: " + rowsAffected);
            
            }catch(SQLException e){
                e.printStackTrace();
            }

    }

    public void update(int id, Products prod){
        String query = "UPDATE products SET product_name =?, price=?, stock_Quantity = ? WHERE product_id = ?";
        try(Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement preparedStatement = con.prepareStatement(query)){

                preparedStatement.setString(1,prod.getName());
                preparedStatement.setDouble(2, prod.getPrice());
                preparedStatement.setInt(3, prod.getQuantity());
                preparedStatement.setInt(4, id);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows Updated: "+ rowsAffected);
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

    public void update(String name, double price){
        String query = "UPDATE products SET price=? WHERE product_name = ?";
        try(Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement preparedStatement = con.prepareStatement(query)){

                preparedStatement.setDouble(1,price);
                preparedStatement.setString(2, name);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows Updated: "+ rowsAffected);
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

    public void update(String name, int quantity){
        String query = "UPDATE products SET stock_quantity=? WHERE product_name = ?";
        try(Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            PreparedStatement preparedStatement = con.prepareStatement(query)){

                preparedStatement.setInt(1,quantity);
                preparedStatement.setString(2, name);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows Updated: "+ rowsAffected);
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

}