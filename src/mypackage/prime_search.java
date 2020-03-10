/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
/**
 *
 * @author Tonny Kamau
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class prime_search {
    
    public static void main(String args[]){
   	
	int temp,num,inc=0;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
        num=0;
 boolean valid=false;
        while(!valid){
            try{
            
            num=scan.nextInt();
            valid=true;
            if(num<1){
            System.out.println("Enter a positive integer");
            valid=false;
            }
    
            }
            catch(InputMismatchException e){
                System.out.println("Enter valid integer input");
                scan.nextLine();
                valid=false;
         
            }
        
       
        
        }

	for(int i=num;i>=1;i--)
	{
           temp=num%i;
	   if(temp==0)
	   {

               inc++;
              
	   }
	}
	 System.out.println("The increment is "+inc);
        if(inc==2){
	   System.out.println(num + " is a Prime Number");
        }
	else
	   System.out.println(num + " is not a Prime Number");
   }

   
    }
    

