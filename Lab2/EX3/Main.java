//HEADER
//Program Name: Exercise 3
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Due Date: 1/19/2020
//Description: Take user input and test whether the number entered is positive or negative
package EX3;
import java.util.Scanner;
class Main{
    public static void main(String [] args){
        //create local variable to be manipulated
        double n = 0;
        //create scanner to take user input
        Scanner scan = new Scanner(System.in);
        
        //tell the user what to expect
        System.out.println("Please enter a number:");
        //set local variable to user input
        n = scan.nextDouble();

        //close the scanner to save resources
        scan.close();


        //check if variable is positive, negative, or the origin
        //print the appropriate response to the user
        if(n > 0){
            System.out.println("positive");
        }
        if(n < 0){
            System.out.println("negative");
        }
        if(n == 0){
            System.out.println("origin");
        }

    }
}
/* FOOTER
Please enter a number
-25
negative
*/