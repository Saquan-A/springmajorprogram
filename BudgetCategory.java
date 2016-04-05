/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

/**
 *
 * @author saqua
 */
//not much to say here everything is pretty self explaintory 
public class BudgetCategory {
    
    private String catName = "";
    
    private String catDescription = "";
    
    private double amount = 0.0;
    
    private int categoryType = 0;
    public static String newline = System.getProperty("line.separator");
    
    public BudgetCategory(){
        
    }
    
    public BudgetCategory(String cn, String cd, double amt, int type){
        catName = cn;
        
        catDescription = cd;
        
        amount = amt;
        
        categoryType = type;
    }

    /**
     * @return the catName
     */
    public String getCatName() {
        return catName;
    }

    /**
     * @param catName the catName to set
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * @return the catDescription
     */
    public String getCatDescription() {
        return catDescription;
    }

    /**
     * @param catDescription the catDescription to set
     */
    public void setCatDescription(String catDescription) {
        this.catDescription = catDescription;
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
     * @return the categoryType
     */
    public int getCategoryType() {
        return categoryType;
    }

    /**
     * @param categoryType the categoryType to set
     */
    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }
    
    public String toString(){
        //puts all the values gotten into a string and makes a line breaker at the very end
        String largeString = catName+"       "+Double.toString(amount)+"     "+catDescription+newline+newline;
        return largeString;
    }
    
}
