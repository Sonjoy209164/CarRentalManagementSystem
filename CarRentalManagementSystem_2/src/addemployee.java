
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.ConnectionProvider;
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
public class addemployee extends javax.swing.JFrame {

    /**
     * Creates new form addemployee
     */
    public addemployee() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15)) ;
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(120,136,203));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.setRowHeight(25);
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
            
            
            
            
            }
    }
});
    }
      public void insertsignup()
    {
       String name=jTextField1.getText();
       
        String email=jTextField2.getText();
        String password = jPasswordField1.getText();
        String securityQuestion=(String) jComboBox2.getSelectedItem();
        //String securityQuestion=jTextField4.getText();
        System.out.print(securityQuestion);
        String q=securityQuestion;
        String answer = jTextField5.getText();
        String address=jTextField3.getText();
        if(name.equals("")|| email.equals("")|| password.equals("")||answer.equals("")||address.equals(""))
           ; //JOptionPane.showMessageDialog(null," ");
        else
        {
            String Query;
          
             //Query = "insert into users values ('"+name+"','"+email+"','"+password+"','What is your favourite car?','"+answer+"','"+address+"','false')";
               Query = "insert into users values ('"+name+"','"+email+"','"+password+"','"+securityQuestion+"','"+answer+"','"+address+"','false')";
              InsertUpdateDelete.setData(Query, "Registered Successfully");
              setVisible(false);
              new addemployee().setVisible(true);
        }
    }
    public boolean checkDuplicateUser()
    {
        String name = jTextField1.getText();
        boolean isExist = false;
        try {
             //con=(Connection) ConnectionProvider.getcon();
            
            PreparedStatement st = ConnectionProvider.getcon().prepareStatement("Select * from users where name = ?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                isExist = true;
            }
            else {
                isExist = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    public boolean validateSignup(){
        String name=jTextField1.getText();
       
        String email=jTextField2.getText();
        String password = jPasswordField1.getText();
        String securityQuestion=(String) jComboBox2.getSelectedItem();
        //String securityQuestion=jTextField4.getText();
        System.out.print(securityQuestion);
        String q=securityQuestion;
        String answer = jTextField5.getText();
        String address=jTextField3.getText();
        if(name.equals("")|| email.equals("")|| password.equals("")||answer.equals("")||address.equals(""))
        {JOptionPane.showMessageDialog(null,"Every field is required ");}
        else {return true;}
        return true;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(104, 131, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Security Question", "Address", "Approval"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 930, 120));

        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setText("Enter Username");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        search.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        search.setDoubleBuffered(true);
        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 730, 44));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 48, 44));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 42, 44));

        kGradientPanel2.setkEndColor(new java.awt.Color(104, 131, 188));
        kGradientPanel2.setkGradientFocus(400);
        kGradientPanel2.setkStartColor(new java.awt.Color(104, 131, 188));

        jButton2.setBackground(new java.awt.Color(138, 48, 127));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 39, 44));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 77, 40));

        jTextField1.setBackground(new java.awt.Color(104, 131, 188));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 249, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 77, 40));

        jTextField2.setBackground(new java.awt.Color(104, 131, 188));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 249, 40));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("password");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 100, 40));

        jPasswordField1.setBackground(new java.awt.Color(104, 131, 188));
        jPasswordField1.setText("password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 300, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Security Question");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 164, 40));

        jComboBox2.setBackground(new java.awt.Color(104, 131, 188));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite car?", "What is your birthday?", "What is your first car?", "What is your favourite hobby?" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 300, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 164, 40));

        jTextField5.setBackground(new java.awt.Color(104, 131, 188));
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 298, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 164, 40));

        jTextField3.setBackground(new java.awt.Color(104, 131, 188));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, 298, 40));

        jButton3.setBackground(new java.awt.Color(104, 131, 188));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinupp.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 720, 115, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 990, 780));

        kGradientPanel1.setkEndColor(new java.awt.Color(138, 48, 127));
        kGradientPanel1.setkStartColor(new java.awt.Color(138, 48, 127));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 777));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
          ResultSet rs=select.getData("select *from users");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(validateSignup()==true){
            if(checkDuplicateUser()==false){
                insertsignup();
            }
            else{
                JOptionPane.showMessageDialog(this,"Username already exist");
            }
        }
        //   insertsignup();
        //        String name=jTextField1.getText();
        //        String email=jTextField2.getText();
        //        String password = jPasswordField1.getText();
        //        String securityQuestion=(String) jComboBox2.getSelectedItem();
        //        //String securityQuestion=jTextField4.getText();
        //        System.out.print(securityQuestion);
        //        String q=securityQuestion;
        //        String answer = jTextField5.getText();
        //        String address=jTextField3.getText();
        //        if(name.equals("")|| email.equals("")|| password.equals("")||answer.equals("")||address.equals(""))
        //            JOptionPane.showMessageDialog(null,"Every field is required ");
        //        else
        //        {
            //            String Query;
            //
            //             //Query = "insert into users values ('"+name+"','"+email+"','"+password+"','What is your favourite car?','"+answer+"','"+address+"','false')";
            //               Query = "insert into users values ('"+name+"','"+email+"','"+password+"','"+securityQuestion+"','"+answer+"','"+address+"','false')";
            //              InsertUpdateDelete.setData(Query, "Registered Successfully");
            //              setVisible(false);
            //              new signup().setVisible(true);
            //        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nameorEmail=search.getText();
        ResultSet rs=select.getData("select *from users where name like '%"+nameorEmail+"%' or  email like '%"+nameorEmail+"%'");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7)});
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminhome().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        // TODO add your handling code here:
        if(search.getText().equals("Enter Username")){
            search.setText("");
            search.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_searchFocusLost

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        // TODO add your handling code here:
        if(search.getText().equals("Enter Username")){
            search.setText("");
            search.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_searchFocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:\
//        int index = jTable1.getSelectedRow();
//        TableModel model=jTable1.getModel();
//        String email= model.getValueAt(index, 1).toString();
//        String status= model.getValueAt(index, 4).toString();
//        if(status.equals("true"))
//        {
//            status="false";
//        }
//        else status="true";
//
//        try
//        {
//            int a= JOptionPane.showConfirmDialog(null, "Do you want to change the status of "+email+" ","select",JOptionPane.YES_NO_OPTION);
//            if(a==0)
//            {
//                InsertUpdateDelete.setData("update users set status='"+status+"' where email ='"+email+"' ", "Status changed successfully");
//                setVisible(false);
//                new addemployee().setVisible(true);
//            }
//        }
//
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
