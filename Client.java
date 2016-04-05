/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static springmajorprogram.Tracker.newline;

/**
 *
 * @author saqua
 */
//I added a lot of stuff to this classes which is why its so clustered
public class Client {
    
    private String firstName = "";
    
    private String lastName = "";
    
    private Contact contact = new Contact();
    
    private Budget budget = new Budget();
    
    private Tracker tracker = new Tracker();
    
    public static String newline = System.getProperty("line.separator");
    private int filter = 1;
    
    public Client(){
    
        
    }
    //This really isnt even needed dont know why I made it
    public Client (String fname, String lname) {
        firstName = fname;
        
        lastName = lname;
    }
    //How the data will load into array lists and such
    //My Try Catch Block will catch all expetions and display and error message to help the user get the correct formatted file
    public void loadClientFile(String fileName) {
    
    double amount = 5.0; //So that amounts defualt value wont be zero and wont skip the first while loop
    
    try {
    File data = new File(fileName);
    Scanner reader = new Scanner(data);
    
    //I had made getters and setters for first name and last name for some reason but yeah thats what those methods do
        setFirstName(reader.nextLine());
        setLastName(reader.nextLine());
    contact.setHomeAddress(reader.nextLine());
    contact.setPhone(reader.nextLine());
    contact.setEmail(reader.nextLine());
    
    amount = reader.nextDouble();
    //While loop that reads in the budget information
    while(amount != 0){
            
                
              int type = reader.nextInt();
              //if statment to see whether something is an income or expense then adds that amount to either Total Income or Total Allocated
            if(type == 0){
                budget.setTotalAllocated(amount);
            } else {
                budget.setTotalIncome(amount);
            }
            String catName = reader.next();
            
            reader.nextLine();
            
            String catDesc = reader.nextLine();
            //creates a budgetcategory object that sets the read values and also used to put them into the array list.
            BudgetCategory category = new BudgetCategory(catName, catDesc, amount, type);
            
            budget.addcategories(category);
            
            amount = reader.nextDouble(); 
            
    }  
    
    reader.nextLine();
    //While loop that reads in the transaction information
        while (reader.hasNext()) {
            String category = reader.nextLine();
            
            String date = reader.next();
            
            amount = reader.nextDouble();
            
           // tracker.setBalance(amount);
            
            reader.nextLine();
            //Converts the String to a Date object
            Date nDate = stringToDate(date);
            
            String desc = reader.nextLine();
            //See what i did for the budget category Object
            Transaction transaction = new Transaction(nDate, amount, desc, category);
            
           
           tracker.addtransactions(transaction);
            
           }
        //Catch block that catches any exceptions
    }catch(Exception ex){
        //To try and narrow down what errors the user has I used If statments to try and help the user know what they did wrong also if any information was to be read in before the 
        //error was caught then it will delete anything within the arrays so if they use the program again it wont give them incorrect values
        if(ex instanceof InputMismatchException) {
        JOptionPane.showMessageDialog(null, "Incorrect File Format! Try another file!", "ERROR", JOptionPane.ERROR_MESSAGE);
        
       budget.clearCategories();
       budget.setTotalAllocated(0);
       budget.setTotalIncome(0);
    } else {
            JOptionPane.showMessageDialog(null, "UnReadable variable in File! Use correct format!", "ERROR", JOptionPane.ERROR_MESSAGE);
           
            
            budget.clearCategories();
            budget.setTotalAllocated(0);
            budget.setTotalIncome(0);
        }
    } 
        
    } 
    //This is a method I added for my add button, so that the new information would be added to the same array as a loadedclient information
    public void addBudget(String cn, String cd, double amount, int type){
        BudgetCategory bC = new BudgetCategory(cn, cd, amount, type);
        
        if(type == 0){
            budget.setTotalAllocated(amount);
        } else {
            budget.setTotalIncome(amount);
        }
        
        budget.addcategories(bC);
        
    }
    //See addBudget method
    public void addTrans(Date nDate, double amount, String desc, String category ){
        
       // String newDate = dateToString(nDate);
        
        Transaction tC = new Transaction(nDate, amount, desc, category);
        
        tracker.addtransactions(tC);
        
    }
    
         private String dateToString(Date date){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return df.format(date);
    }
    
    
    //This is empty because I did everything in my save button action preformed and putting it here wouldnt would only have made this class look even messer
    public void saveClientFile(String fileName){
        
    }
    //Converts a String object to a Date
    private Date stringToDate(String sDate) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        try{
            return df.parse(sDate);
        //my own personal edit to see so that instead of closing the entire program if the error is caught it just pops up an error message
        }catch(java.text.ParseException ex) {
            JOptionPane.showMessageDialog(null, "Not proper format: Input date as MM/dd/yyyy!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //System.exit(-1);
        }
        return null;
    }
    //gets the buget report by basically calling the budget toString() which loops while calling the BudgetCategory to string
    public String getBudgetReport(){
        String largeString2 = "Budget Report"+newline+newline;
       
        
        largeString2 = largeString2+budget.toString();
        
        return largeString2;

        
    }
    //See BudgetReport its the same concept
    public String getTransactionReport(){
        double add = 0.0;
        String largeString4 = "Transaction Report"+newline+newline;
        
        largeString4 = largeString4+tracker.toString();
        
       largeString4 += newline+newline+ "Balance: "+Double.toString(tracker.getBalance());
        return largeString4;
    }
    //toStringMethod used in my Gui to change my jLabels to the required contact information
    public String toString(){
        String largeString = contact.toString();
        
        return largeString;
    }
    // Honestly dont even know what these were made/used for think i was just testing stuff out. They're redundent though
    public String getAddress(){
        String address = contact.getHomeAddress();
        return address;
        
    }
    public String getPhone(){
        String phone = contact.getPhone();
        return phone;
    }
    public String getEmail(){
        String email = contact.getEmail();
        
        return email;
    }

    /**
     * @return the firstName
     */
    //Dont know why i made these methods they really just junk up the class
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    
}
