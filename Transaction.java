/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author saqua
 */
public class Transaction {
    
    private String category = "";
    
    private Date date;
    
    private double amount = 0.0;
    
    private String description = "";
    
     public static String newline = System.getProperty("line.separator");
    
    public Transaction(){
        this.date = null;
        
    }
    
    public Transaction(Date dt, double amt, String desc, String category){
        this.date = null;
        
        date = dt;
        
        amount = amt;
        
        description = desc;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    private String dateToString(Date date){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return df.format(date);
    }
    //Returns a String with all the transaction data in a line
    public String toString(){
        String largeString = "";
        
        largeString = category+"  "+dateToString(date)+" "+amount+" "+description+newline;
        
        return largeString;
    }
}
