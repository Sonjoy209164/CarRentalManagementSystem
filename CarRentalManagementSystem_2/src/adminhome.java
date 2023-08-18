import project.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import project.*;
import java.sql.*;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class adminhome extends javax.swing.JFrame {

    /**
     * Creates new form adminhome
     */
    public adminhome() {
        initComponents();
      
            
        update_info() ;
         // new CustomerDetailsBill().setVisible(true);
        
//        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15)) ;
//        jTable1.getTableHeader().setOpaque(false);
//        jTable1.getTableHeader().setBackground(new Color(120,136,203));
//        jTable1.getTableHeader().setForeground(new Color(0,0,0));
//        jTable1.setRowHeight(25);
             GradientDropdownMenu menu = new GradientDropdownMenu();
        
        menu.addItem("ADMIN");
        menu.addItem("Employee", "Add Employee", "Edit Employee Info", "Terminate Employee");
        menu.addItem("Approval ", "Approve Employee");
        
        menu.addItem("                                                                                                                                                                                                                     ");
        menu.addItem("Jump To", "Back", "Customer Details", "Car Details");
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
             
            
            new customerdetails().setVisible(false);
            
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_noOfPersons = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        totalincome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_noOfBooks = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel2.setkGradientFocus(400);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 204));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Add Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel4.setkGradientFocus(100);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 204, 204));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Edit Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team-work (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel5.setkGradientFocus(200);
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 204, 204));

        jButton5.setBackground(new java.awt.Color(255, 102, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Delete Employee");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("No of Cars");

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 33, -1, -1));

        txt_noOfPersons.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txt_noOfPersons.setText("55");
        jPanel17.add(txt_noOfPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car-wash.png"))); // NOI18N
        jPanel17.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 170, -1));

        jPanel18.setBackground(new java.awt.Color(255, 204, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jPanel18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 55, -1, -1));

        totalincome.setBackground(new java.awt.Color(255, 204, 204));
        totalincome.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        totalincome.setText("55");
        jPanel18.add(totalincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 128, 200, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jPanel18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 120));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel25.setText("Total Bill");

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 55)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 33, -1, -1));

        txt_noOfBooks.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txt_noOfBooks.setText("55");
        jPanel16.add(txt_noOfBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/division.png"))); // NOI18N
        jPanel16.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel29.setText("No of Employees");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel22)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel25)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addComponent(jLabel25))
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminx.jpeg"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        ResultSet rs=select.getData("select *from users");
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(0);
//        try
//        {
//            while(rs.next())
//            {
//                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7)});
//            }
//            rs.close();
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addemployee().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Updateemployee().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteemployee().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel totalincome;
    private javax.swing.JLabel txt_noOfBooks;
    private javax.swing.JLabel txt_noOfPersons;
    // End of variables declaration//GEN-END:variables
}
