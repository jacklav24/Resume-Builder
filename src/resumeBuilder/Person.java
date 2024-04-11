package resumeBuilder;

import java.util.Scanner;

public class Person {
    private String name;
    private PhoneNumber phone;
    private String email;
    private String linkedIn;
    
    public Person() {
    }
    
    /**
     * @param name
     * @param phone
     * @param email
     * @param linkedIn
     */
    public Person(String name, PhoneNumber phone, String email, String linkedIn) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.linkedIn = linkedIn;
    }
    
    /**
     * Gets a person. Functions as a constructor of sorts.
     * @param scan
     */
    public Person(Scanner scan) {
        this.name = InputValidation.queryString(scan, "Enter your name (formatted First Last): ", "Must be a string");
        getPhoneNumber(scan);
        this.email = InputValidation.queryString(scan, "Enter your email: ", "Must be a string");
        this.linkedIn = InputValidation.queryString(scan, "Enter your linkedIn link: ", "Must be a string");        
    }
    
    public void getPhoneNumber(Scanner scan) {
        System.out.println("Enter your phone number formatted (XXX) XXX-XXXX .");
        String temp = InputValidation.queryString(scan, "Enter here : ", "Try again: ");
        PhoneNumber number = new PhoneNumber(temp);
        while (!number.isValidNumber) {
            temp  = InputValidation.queryString(scan, "Try again : ", "Try again: ");
            number = new PhoneNumber(temp);
        }
        
        this.phone = number;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the phone
     */
    public PhoneNumber getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(PhoneNumber phone) {
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
    /**
     * @return the linkedIn
     */
    public String getLinkedIn() {
        return linkedIn;
    }
    /**
     * @param linkedIn the linkedIn to set
     */
    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
    
    
    @Override
    public String toString() {
        return "My name is " + name + ". I can be reached by phone at: " + phone.getUnFormattedNum()
        + " or by email at: " + email + ". Check out my linkedIn page too at: " + linkedIn;
                
    }
   
}
