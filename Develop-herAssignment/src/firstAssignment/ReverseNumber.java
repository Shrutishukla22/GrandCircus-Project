package firstAssignment;

import java.util.Scanner;
/*
 * ReverseNumber application takes input from user and reverse the number
 */

public class ReverseNumber {
	  
	
	private int reverseNumber(int number ){
	    	
	    	 int reversenum=0;
			    
			    while(number!=0){
			    	//Find the unit (last digit) of the number
			    	int unit= number%10;	
			    	//shift the last digit to left
			    	reversenum = reversenum*10 + unit;		    	
			    	//get the number after removing last digit 
			    	number = number/10;
			    }
			     
			    return reversenum;
			    
	    }
	

	public static void main(String[] args) {  
		
		    Scanner userInput = new Scanner(System.in) ;
			 //Prompt the user for Input and store in variable
		 	System.out.println("Enter the number you want to be reversed" ) ;
		 	int num =userInput.nextInt();
		   
		 	ReverseNumber rev = new ReverseNumber();
		 	
		    //Print the reversed number
		 	System.out.println("reversed number="+ rev.reverseNumber(num) ) ;
		    
		}
		    
}


