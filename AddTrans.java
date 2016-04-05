/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author saqua
 */
//Add Transactions Gui
public class AddTrans extends javax.swing.JDialog {
Client client = new Client(); //Creates a Client Object so that I can call Client Method
    /**
     * Creates new form AddTrans
     */
//Added a Client Parameter so that my Client object would be the same object thats declared in the main/Gui
    public AddTrans(java.awt.Frame parent, boolean modal, Client client) {
        super(parent, modal);
        this.client = client;
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText1 = new javax.swing.JTextField();
        jText2 = new javax.swing.JTextField();
        jText3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Add Transaction");

        jLabel2.setText("Category:");

        jLabel3.setText("Date:");

        jLabel4.setText("Amount");

        jLabel5.setText("Description:");

        jText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText1ActionPerformed(evt);
            }
        });

        jText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText3ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jPane1);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText1)
                            .addComponent(jText2)
                            .addComponent(jText3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText1ActionPerformed

    private void jText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText3ActionPerformed
//Save Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Try Catch to make sure the input is a correct and wont crash the program
          try {
        double amount = Double.parseDouble(jText3.getText()); //Gets the text from TextField and Converts to double
        //If statment to Test if the inputed value is a Negative
        if(amount < 0){
            JOptionPane.showMessageDialog(null, "Invaild number input! (No negatives!!!)", "ERROR", JOptionPane.ERROR_MESSAGE);
              
        }
        
        Date date = stringToDate(jText2.getText());
        client.addTrans(date, amount, jText1.getText(), jPane1.getText());
        
        
        
        
          } catch(NumberFormatException ex) {
             JOptionPane.showMessageDialog(null, "This is not a number!", "ERROR", JOptionPane.ERROR_MESSAGE);
             
        }
        
        
        //dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//      private Date stringToDate(String sDate) {
//        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//        
//        try{
//            return df.parse(sDate);
//        
//        }catch(java.text.ParseException ex) {
//            System.err.println("Could not convert input date to Date object: "+sDate);
//            System.exit(-1);
//        }
//        return null;
//    }
    
    private Date stringToDate(String sDate) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        try{
            return df.parse(sDate);
        
        }catch(java.text.ParseException ex) {
            JOptionPane.showMessageDialog(null, "Not proper format: Input date as MM/dd/yyyy!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //System.exit(-1);
        }
        return null;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextPane jPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextField jText2;
    private javax.swing.JTextField jText3;
    // End of variables declaration//GEN-END:variables
}
