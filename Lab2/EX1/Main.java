//HEADER
//Program Name: Exercise 1
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Due Date: 1/19/2020
//Description: Take a float-point number and define it as zero, positive, or negative,
//             as well as whether it is large or small

package EX1;
import java.util.Scanner;
class Main{
    public static void main (String[] args){
        //Create new scanner for user input
        Scanner scan = new Scanner(System.in);
        //create a local float point variable to manipulate
        float n = 0;
        //variable to keep track of the absolute value of n
        float abs = 0;
        
        //Enlighten the user on what to do
        System.out.println("Type in any number: ");
        //Set local variable to user input
        n = scan.nextFloat();
        //close the scanner when it is not in use to save on resources
        scan.close();
        
        //Check The user generated number to test if it's positive, negative, or zero
        if(n == 0){
            System.out.println("zero");
        }
        else if(n > 0){
            System.out.println("positive");
        }
        else if(n < 0){
            System.out.println("negative");
        }

        //Check the user generated number to test if it's small (less than the abs. value of 1) or large
        //(greater than one million)
        abs = Math.abs(n);
        if(abs < 1){
            System.out.print("small");
        }
        else if(n > 1000000){
            System.out.print("large");
        }
        




    }
}    
/* FOOTER
Type in any number:
-.9
negative
small
*/