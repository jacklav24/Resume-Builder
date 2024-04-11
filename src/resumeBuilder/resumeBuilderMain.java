// Hi! this is the start of the project.
package resumeBuilder;

import java.util.Scanner;

public class resumeBuilderMain {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        introText();
        
        
        Person person = new Person(scan);
        System.out.println(person);
    }
    
    /**
     * Outputs the intro to the project to the console.
     */
    public static void introText() {
        System.out.println("Let's build a resume!\n");
        System.out.println("Let's start simple. You'll be prompted for your name, phone number,"
                + " email, and linkedIn link. Enter them when prompted, and type -999");
    }
  
}




