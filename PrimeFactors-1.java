//Creating program to prompt users to enter their input and sort 
//factors in reverse order
//Created by Natasha Ramos-Gomez
//January 25, 2019
//University of South Florida
//COP2513

//use to import scanner class
import java.util.*;
//use to import stack clas
import java.util.Stack;

public class PrimeFactors {
    
    public static void main(String[] args) 
    {
        //used to prompt user input
        System.out.println("Enter a positive number:" + "  ");
        int userInput = new Scanner(System.in).nextInt();
        
        //Creating the stack for the intergers
        StackOfIntegers pile = new StackOfIntegers();
        int prime = 2;//declaring value for prime
        while (prime <= userInput) {//statement used when our prime is less or equal to our user's inputs
            if (userInput % prime == 0) {//modulo statement to divide our values to return our end result
                pile.push(prime);//pushes values to the stack
                userInput /= prime;//Dividing the user's input by our set value of 2
            } else {
                prime++;
            }
        }
        while (!pile.empty()) {//testing to see if the stack is empty 
            System.out.print(pile.pop() + " ");//pop is being used to retirve the top value of the stack and removed
        }


    }
}
        
