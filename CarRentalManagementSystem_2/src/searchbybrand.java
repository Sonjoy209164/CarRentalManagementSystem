
import java.awt.Color;
import java.awt.Font;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.datatransfer;
import project.select;
import project.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class searchbybrand extends javax.swing.JFrame {

    /**
     * Creates new form searchbybrand
     */
    public searchbybrand() {
        initComponents();
          jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,10)) ;
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(0,0,0));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.setRowHeight(60);
          jTable2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,10)) ;
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(0,0,0));
        jTable2.getTableHeader().setForeground(new Color(0,0,0));
        jTable2.setRowHeight(60);
        //jTable1.setVisible(false);
        //jTable2.setVisible(false);
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
             
    }
    
    public void getMin()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
      int  index=0;
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            list.add(Integer.parseInt(jTable1.getValueAt(i, 4).toString()));
        }
        
        int min = Collections.min(list);
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
        int q=  Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        if(min==q)
        {
            index=i;
            break;
        }
        }
        jTextField3.setText(jTable1.getValueAt(index, 1).toString());
         jTextField4.setText(jTable1.getValueAt(index, 4).toString());
         jTextField5.setText(jTable1.getValueAt(index, 0).toString());
       datapass.carregno=jTextField3.getText();
       // jTextField3.setText(Integer.toString(min));
    }
       public void getMax2()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
      int  index=0;
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            list.add(Integer.parseInt(jTable1.getValueAt(i, 4).toString()));
        }
        
        int min = Collections.max(list);
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
        int q=  Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        if(min==q)
        {
            index=i;
            break;
        }
        }
        jTextField3.setText(jTable1.getValueAt(index, 1).toString());
         jTextField4.setText(jTable1.getValueAt(index, 4).toString());
         jTextField5.setText(jTable1.getValueAt(index, 0).toString());
       datapass.carregno=jTextField3.getText();
       // jTextField3.setText(Integer.toString(min));
    }
      public void getMax()
    {
       ArrayList<Integer> list = new ArrayList<Integer>();
      int  index=0;
        for(int i = 0; i < jTable2.getRowCount(); i++)
        {
            list.add(Integer.parseInt(jTable2.getValueAt(i, 6).toString()));
        }
        
        int min = Collections.max(list);
        for(int i = 0; i < jTable2.getRowCount(); i++)
        {
        int q=  Integer.parseInt(jTable2.getValueAt(i, 6).toString());
        if(min==q)
        {
            index=i;
            break;
        }
        }
        jTextField6.setText(jTable2.getValueAt(index, 1).toString());
         jTextField7.setText(jTable2.getValueAt(index, 4).toString());
         jTextField8.setText(jTable2.getValueAt(index, 0).toString());
         jTextField9.setText(jTable2.getValueAt(index, 6).toString());
         
       datapass.carregno=jTextField3.getText();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, -1, 44));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setDoubleBuffered(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 197, 373, 43));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 197, 42, 44));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 197, 48, 44));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "Car Reg. no.", "Car Type", "Seat Number ", "Price", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 313, 586, 273));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 197, -1, 44));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setDoubleBuffered(true);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 197, 373, 43));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1199, 197, 42, 44));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1253, 197, 48, 44));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "Car Reg. no.", "Car Type", "Seat Number ", "Price", "Status", "Discount(%)"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        kGradientPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 313, 680, 273));
        kGradientPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, 180, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Registration Number");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 210, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand Name");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 110, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Price");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, 60, 30));
        kGradientPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 180, 30));
        kGradientPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 180, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cheapest Available car");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 280, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 200, 42, 44));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Maximum Discount");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 230, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Brand Name");
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 110, 30));
        kGradientPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 180, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Price");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 660, 50, 30));
        kGradientPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 660, 180, 30));
        kGradientPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 710, 180, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Car Registration Number");
        kGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, 210, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Discount");
        kGradientPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 710, 100, 30));
        kGradientPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 710, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\car4.jpg")); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -160, 1680, 930));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       jTable1.setVisible(true);
        jScrollPane1.setVisible(true);
           //jScrollPane2.setVisible(false);
        String nameorEmail=jTextField1.getText();
       // String nameorEmail1=jTextField2.getText();
        ResultSet rs=select.getData("select *from rentit where carName like '%"+nameorEmail+"%' and status like 'Not Booked'");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        getMin();
        //getMax2();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new searchbybrand().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
             ResultSet rs=select.getData("Select *from rentit where status like 'Not Booked'");
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "All field required");
        }
        
        
    }//GEN-LAST:event_formComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    
        jTable2.setVisible(true);
        //jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(true);
        String nameorEmail=jTextField2.getText();
        // String nameorEmail1=jTextField2.getText();
        ResultSet rs=select.getData("select *from rentit where carName like '%"+nameorEmail+"%' and status like 'Not Booked'");
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(8)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
          //getMin();
          getMax();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(searchbybrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchbybrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchbybrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchbybrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchbybrand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
