/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author VAISHNAVI M R
 */
public class Dominos extends javax.swing.JFrame {

    /**
     * Creates new form Saravanabhavan
     */
    public Dominos() {
        initComponents();
        jLabel16.setText(Username.userid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOMINOS");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("PIZZA");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("CHOCO LAVA CAKE");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("WRAP");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("SALAD");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("PEPSI");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jButton1.setText("PLACE ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("145");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("180");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("100");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("220");

        jButton2.setText("<BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("65");

        jLabel7.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel7.setText("ITEM");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setText("RATE");

        jLabel9.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel9.setText("QUANTITY");

        jLabel10.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        jLabel10.setText("COST");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabel2)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jLabel3)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel4)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox5)
                            .addComponent(jLabel6)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))))
        );

        setSize(new java.awt.Dimension(938, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         //jLabel11.setText("hello");
        try {
            FileWriter fw = new FileWriter("userorders.tmp",true);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }// TODO add your handling code here:
        Orders ordersobj=new Orders();
        Suborder subobj=new Suborder();
        subobj.dish="pizza";
        subobj.quantity=(int) jSpinner1.getValue();
        JOptionPane.showMessageDialog(this,subobj.quantity);
        subobj.cost=subobj.quantity*145;
        subobj.hotel="Dominos";
        jLabel11.setText(""+subobj.cost);
        ordersobj.obj.add(subobj);
        ordersobj.uname=Username.userid;
        //ordersobj.uname="vaish";
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    
                    A=(ArrayList<Orders>) oi.readObject();
                    
                    oi.close();
                    fi.close();
                    System.out.println("2");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
              System.out.println("3");
                int index=0,flag=0;
                for (Orders a:A)
                {
                    if(a.uname.equals(ordersobj.uname))
                    {
                        flag++;
                        break;
                    }
                    index++;
                }
                System.out.println("4");
                if(flag==0)
                     A.add(ordersobj);
               else
                {
                    A.get(index).obj.add(subobj);
                }
               System.out.println("list");
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
                System.out.println("6");
                try
                {
                    FileOutputStream fo=new FileOutputStream("UserOrders.tmp");
                    ObjectOutputStream o=new ObjectOutputStream(fo);
                    o.writeObject(A);
                    
                    o.close();
                    fo.close();
                    
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,ex);
                    }
                System.out.println("7");        
              // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
                try {
            FileWriter fw = new FileWriter("userorders.tmp",true);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }// TODO add your handling code here:
        Orders ordersobj=new Orders();
        Suborder subobj=new Suborder();
        subobj.dish="wrap";
        subobj.quantity=(int) jSpinner3.getValue();
        subobj.cost=subobj.quantity*100;
        subobj.hotel="dominos";
        jLabel13.setText(""+subobj.cost);
        ordersobj.obj.add(subobj);
        ordersobj.uname=Username.userid;
        //ordersobj.uname="vaish";
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    
                    A=(ArrayList<Orders>) oi.readObject();
                    
                    oi.close();
                    fi.close();
                    System.out.println("2");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
              System.out.println("3");
                int index=0,flag=0;
                for (Orders a:A)
                {
                    if(a.uname.equals(ordersobj.uname))
                    {
                        flag++;
                        break;
                    }
                    index++;
                }
                System.out.println("4");
                if(flag==0)
                     A.add(ordersobj);
               else
                {
                    A.get(index).obj.add(subobj);
                }
               System.out.println("list");
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
                System.out.println("6");
                try
                {
                    FileOutputStream fo=new FileOutputStream("UserOrders.tmp");
                    ObjectOutputStream o=new ObjectOutputStream(fo);
                    o.writeObject(A);
                    
                    o.close();
                    fo.close();
                    
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,ex);
                    }
                System.out.println("7");
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        try {
            FileWriter fw = new FileWriter("userorders.tmp",true);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }// TODO add your handling code here:
        Orders ordersobj=new Orders();
        Suborder subobj=new Suborder();
        subobj.dish="pepsi";
        subobj.quantity=(int) jSpinner5.getValue();
        subobj.cost=subobj.quantity*65;
        subobj.hotel="dominos";
        jLabel15.setText(""+subobj.cost);
        ordersobj.obj.add(subobj);
        ordersobj.uname=Username.userid;
        //ordersobj.uname="vaish";
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    
                    A=(ArrayList<Orders>) oi.readObject();
                    
                    oi.close();
                    fi.close();
                    System.out.println("2");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
              System.out.println("3");
                int index=0,flag=0;
                for (Orders a:A)
                {
                    if(a.uname.equals(ordersobj.uname))
                    {
                        flag++;
                        break;
                    }
                    index++;
                }
                System.out.println("4");
                if(flag==0)
                     A.add(ordersobj);
               else
                {
                    A.get(index).obj.add(subobj);
                }
               System.out.println("list");
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
                System.out.println("6");
                try
                {
                    FileOutputStream fo=new FileOutputStream("UserOrders.tmp");
                    ObjectOutputStream o=new ObjectOutputStream(fo);
                    o.writeObject(A);
                    
                    o.close();
                    fo.close();
                    
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,ex);
                    }
                System.out.println("7");
                // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         namesofhotels hotel=new namesofhotels();
        hotel.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        try {
            FileWriter fw = new FileWriter("userorders.tmp",true);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }// TODO add your handling code here:
        Orders ordersobj=new Orders();
        Suborder subobj=new Suborder();
        subobj.dish="salad";
        subobj.quantity=(int) jSpinner4.getValue();
        subobj.cost=subobj.quantity*220;
        subobj.hotel="dominos";
        jLabel14.setText(""+subobj.cost);
        ordersobj.obj.add(subobj);
        ordersobj.uname=Username.userid;
        //ordersobj.uname="vaish";
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    
                    A=(ArrayList<Orders>) oi.readObject();
                    
                    oi.close();
                    fi.close();
                    System.out.println("2");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
              System.out.println("3");
                int index=0,flag=0;
                for (Orders a:A)
                {
                    if(a.uname.equals(ordersobj.uname))
                    {
                        flag++;
                        break;
                    }
                    index++;
                }
                System.out.println("4");
                if(flag==0)
                     A.add(ordersobj);
               else
                {
                    A.get(index).obj.add(subobj);
                }
               System.out.println("list");
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
                System.out.println("6");
                try
                {
                    FileOutputStream fo=new FileOutputStream("UserOrders.tmp");
                    ObjectOutputStream o=new ObjectOutputStream(fo);
                    o.writeObject(A);
                    
                    o.close();
                    fo.close();
                    
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,ex);
                    }
                System.out.println("7");
                // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        try {
            FileWriter fw = new FileWriter("userorders.tmp",true);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }// TODO add your handling code here:
        Orders ordersobj=new Orders();
        Suborder subobj=new Suborder();
        subobj.dish="choco lava cake";
        subobj.quantity=(int) jSpinner4.getValue();
        subobj.cost=subobj.quantity*180;
        subobj.hotel="dominos";
        jLabel12.setText(""+subobj.cost);
        ordersobj.obj.add(subobj);
        ordersobj.uname=Username.userid;
        //ordersobj.uname="vaish";
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    
                    A=(ArrayList<Orders>) oi.readObject();
                    
                    oi.close();
                    fi.close();
                    System.out.println("2");
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
              System.out.println("3");
                int index=0,flag=0;
                for (Orders a:A)
                {
                    if(a.uname.equals(ordersobj.uname))
                    {
                        flag++;
                        break;
                    }
                    index++;
                }
                System.out.println("4");
                if(flag==0)
                     A.add(ordersobj);
               else
                {
                    A.get(index).obj.add(subobj);
                }
               System.out.println("list");
               System.out.println("5");
                for(Orders a:A)
                {
                       System.out.println(a.uname);
                       for(Suborder q:a.obj)
                       {
                           System.out.println(q.dish+q.hotel+q.cost);
                       }
                }
                System.out.println("6");
                try
                {
                    FileOutputStream fo=new FileOutputStream("UserOrders.tmp");
                    ObjectOutputStream o=new ObjectOutputStream(fo);
                    o.writeObject(A);
                    
                    o.close();
                    fo.close();
                    
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this,ex);
                    }
                System.out.println("7");
                // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mycart cart=new mycart();
        cart.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dominos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dominos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dominos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dominos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dominos().setVisible(true);
                /*JCheckBox j1;
                j1 = new JCheckBox();
                
                j1.setVisible(true);
                j1.setText("Dosa");
                */
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    // End of variables declaration//GEN-END:variables
}
