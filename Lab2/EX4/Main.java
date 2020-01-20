//HEADER
//Program Name: Exercise 4
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Due Date: 1/19/2020
//Description: Take user input between 0 and 100, then test it against <50 and >50 for a
//             pass fail check

package EX4;
import java.util.Scanner;
class Main{
    public static void main (String[] args){
        //Create new scanner for the system
        Scanner scan = new Scanner(System.in);
        //Create local variable to manipulate
        double n = 0;

        //Tell the user what to do
        System.out.println("Please enter a number between 0 and 100.");
        //Set the next user input to variable n
        n = scan.nextDouble();

        //Makes sure that n is between 0 and 100
        while(n > 100){
            System.out.println("Inappropriate value, please try again: ");
            n = scan.nextDouble();
        }
        while(n < 0){
            System.out.println("Inappropriate value, please try again: ");
            n = scan.nextDouble();
        }
        //closes scanner to save on resources
        scan.close();

        //Checks to determine pass or fail within the system
        //pass
        if(n > 50){
            System.out.println("pass");
        }
        //fail
        if(n < 50){
            System.out.println("fail");
        }
        //exception, not handled in the given information
        if(n == 50){
            System.out.println("exception");
        }
    }
}    
/* FOOTER
Please enter a number between 0 and 100.
50
exception
*/