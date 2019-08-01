package javaapplication3;



/**
 *
 * @author RUPASHREE
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/goobe","root","root");
            return conn;
                    }catch(Exception e){
                       
                       JOptionPane.showMessageDialog(null,e);
                  return null;
                    
        }
    }
    
}