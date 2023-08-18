/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Asus
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        
        try
        {
            System.out.println("done");
            con = ConnectionProvider.getcon();
            st=con.createStatement();
            System.out.print(con);
           // st.executeUpdate("create table users2 (name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(200),answer varchar(200),address varchar(200),status varchar(20))");
            //st.executeUpdate("Create table rentit(carName varchar(200),carRegNumber varchar(12),carType varchar(200),numberofseats varchar(200),price int,status varchar(20))");
          // st.executeUpdate("create table customer (id int , name varchar(200) ,mobileNumber varchar(30) , nationality varchar(100) ,gender varchar(50),email varchar(200),idproof varchar(200),address varchar(500),checkin varchar(50),numberofseats varchar(20),carType varchar(100),carRegNo varchar(200) ,priceperday int(10),numberOfDaysrent int (10),totalammount varchar(200),checkout varchar(100) )");
           JOptionPane.showMessageDialog(null, "Table created succfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
             
        }
       
        finally
        {
             try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {
        }
        }
        
        
    }
    
}
