
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class companyinfo extends javax.swing.JFrame {

    /**
     * Creates new form companyinfo
     */
    public companyinfo() {
        initComponents();
        update_info();
//                jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15)) ;
//        jTable1.getTableHeader().setOpaque(false);
//        jTable1.getTableHeader().setBackground(new Color(120,136,203));
//        jTable1.getTableHeader().setForeground(new Color(0,0,0));
//        jTable1.setRowHeight(25);
             GradientDropdownMenu menu = new GradientDropdownMenu();
        
        menu.addItem("ADMIN");
        menu.addItem("Employee", "Add Employee", "Edit Employee Info", "Terminate Employee");
        menu.addItem("Approval ", "Approve Employee");
        
        menu.addItem("                                                                                                                                                                                                                     ");
        menu.addItem("Jump To", "Back", "Customer Details", "Car Details","Company Details");
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
            
           else if(menu.getMenuNameAt(index, subIndex).equals("Logout") )
               {
                   int a =0;
        if(a==0)
        {

            setVisible(false);
            new Login().setVisible(true);
        } 
               }
            
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Add Employee") )
               {
                        setVisible(false);
        new addemployee().setVisible(true); 
               }
           
            else if(menu.getMenuNameAt(index, subIndex).equals("Edit Employee Info") )
               {
                     setVisible(false);
        new Updateemployee().setVisible(true);  
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Terminate Employee") )
               {
                         setVisible(false);
        new deleteemployee().setVisible(true);
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Approve Employee") )
               {
                    setVisible(false);
                   new ApproveEmployee().setVisible(true);
                   
               }
            
            else if(menu.getMenuNameAt(index, subIndex).equals("Customer Details") )
               {  setVisible(false);
                  new customerdetails().setVisible(true);
               }
            
           else if(menu.getMenuNameAt(index, subIndex).equals("Car Details") )
               {  setVisible(false);
                  new cardetails().setVisible(true);
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Back") )
               {
                     setVisible(false);
        new adminhome().setVisible(true);
               }
            else if(menu.getMenuNameAt(index, subIndex).equals("Company Details") )
               {
                     setVisible(false);
        new companyinfo().setVisible(true);
               }
             
            
            
            
            }
    }
});
    }
      public void update_info() 
    {
        //label_welcome.setText("Welcome "+username);
        //int total_books =0,total_user=0,total_sold=0;
        //total books
        try {
            Connection con = ConnectionProvider.getcon();
            String sql = "Select count(name) from users";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String sum = rs.getString("count(name)");
                txt_noOfBooks.setText(sum);
            }
        } catch (Exception e) {
        }
        
      //  total users
        try {
            Connection con = ConnectionProvider.getcon();
            String sql = "Select count(carName) from rentit";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String sum = rs.getString("count(carName)");
                txt_noOfPersons.setText(sum);
            }
        } catch (Exception e) {
        }
        int p=datapass.totalbalance;
        //JOptionPane.showMessageDialog(null, datapass.totalbalance);
        String s=Integer.toString(p);
        totalincome.setText(s);
        
//        
//        // sold books
//        try {
//            Connection con = DB.getConnection();
//            String sql = "Select count(BookId) from buylist";
//            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//            if(rs.next()){
//                String sum = rs.getString("count(BookId)");
//                txt_noOfSoldBooks.setText(sum);
//            }
//        } catch (Exception e) {
//        }
       
        
        
    }
      


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_noOfPersons = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        totalincome = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_noOfBooks = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("No of Persons");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N

        txt_noOfPersons.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txt_noOfPersons.setText("55");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(txt_noOfPersons)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_noOfPersons)
                    .addComponent(jLabel20))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 220, 140));

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N

        totalincome.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        totalincome.setText("55");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalincome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalincome)
                    .addComponent(jLabel23))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 270, 140));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel25.setText("No of Sold Books");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, -1));

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N

        txt_noOfBooks.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txt_noOfBooks.setText("55");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txt_noOfBooks)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_noOfBooks)
                    .addComponent(jLabel7))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 220, 140));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(companyinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(companyinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(companyinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(companyinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new companyinfo().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JLabel totalincome;
    private javax.swing.JLabel txt_noOfBooks;
    private javax.swing.JLabel txt_noOfPersons;
    // End of variables declaration//GEN-END:variables
}
