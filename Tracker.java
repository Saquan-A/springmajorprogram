/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import java.util.ArrayList;
import static springmajorprogram.Client.newline;

/**
 *
 * @author saqua
 */
public class Tracker {
    
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    private double balance = 0.0;
    
    private Budget budget = new Budget();
     public static String newline = System.getProperty("line.separator");
    
    public Tracker(){
        transactions = new ArrayList<Transaction>();
    }
    
            public int getNumtransactions(){
        return getTransactions().size();
    }
    public Transaction gettransactions(int index){
        return getTransactions().get(index); 
    }
    public void settransactions(int index, Transaction item ) {
        getTransactions().set(index, item);
    }
    public void addtransactions( Transaction item) {
        getTransactions().add(item);
    }
    public void removetranactions(int index){
        
       getTransactions().remove(index);
        
        
    }

    /**
     * @return the transactions
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance += balance;
    }
    //Makes a For loop that goes through all the data in the ArrayList then calls the transactions toString to convert all the data into a string
    public String toString(){
        double add = 0.0;
        String largeString = "";
        
        for(int i = 0; i < transactions.size(); i++){
            largeString += transactions.get(i).toString()+newline;
            //Gets the Balance by Count the number of times it goes through the loop? Doesn't make sense but i was told it was right
             if(getBalance()== 1) {
            add += getNumtransactions();
        } else {
            add -= getNumtransactions();
        }
        
        
        
            
                    }
       
        
        setBalance(add);
        return largeString;
    }
    
}
