import java.util.Scanner; // Needing to import this class to be able to read from the keyboard.
public class Windchill_Factor_Calculetor {


		// This program calculates Windchill factor which is an index in cold weather that meteorologists report
		// This index provides a measure of the chilling effect of wind at a given air temperature.
		// The program needs input of the wind speed and the temperature to calculate Windchill factor

			public static void main(String[] args) {
				

				//Declaring scanner
				Scanner input = new Scanner(System.in);
				
				//Prints a welcome message.
				System.out.println("Welcome to windchill factor calculator");
				System.out.println("--------------------------------------");
				//Asking User for input
				System.out.println("Enter wind speed in m/s:");
				
				// Variable declarations 
				int v = input.nextInt();
				
				// Asking User for entering temperature
				System.out.println("Enter temperature in degrees Celsius (less or equal then 10) : ");
				
				// Variable declaration
				int t = input.nextInt();
				
				// Declaring If statement to limit entering t to be less than 10
				if (t <=10) {
				
				// Declaring Exponent for v
				double a = (double) Math.pow(v,0.16);
				double b = (double) Math.pow(v,0.016);
				
				// Declaring formula for calculation w
				double w = 13.12 + 0.6215 * t - 11.37 * a + 0.3965 * t * b;
				
				// Display the output w from formula
				System.out.println("The windchill factor is " + w + " degrees Celsius");
				
				// Closing message for the user
				System.out.println("Thank you for using the windchill factor calculator!");
					
				}
				
				// If the user input t more than 10, It will be an error
				else {
					System.out.println("error");
				}
				
				 //Close the Scanner Object
			    input.close();	
				
			}

	}



