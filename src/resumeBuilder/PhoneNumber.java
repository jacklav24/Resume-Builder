package resumeBuilder;

import java.util.Scanner;

public class PhoneNumber {
    
    private Long number;
    private int extension;
    private int areaCode;
    private boolean hasExtension;
    public boolean isValidNumber;
    private String unFormattedNumber;
    private String formattedNumber;
    
    public final static int NUMBER_LENGTH = 10;

    
    /**
     * Instantiates an instance using a string.
     * @param number
     */
    public PhoneNumber(String number) {
        // parses string for a number
        this.number = parseNumberString(number);
        // if the number is the right length, instantiate.
        if (isRightLength(this.number)) {
            this.unFormattedNumber = "" + this.number;
            this.formattedNumber = "hi";
            this.isValidNumber = true;
        }
        else { // set number to null and valid number to false.
            this.number = null;
            this.isValidNumber = false;
        }
        
    }
    
    /**
     * instantiates a phone nubmer instance using a long value.
     * @param number long value.
     */
    public PhoneNumber(Long number) {
        this.number = number;
        this.formattedNumber = null;
    }
    
    
    /**
     * Removes any non integer values.
     * @param phoneNumber
     * @return
     */
    public Long parseNumberString(String phoneNumber) {
        // Remove all non-digit characters from the phone number
        String formattedNumber = phoneNumber.replaceAll("[^0-9]", "");
        System.out.println("This is the formatted int. :" + formattedNumber + ":");
        Long phoneNumberInt = Long.parseLong(formattedNumber);
        return phoneNumberInt;
    }
    
    
    /**
     * Checks if the number is the correct length (10 digits) to be a phone number.
     * @param number - phone number.
     * @return boolean isRightLength.
     */
    public boolean isRightLength(Long number) {
        int count = 0;
        Long temp = number;
        
        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        // Check if the count is 10
        return count == 10;
    }
    
    
    /**
     * Gets variable.
     * @return - string unFormattedNumber.
     */
    public String getUnFormattedNum() {
        return this.unFormattedNumber;
    }
}
