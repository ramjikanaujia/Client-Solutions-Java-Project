/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author priyank
 */
@SuppressWarnings("empty-statement")
public class DbConnect {
    public static Connection c;
     public static Statement s;
    static {
        try{
          Class.forName("com.mysql.jdbc.Driver");
       c= DriverManager.getConnection("jdbc:mysql:// localhost:3307/clientsol","root", "Shwetank");
       s=c.createStatement();
    }catch(Exception ex){
        
        JOptionPane.showMessageDialog(null,ex);
    }
    
    
    }
    
}
