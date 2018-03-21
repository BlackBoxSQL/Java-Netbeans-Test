/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Nazibur
 */
public class MySqlConnect1 {
    Connection conn = null;
    public static Connection ConnectDB(){
    
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/auth1","root","");
            JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
            return null;
        
        }
    }
}
