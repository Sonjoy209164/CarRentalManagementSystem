
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class usercarinfoshow extends javax.swing.JFrame {

    /**
     * Creates new form usercarinfoshow
     */
    byte [] img = null;
    public usercarinfoshow() {
        initComponents();
            jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15)) ;
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(120,136,203));
        jTable1.getTableHeader().setForeground(new Color(0,0,0));
        jTable1.setRowHeight(25);
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
    
     public void setimages()
    {
        try {
          
             Class.forName("com.mysql.cj.jdbc.Driver");
     
        
         
           
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","naruto709@@");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from rentit");
              int row = jTable1.getSelectedRow();
        String tableclick = (jTable1.getModel().getValueAt(row, 1).toString());
           //JOptionPane.showMessageDialog(null, tableclick);  
           
            
            
            while(rs.next()){
                //String car= rs.getString("carRegNumber");
                 //JOptionPane.showMessageDialog(null, car);
                if(String.valueOf(rs.getString("carRegNumber")).equals(tableclick)){
                    img = rs.getBytes("Image");
                    ImageIcon image = new ImageIcon(img);
                     //JOptionPane.showMessageDialog(null, "in2");
                    Image im = image.getImage();
                    Image myimg = im.getScaledInstance(Limage.getWidth(), Limage.getHeight(), Image.SCALE_SMOOTH);
                    // JOptionPane.showMessageDialog(null, "in3");
                    ImageIcon newImage = new ImageIcon(myimg);
                    Limage.setIcon(newImage);
                    
//                    img1 = rs.getBytes("ImagePage1");
//                     image = new ImageIcon(img1);
//                     im = image.getImage();
//                     myimg = im.getScaledInstance(label_image1.getWidth(), label_image1.getHeight(), Image.SCALE_SMOOTH);
//                     newImage = new ImageIcon(myimg);
//                    label_image1.setIcon(newImage);
//                    
//                    img2 = rs.getBytes("ImagePage2");
//                     image = new ImageIcon(img2);
//                     im = image.getImage();
//                     myimg = im.getScaledInstance(label_image2.getWidth(), label_image2.getHeight(), Image.SCALE_SMOOTH);
//                     newImage = new ImageIcon(myimg);
//                    label_image2.setIcon(newImage);
//                    
//                    img3 = rs.getBytes("ImagePage3");
//                     image = new ImageIcon(img3);
//                     im = image.getImage();
//                     myimg = im.getScaledInstance(label_image3.getWidth(), label_image3.getHeight(), Image.SCALE_SMOOTH);
//                     newImage = new ImageIcon(myimg);
//                    label_image3.setIcon(newImage);
                    break;
                    
                }
            
            }
            
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Limage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "Car Reg. no.", "Car Type", "Seat Number ", "Price", "Status", "Discount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 227, 610, 309));

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(308, 312));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(308, 312));

        Limage.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(Limage);
        Limage.setBounds(-3, 0, 300, 300);

        kGradientPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 227, 300, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rent a car.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, myimage);

        //        try {
            //            String sql = "Select carimage from rentit where carRegNumber = '" + tableclick + "'";
            //            Connection con = ConnectionProvider.getcon();
            //            PreparedStatement pst = con.prepareStatement(sql);
            //            //                pst.setString(1, newname);
            //            //                pst.setString(2, newemail);
            //            //                pst.setString(3, newaddress);
            //
            //            ResultSet rs = pst.executeQuery();
            //
            //            byte[] image=rs.getBytes("carimage");
            //            format=new ImageIcon(image);
            //            myimage.setIcon(format);
            //
            //            if (rs.next()) {
                //                byte[] imagedata = rs.getBytes("carimage");
                //                format = new ImageIcon(imagedata);
                //                myimage.setIcon(format);
                //            }
            //            //JOptionPane.showMessageDialog(null, "Updated successfully!");
            //        } catch (Exception e) {
            //            e.printStackTrace();
            //        }
        //
        //        // int row=jTable1.getSelectedRow();
        //        //        int[] vv=jTable1.getSelectedColumns();
        //        //        String tc= jTable1.getModel().getValueAt(row, 1).toString();
        //        //        try{
            //            //            Connection con=ConnectionProvider.getcon();
            //            //            String query="select *from rentit where carRegNumber="+tc+"";
            //            //          PreparedStatement  pst=con.prepareStatement(query);
            //            //          ResultSet rs=pst.executeQuery();
            //            //          if(rs.next()){
                //                //        byte[] image=rs.getBytes("carimage");
                //                //         format =new ImageIcon(image);
                //                //         myimage.setIcon(format);
                //                //          }
            //            //        }
        //        //        catch(Exception e){
            //            //
            //            //        }
        // JOptionPane.showMessageDialog(null, "in");
        setimages();

    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
           try{
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","naruto709@@");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select *from rentit");
         jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
         
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Connection error");
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(usercarinfoshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usercarinfoshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usercarinfoshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usercarinfoshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usercarinfoshow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Limage;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
