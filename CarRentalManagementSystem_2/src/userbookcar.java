
import java.awt.Color;
import java.awt.Font;
import static java.awt.SystemColor.menu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import project.InsertUpdateDelete;
import project.select;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class userbookcar extends javax.swing.JFrame {

    /**
     * Creates new form userbookcar
     */
    public userbookcar() {
        initComponents();
             GradientDropdownMenu menu = new GradientDropdownMenu();
        //menu.getAlignmentX();
        menu.setBackground(Color.black);
        menu.setSize(300,200);
        menu.addItem("USER");
        menu.addItem("Show Cars", "Show availabe cars", "Search by price", "Search by Brand","Show Car Image");
        menu.addItem("Book Now", "Book a Car");
        menu.addItem("Check Out", "Check Out");
        menu.addItem("About", "About us");
        menu.addItem("                                                                                                                                                                                                              ");
        menu.addItem("Logout","Logout","Exit");
        menu.applay(this);
       
     
       menu.addEvent(new MenuEvent() {
    @Override
    public void selected(int index, int subIndex, boolean menuItem) {
        if (menuItem) {
            if(menu.getMenuNameAt(index, subIndex).equals("Exit") )
               {
                    System.exit(0);
               }
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Show availabe cars") )
               {
                   setVisible(false);
                   new showavailablecars().setVisible(true);
               }
               else if(menu.getMenuNameAt(index, subIndex).equals("Search by price") )
               {
                   setVisible(false);
                   new searchcarbyprice().setVisible(true);
               }
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Search by Brand") )
               {
                   setVisible(false);
                   new searchbybrand().setVisible(true);
               }
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Book a Car") )
               {
                   setVisible(false);
                   new userbookcar().setVisible(true);
               }
            
               else if(menu.getMenuNameAt(index, subIndex).equals("Show Confirmation") )
               {
                   setVisible(false);
                   new showconfirmation().setVisible(true);
               }
               else if(menu.getMenuNameAt(index, subIndex).equals("Show all Requests") )
               {
                   setVisible(false);
                   new showallrequest().setVisible(true);
               }
               else if(menu.getMenuNameAt(index, subIndex).equals("Any Question") )
               {
                   setVisible(false);
                   new anyquestion().setVisible(true);
               }
            
             else if(menu.getMenuNameAt(index, subIndex).equals("Check Out") )
               {
                   setVisible(false);
                   new usercheckout().setVisible(true);
               }
                 else if(menu.getMenuNameAt(index, subIndex).equals("Show Car Image") )
               {
                   setVisible(false);
                   new usercarinfoshow().setVisible(true);
               }
             
//         
             
//             else if(menu.getMenuNameAt(index, subIndex).equals("Show bill") )
//               {
//                   setVisible(false);
//                   new Customer.setVisible(true);
//               }
            
            
            
           else if(menu.getMenuNameAt(index, subIndex).equals("Logout") )
               {
                   int a =0;
        if(a==0)
        {

            setVisible(false);
            new Login().setVisible(true);
        } 
               }
           
                
        }
    }
});
        jTextField7.setEditable(false);
        jTextField10.setEditable(false);
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy/MM/dd");
        
      Calendar cal=Calendar.getInstance();
      jTextField7.setText(myformat.format(cal.getTime()));
        
    }
    
    String numberofseats,cartype,carregno,price;
    
    public void cardetails()
    {
        jComboBox4.removeAllItems();
        jTextField10.setText("");
        numberofseats=(String)jComboBox2.getSelectedItem();
        cartype=(String)jComboBox3.getSelectedItem();
        try
        {
            ResultSet rs=select.getData("select *from rentit where  numberofseats='"+numberofseats+"' and carType='"+cartype+"' and status='Not booked'");
            
            while(rs.next())
            {
                jComboBox4.addItem(rs.getString(2));
            }
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 179, 150, 27));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 210, 350, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Mobile No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 269, 86, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 308, 350, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nationality");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 359, -1, 25));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 399, 350, 33));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 459, 76, 25));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 489, 350, 31));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 539, 100, 31));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 579, 350, 33));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 409, 350, 31));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Check In Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 369, 175, 35));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 319, 350, 34));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 269, 121, 35));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.setToolTipText("pass");
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 209, 350, 38));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("ID proof");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 169, 89, 28));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Number of seats");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 179, 179, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 seats", "6 seats", "12 seats" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 209, 348, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Car Type");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 279, 195, -1));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 319, 348, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Car Reg No.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 379, 191, -1));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 409, 348, 36));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 469, 144, 24));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 509, 348, 31));

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add To Cart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 577, 146, 40));

        jButton4.setBackground(new java.awt.Color(102, 0, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 577, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rentit.jpg"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1370, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        cardetails();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        cardetails();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        carregno =(String) jComboBox4.getSelectedItem();

        try
        {
            ResultSet rs=select.getData("select *from rentit where carRegNumber = '"+carregno+"'");

            while (rs.next())
            {
                jTextField10.setText(rs.getString(5));
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int id=1;
        String name =jTextField1.getText();
        String mobilenumber=jTextField2.getText();
        String nationality = jTextField3.getText();
        String gender=(String) jComboBox1.getSelectedItem();
        String email=jTextField4.getText();
        String idproof=jTextField5.getText();
        String address=jTextField6.getText();
        String checkIN=jTextField7.getText();
        String numberofseats= (String) jComboBox2.getSelectedItem();
        String cartype= (String) jComboBox3.getSelectedItem();
        String carregnumber= (String) jComboBox4.getSelectedItem();
        String price = jTextField10.getText();
        // String date=rSDateChooser1.getFormatoFecha();
        //System.out.println(date);
        String Query="select max(id) from customer";

        try
        {
            ResultSet rs =select.getData(Query);
            while(rs.next())
            {
                id = rs.getInt(1);}
            id=id+1;
            if(!price.equals(""))
            {
                Query="update rentit set status ='Requested' where carRegNumber ='"+carregnumber+"'";
                InsertUpdateDelete.setData(Query, "");
                Query="insert into customer (id,name,mobileNumber,nationality,gender,email,idproof,address,checkin,carRegNo,numberofseats,carType,priceperday) values("+id+",'"+name+"','"+mobilenumber+"','"+nationality+"','"+gender+"','"+email+"','"+idproof+"','"+address+"','"+checkIN+"','"+carregnumber+"','"+numberofseats+"','"+cartype+"','"+price+"')";
                InsertUpdateDelete.setData(Query, "Customer Check IN successfull");
                setVisible(false);
                new userbookcar().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new userbookcar().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userbookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userbookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userbookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userbookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userbookcar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
