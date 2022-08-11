package jdbc.Db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{

    public String driverUrl="com.mysql.cj.jdbc.Driver";
    public String jdbcUrl="jdbc:mysql://localhost:3306/university";
    public String userName="root";
    public String password="";

    public Connection getDBConnection(){
        Connection connection=null;
         try{
            Class.forName(driverUrl);

            connection = DriverManager.getConnection(jdbcUrl,userName,password);

         }catch(SQLException ex){
            System.out.println("Connected successfully");
            ex.printStackTrace();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class for Name not found");
        }
        return connection;      
    }
}

class Main{
    public static void main(String[] args) {
        DBConnection conn=new DBConnection();
        conn.getDBConnection();
    }
}