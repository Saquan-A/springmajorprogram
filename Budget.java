/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import java.util.ArrayList;

/**
 *
 * @author saqua
 */
class Budget {
    
    private ArrayList<BudgetCategory> categories;
    
    private double totalAllocated = 0.0;
    
    private double totalIncome = 0.0;
    
    private double allocationBalance = 0.0;
    
    public static String newline = System.getProperty("line.separator"); // line breaker cause \n doesnt work for me
    
    public Budget(){
        categories = new ArrayList<BudgetCategory>(); //insantiates a budget arrayList
    }

    /**
     * @return the categories
     */
    public ArrayList<BudgetCategory> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(ArrayList<BudgetCategory> categories) {
        this.categories = categories;
    }

    /**
     * @return the totalAllocated
     */
    public double getTotalAllocated() {
        return totalAllocated;
    }

    /**
     * @param totalAllocated the totalAllocated to set
     */
    //Changed to += so that when I load or add information allcocated gets increased with any extra nonsense
    public void setTotalAllocated(double totalAllocated) {
        this.totalAllocated += totalAllocated;
    }

    /**
     * @return the totalIncome
     */
    public double getTotalIncome() {
        return totalIncome;
    }

    /**
     * @param totalIncome the totalIncome to set
     */
    //See what i did for the set Total allocated method
    public void setTotalIncome(double totalIncome) {
        this.totalIncome += totalIncome;
    }

    /**
     * @return the allocationBalance
     */
    public double getAllocationBalance() {
        return allocationBalance;
    }

    /**
     * @param allocationBalance the allocationBalance to set
     */
    public void setAllocationBalance(double allocationBalance) {
        this.allocationBalance = allocationBalance;
    }
        public int getNumassignments(){
        return categories.size();
    }
    public BudgetCategory getcategories(int index){
        return categories.get(index); 
    }
    public void setcategories(int index, BudgetCategory item ) {
        categories.set(index, item);
    }
    public void addcategories( BudgetCategory item) {
        categories.add(item);
    }
    public void removecategories(int index){
        categories.remove(index);
    }
    public void clearCategories(){
        for (int i = 0; i<categories.size(); i++){
            categories.remove(i);
        }
    }
    
    
    public String toString(){
        String largeString3 = ""; //used to hold any Income information
        String largeString = ""; // used to hold any Expense information
        
       // String largeString = Double.toString(totalAllocated)+"\n"+Double.toString(totalIncome)+"\n";
        
        //for loop that goes throught the entire arrayList
        for(int i = 0; i < categories.size (); i++){
            //If statment the seperates values that are considered income and ones that are consiered expenses 
            if(categories.get(i).getCategoryType() == 1){
                largeString3 += categories.get(i).toString()+newline;
                
            } else {
              largeString += categories.get(i).toString()+newline;  
            }
            
           // totalAllocated += categories.get(i).getAmount();
            
        }
        largeString += newline+"Total Allocated: "+Double.toString(totalAllocated)+newline+newline;
        
        largeString += newline+largeString3+newline+newline;
        
        largeString += "Total Income: "+Double.toString(totalIncome);
        
        double balance = totalIncome -totalAllocated;
        
        largeString += newline+newline+"Allocation Balance: "+Double.toString(balance);
        return largeString;
    }
    
}
