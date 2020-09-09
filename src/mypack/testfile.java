/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author VAISHNAVI M R
 */
public class testfile {
    public static void main(String args[])
    {
        try {
            FileWriter fw = new FileWriter("userpassword.tmp",true);
            fw.close();
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        ArrayList<Orders> A=new ArrayList();
               try
                {
                    System.out.println("1");
                    FileInputStream fi=new FileInputStream(new File("UserOrders.tmp"));
                    ObjectInputStream oi=new ObjectInputStream(fi);
                    System.out.println("$");
                    A=(ArrayList<Orders>) oi.readObject();
                    System.out.println("#");
                    oi.close();
                    fi.close();
                    
                    System.out.println("2");
                }
                catch (Exception e)
                {
                  //  JOptionPane.showMessageDialog(this,e);
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
    }
}
