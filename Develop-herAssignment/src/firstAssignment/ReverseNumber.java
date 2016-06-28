package firstAssignment;

import java.util.Scanner;
/*
 * ReverseNumber application takes input from user and reverse the number
 */

public class ReverseNumber {
	  
	
	private int reverseNumber(int number ){
	    	
	    	 int reversenum=0;
			    //loop until last digit
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
		
		String next   ="Yes"; 
		Scanner userInput = new Scanner(System.in) ;
		Scanner nextInput = new Scanner(System.in) ;
		
		//loop until user does not want to enter the number.
		while(next.equalsIgnoreCase("Yes")){
			
			    //Prompt the user for Input and store in variable
			 	System.out.println("Enter the number you want to be reversed" ) ;
			 	int num;
				num = userInput.nextInt();
				
			 	ReverseNumber rev = new ReverseNumber();
			 	
			    //Print the reversed number by calling reverseNumber method. 
			 	System.out.println("reversed number="+ rev.reverseNumber(num) ) ;
			 	
			 	//prompt the user for another Input and store in variable 
			 	System.out.println("Do you want to enter one more number : Enter Yes or No ") ;
			 	next =nextInput.nextLine();
			 	
			 	System.out.println("You have entered " + next) ;
			}
		    // close the scanner if user does not enter another number.
		    System.out.println("Closing Scanners...");
		    nextInput.close();
		    userInput.close();
		    
		}
		    
	
}


