/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import javax.swing.JFrame;

/**
 *
 * @author saqua
 */
public class SpringMajorProgram {

    /**
     * @param args the command line arguments
     */
    //Main for my program and displays the Gui
    //Not much to see here
    public static void main(String[] args) {
        // TODO code application logic here
        //JFrame s = new JFrame();//
        NewGui g = new NewGui();//Calls the Gui
        g.setTitle("BudgetMaster");
        g.setVisible(true);
       
       
        g.setLocationRelativeTo(null);
    }
    
}
