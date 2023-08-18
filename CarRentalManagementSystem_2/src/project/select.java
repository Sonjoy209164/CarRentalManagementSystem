/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package project;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class select {
    public static ResultSet getData(String Query)
    {
        Connection con=null;
        ResultSet rs=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            rs=st.executeQuery(Query);
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
    
}
