/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;

//import com.sun.jdi.connect.spi.Connection;


/**
 *
 * @author Asus
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
     
        
         
           
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","naruto709@@");
        }
        
        catch(Exception e)
        {
             return null;
        }
       
        
    }
    
}
