/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialexample;

import java.util.Scanner;

/**
 *
 * @author Frayer
 */
public class FactorialExample {//create a class called FactorislExample

   
    public static void main(String[] args) {//main method
        Scanner sca= new Scanner(System.in);//create object called sca that accepts user input
        
        
        System.out.println("Enter a number");//prompts user to enter a number
       int number = sca.nextInt();//sca.nextInt stores the input number from the user.
       
       long starttime= System.currentTimeMillis();//stores the current time before execution
       
       int results=factorial(number);//the method called factorial is called to calculate factorial of the input number and the results are stored in the integer results.
       
           long end= System.currentTimeMillis();//stores the time after execution
           
       System.out.println("Execution time:" +(end-starttime) +"ms"); //calculates the execution time and prints it in milliseconds.
 
          System.out.println("Factorial of " + number + " is " + results);//the results of the factorial of number inputted by user is printed
    }

    
    public static int factorial(int n)//create a method called factorial to find factorial of a given number
    {
        if(n==1)//base case, if n i equal to 1 it returns 1 since factorial of 1 is 1
        {
            return 1;
        }
        else 
        {
            return n*factorial(n-1);//recursive case in the factorial function. It multiplies n by the factorial of n-1, progressively breaking the problem into smaller subproblems until it reaches the base case.
         
          
       
        }
    }
}
