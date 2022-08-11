package jdbc.lecturer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jdbc.Db.DBConnection;


public class Lecturer {
    
    DBConnection connection = new DBConnection();
    Connection conn=connection.getDBConnection();
    public void insertlecturer(){
        try {
         String insertLecturer="INSERT INTO lecturer(First_Name,Last_Name,Reg_ID,Course_Unit) values(?,?,?,?) ";
         PreparedStatement stmt=conn.prepareStatement(insertLecturer);
         stmt.setString(1,"Agaba");
         stmt.setString(2,"Joab");
         stmt.setString(3,"U/099");
         stmt.setString(4,"AOOP");
         stmt.executeUpdate();
         conn.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        } 
    }

    
    public static void main(String[] args) {
        Lecturer lecture =new Lecturer();
        lecture.insertlecturer();
    }
}
