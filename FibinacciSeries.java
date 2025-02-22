/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibinacciseries;

/**
 *
 * @author Frayer
 * 
 */

//import scanner class for the inputs

import java.util.Scanner;

//create a public class called fibinacciseries

public class FibinacciSeries {

    public static void main(String[] args) { //main method
        
        Scanner scanner=new Scanner(System.in);  //create a object to read the input from the user
        System.out.println("series of numbers"); //output requesting user to enter the series of number 
        int n= scanner.nextInt(); //scanner.nextInt reads input from user and it is stored in n
        
       long starttime= System.currentTimeMillis();//currentTimeMillis is a method used to return current in milliseconds. start time shows the current time of the system before execution occurs.
        for(int i=0; i<n; i++) // loop that runs n times , i is incremented by 1 and the initial i is 0
        {
            System.out.print(fibonacci(i)+","); //the loop calculates and prints the fibonacci of the number separated by commas
            
        }
        //shows the new system time after the system has calculated the fibonacci numbers.
        long end=System.currentTimeMillis();
     //prints the execution time in milliseconds
        System.out.println( "Execution time:" +(end-starttime) +"ms");
        
        
    }
    public static int fibonacci(int n) //create a method called fibonacci with pameter n
    {
        if(n==0) //if n is 0 the output will be 0 //basecase 1
        {
            return 0; // returns 0 if n is equal to 0;
        }
        else if(n==1) //if n is 1 the fibonacci output will be 1 basecase 2.
        {
            return 1; //returns 1 if n is equal t 1
        }
        else
            return fibonacci(n-1)+fibonacci(n-2); //else if n>=2 the fibonacci method will output the next number which is the sum of previous two numbers
        //recursively calculates the fibonacci series by calling the function
        
    }
    
}
//end
