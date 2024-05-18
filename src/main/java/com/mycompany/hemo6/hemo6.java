
package com.mycompany.hemo6;

import java.util.Scanner;
public class hemo6 {
    
    public static void main(String[] args){
     
    
      Scanner input = new Scanner(System.in);
      
        System.out.println("enter principal amount:");
        
        double Principal  = input.nextDouble();
        
        System.out.println("enter the interest rate :");
        double  rate = input.nextDouble();
        
        System.out.println("the number of years :");
        
        double number = input.nextDouble();
        
         double Amount = Principal*Math.pow(1+rate,number);
         
          System.out.println("the amount is " + Amount );
         
        
        
        
        
      
        
    }
    
}
