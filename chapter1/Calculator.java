import java.util.Scanner; // imports the lib to scan the response

public class Calculator{
	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);  // Scanner is set to new input scanner which is input type
		
		boolean x = true;
		boolean y = true;
		double fNum,sNum;
		String option;
		
		
		while (x){                                         // executes while loop only when x=true.
			
			System.out.print("Enter your first number ");  // Asks for user input
			fNum = input.nextDouble();                    // stores the response value in fNum variable
			
			System.out.print("Do you want to / * + - ?"); // Asks for user input
			input.nextLine();                             // skips a line before reading a response
			option = input.nextLine();                   // stores the response value in option variable
			
			System.out.print("Enter your second number "); // Asks for user input
			sNum = input.nextDouble();                     // stores the response value in fNum variable
			input.nextLine();                              // skips a line before reading a response
			y=true;                                        //sets the value of y as true, useful if user says yes to do another calculation
			
			
			switch (option){                              // switch is to match the case with multiple choices, for option responce ase there are 4 options
			
			case "/":
				System.out.println("The answer is = " + (fNum/sNum)); // if division is selected then this case is used and prints the final answer
				x=false;                                              // To end the while loop x is set to false
				break;
				
					
			case "*":
				System.out.println("The answer is = " + (fNum*sNum)); // if multiplication is selected then this case is used and prints the final answer
				x=false;                                              // To end the while loop x is set to false
				break;
				
			case "+":
				System.out.println("The answer is = " + (fNum+sNum)); // if addition is selected then this case is used and prints the final answer
				x=false;                                              // To end the while loop x is set to false
				break;
				
			case "-":
				System.out.println("The answer is = " + (fNum-sNum)); // if subtraction is selected then this case is used and prints the final answer
				x=false;                                              // To end the while loop x is set to false
				break; 
			} 
			
			while (y){ 												  // executes loop only when y=true. this loop is intended to ask user if they wish to re run the program
				System.out.println("Do you want to do another calculation? enter 'y' or 'n' "); // asks user to choose an option
				option=input.nextLine(); // saves the response in option variable
				
			
					if (option.equals("y")){ // matches the user input response with y only, if any other response then asks to choose again
						x=true;              // sets x = true so the x loop can be run again and asks user to re enter the numbers
						y=false;		     // To end the while loop y is set to false
						break;
					}
					
					else if (option.equals("n")){    // matches the user input response with n only, if any other response then asks to choose again
						y=false;			        // To end the while loop y is set to false
						System.out.println("Thank you GoodBye"); // prints the final message and end of the program
						break;
					}
				}
				
			}
		}
		
		
	}
