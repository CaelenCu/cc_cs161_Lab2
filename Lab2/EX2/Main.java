//HEADER
//Program Name: Exercise 2
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Due Date: 1/19/2020
//Description: Examples of AND, OR, and NAND gates
package EX2;
class Main{
    public static void main (String[] args){
        //variables used to display gate logic
        //set default variable value to true
        Boolean a = true;
        Boolean b = true;
        
        //Display initial values to the user
        System.out.println("Current Values: " + a + " " + b);
       
        //check and gate logic
        if(a&&b == true){
            //if a and b are true, print info to user
            System.out.println("AND gate is true");
        }
        //Display new scenario to user
        a = true;
        b = false;
        System.out.println("Current Values: " + a + " " + b);

        //show when an and gate is false
        if(a&&b != true){
        System.out.println("AND gate is not true");
        }

        //Display another scenario to user
        a = true;
        b = true;
         System.out.println("Current Values: " + a + " " + b);

        //Check logic against OR gate
        if(a||b == true){
        //if a OR b are true, print info to user
        System.out.println("OR gate is true");
        }
        //Display another scenario to user
        a = false;
        b = false;
        System.out.println("Current Values: " + a + " " + b);
        
        //The only case in which an OR gate is false is when both variables are false
        if(a == false && b == false){
        System.out.println("OR gate is not true");
        }

        //Display another scenario to user
        a = true;
        b = true;
        System.out.println("Current Values: " + a + " " + b);

        //NAND gates are only false when both variables are true
        if(a&&b == true){
            System.out.println("NAND gate is not true");
        }

        //Display another scenario to user
        a = false;
        b = true;
        System.out.println("Current Values: " + a + " " + b);

        //Show the other case for NAND gates
        if(!(a&&b == true)){
        System.out.println("NAND gate is true");
        }
    }    
}
/* FOOTER
Current Values: true true
AND gate is true
Current Values: true false
AND gate is not true
Current Values: true true
OR gate is true
Current Values: false false
OR gate is not true
Current Values: true true
NAND gate is not true
Current Values: false true
NAND gate is true
*/