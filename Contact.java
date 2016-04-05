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
public class Contact {
    
    private String homeAddress;
    
    private String phone;
    
    private String email;
    
    public static String newline = System.getProperty("line.separator");
    
    public Contact(){
        
    }
    
    public Contact(String homeAddress, String phone, String email){
        this.homeAddress = homeAddress;
        
        this.phone = phone;
        
        this.email = email;
    }
    
    @Override
    //This method is never called but it was orginally for trying to change one jLabel into a string but the line breaker stuff didnt work with the JLabel
    public String toString(){
        String largeString = "";
        
        largeString = "Client HomeAddress: "+homeAddress+newline+"Client Phone: "+phone+newline+"Client Email: "+email;
        
        return largeString;
    }

    /**
     * @return the homeAddress
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
