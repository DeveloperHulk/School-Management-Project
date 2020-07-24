/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.awt.Color;

/**
 *
 * @author rahultfvgh
 */
public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FrontPage obj = new FrontPage();
       obj.setVisible(true);
       
       
       for(int i=0;i<=100;i++)
       {
           try {
                Thread.sleep(100); // this is used to show the progressbar value 0 to 100
           obj.jProgressBar1.setValue(i);
           } catch (Exception e) {
           }
          
       }
      
      obj.dispose();
      HomePage obj1 = new HomePage();
      obj1.setVisible(true);
    }
    
}
