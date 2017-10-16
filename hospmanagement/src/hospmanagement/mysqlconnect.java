/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospmanagement;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author pankaj
 */
public class mysqlconnect {
    Connection conn=null;
    static Connection ConnectDB() {
         //To change body of generated methods, choose Tools | Templates.
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Pdhurve!97");
            JOptionPane.showMessageDialog(null,"Connected to Database");
        
            return conn;
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
           
            return null;
        }
    }
    
}


