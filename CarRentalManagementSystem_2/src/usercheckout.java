/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import project.*;
/**
 *
 * @author Asus
 */
public class usercheckout extends javax.swing.JFrame {

    /**
     * Creates new form usercheckout
     */
    public usercheckout() {
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
           jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
         jTextField11.setEditable(false);
    }
       int id=0;
      float coupon;
    String Query;
    String numberofseats;
    String carregnum,carType;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 127, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 127, 220, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Car Registration No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 191, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Check In Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 187, 125, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 187, 149, 26));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 227, 253, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Price Per Day");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 287, 140, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 317, 253, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pay Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 118, -1));

        jButton4.setBackground(new java.awt.Color(102, 0, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 85, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 317, 250, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("% OFF");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 226, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 227, 250, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 227, 249, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Check Out Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 187, 230, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 249, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Transaction Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 200, -1));

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 317, 229, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 79, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 250, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Customer mobile number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 187, 218, 26));

        rSTableMetro1.setBackground(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile No.", "Nationality", "Gender", "Id Proof", "Address", "Check In Date", "Car Reg No", "Price"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasBackgound1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro1.setGridColor(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 650, 1350, 130));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Enter your coupon code");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 389, 221, -1));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 425, 240, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 30, 30));

        jTextField12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 60, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Number Of Days Rented");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 287, 226, -1));

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBox2.setText("proceed To Pay");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Total Bill");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 467, 93, -1));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 590, 260, 40));

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paymentq_1.jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 780));

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       // String name=jTextField10.getText();
           ResultSet rs=select.getData("select *from customer where checkout is NULL ");
        DefaultTableModel model =(DefaultTableModel) rSTableMetro1.getModel();
        try
        {
           while(rs.next())
           {
               model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(12),rs.getString(13)});
           }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown
 float dis;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String  carregno= jTextField1.getText();
         
        if(jTextField11.getText().equals("5577"))
        { 
            
        try
        {
            ResultSet rs= select.getData("select *from rentit where carRegNumber='"+carregno+"' ");
            if (rs.next())
            {//7 8 9 12 13
                jTextField1.setEditable(false);
//                id=rs.getInt(1);
               jTextField12.setText(rs.getString(8));
                 dis = Float.parseFloat(jTextField12.getText());
//                jTextField3.setText(rs.getString(9));
//
//                jTextField5.setText(rs.getString(3));
//                jTextField6.setText(rs.getString(13));
                //jTextField7.setText(rs.getString(8));
                //jTextField8.setText(rs.getString(9));
                //jTextField9.setText(rs.getString(12));
//                SimpleDateFormat myformate = new SimpleDateFormat("yyyy/MM/dd");
//                Calendar cal=Calendar.getInstance();
//                jTextField4.setText(myformate.format(cal.getTime()));
//                String dateBeforeString=rs.getString(9);
//                java.util.Date datebefore = myformate.parse(dateBeforeString);
//                String dateafterString=myformate.format(cal.getTime());
//                java.util.Date dateafter =myformate.parse(dateafterString);
//                long difference=dateafter.getTime()-datebefore.getTime();
//                float noofdaysstay=(int) (difference/(1000*60*60*24));
//                if(noofdaysstay==0)
//                {
//                    noofdaysstay=1;
//                }
//                else
//                {
//
//                }
//
//                jTextField7.setText(String.valueOf(noofdaysstay));
//                float price = Float.parseFloat(jTextField6.getText());
//
//                jTextField8.setText(String.valueOf(noofdaysstay*price));
//                jTextField9.setText(rs.getString(6));
//                coupon= noofdaysstay*price;
//                carType=rs.getString(11);
//                numberofseats=rs.getString(10);

            }

            else
            {
                JOptionPane.showMessageDialog(null, "Car is not booked or Car Reg Number doesn't exist");
            }
            coupon=coupon-(coupon*dis/100);
            jTextField8.setText(String.valueOf(coupon));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jTextField11.setEditable(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new  usercheckout().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name=jTextField2.getText();
        String mobileNumber=jTextField5.getText();
        String email=jTextField9.getText();
        String checkout=jTextField4.getText();
        String numberOfDaysrent=jTextField7.getText();
        String totalAmount=jTextField8.getText();
         String trnum=jTextField10.getText();
        carregnum=jTextField1.getText();

        Query ="update customer set numberOfDaysrent='"+numberOfDaysrent+"',totalammount='"+totalAmount+"',checkout='"+checkout+"' where id='"+id+"'";
        InsertUpdateDelete.setData(Query, "");

        Query ="update rentit set status ='Not Booked' where carRegNumber='"+carregnum+"'  ";
        InsertUpdateDelete.setData(Query, "");

        String path = "F:\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph1=new Paragraph("                                                                       RENT IT NOW !\n");
            doc.add(paragraph1);
            Paragraph paragraph2=new Paragraph("*************************************************************************************************************");
            doc.add(paragraph2);
            Paragraph paragraph3=new Paragraph("\tBill ID:"+id+" \nTransaction ID:"+trnum+" \n Customer Details:\nName :"+name+" \nMobile Number :"+mobileNumber+"\nEmail:"+email+"\n");
            doc.add(paragraph3);
            doc.add(paragraph2);
            Paragraph paragraph4=new Paragraph("\tCar details:\nCar Reg. No. :"+jTextField1.getText()+" \nCar Type :"+carType+"\nNumber Of Seats:"+numberofseats+"\nPrice Per Day :"+jTextField6.getText()+"\n");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tb1=new PdfPTable(4);
            tb1.addCell("Check In Date:"+jTextField3.getText());
            tb1.addCell("Check Out Date:"+checkout);
            tb1.addCell("Number Of Days:\n"+numberOfDaysrent);
            tb1.addCell("Total Amount Paid:"+totalAmount);
            doc.add(tb1);
            doc.add(paragraph2);
            Paragraph paragraph5 = new Paragraph("Thanks you for renting our car.Please visit again.");
            doc.add(paragraph5);
            doc.close();
            int a=JOptionPane.showConfirmDialog(null, "Do you want a receipt?","Select",JOptionPane.YES_NO_OPTION);

            if(a==0)
            {
                try
                {
                    if((new File("F:\\"+id+".pdf")).exists())
                        {
                            Process p=Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler F:\\"+id+".pdf");
                            }
                            else
                            {
                                System.out.println("File is not Exists");
                            }

                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }

                setVisible(false);
                new usercheckout().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String  carregno= jTextField1.getText();
        try
        {
            ResultSet rs= select.getData("select *from customer where carregno='"+carregno+"' and checkout is NULL");
            if (rs.next())
            {//7 8 9 12 13
                jTextField1.setEditable(false);
                id=rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(9));

                jTextField5.setText(rs.getString(3));
                jTextField6.setText(rs.getString(13));
                //jTextField7.setText(rs.getString(8));
                //jTextField8.setText(rs.getString(9));
                //jTextField9.setText(rs.getString(12));
                SimpleDateFormat myformate = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal=Calendar.getInstance();
                jTextField4.setText(myformate.format(cal.getTime()));
                String dateBeforeString=rs.getString(9);
                java.util.Date datebefore = myformate.parse(dateBeforeString);
                String dateafterString=myformate.format(cal.getTime());
                java.util.Date dateafter =myformate.parse(dateafterString);
                long difference=dateafter.getTime()-datebefore.getTime();
                float noofdaysstay=(int) (difference/(1000*60*60*24));
                if(noofdaysstay==0)
                {
                    noofdaysstay=1;
                }
                else
                {

                }

                jTextField7.setText(String.valueOf(noofdaysstay));
                float price = Float.parseFloat(jTextField6.getText());

                jTextField8.setText(String.valueOf(noofdaysstay*price));
                jTextField9.setText(rs.getString(6));
                coupon= noofdaysstay*price;
                carType=rs.getString(11);
                numberofseats=rs.getString(10);

            }

            else
            {
                JOptionPane.showMessageDialog(null, "Car is not booked or Car Reg Number doesn't exist");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(usercheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usercheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usercheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usercheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usercheckout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
