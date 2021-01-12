package HexColorPlayground;


import java.util.*;

/**
 * Date: 01-12-21
 * <p>
 * @author Adrian Miguel Custodio
 * <p>
 * @version 1.0
 * 
 *	
 */
public class hexColPlay {

	
	/**
	 * Main area where the program happens
	 * @param args
	 * 
	 */
	public static void main(String[] args)
	{
		/**
		 * String loops is a placeholder for the do-while loop to repeat the code until the user inputs 'Y'  
		 */
		String loops = "";						
		do {									
		
		System.out.println("Welcome to Yanni's Hex Color Playground!\n"
				+ "Would you like to choose a color or input your own Hex code?\n"
				+ "A) Color\n"+ "B) I'll input my own hex color code, thanks.\n"
						+ "C) I'll INPUT my OWN color values, please.");
		
		/**
		 * user input for the first set of choices
		 * <p>
		 * String currentHexCode is an empty string to hold, well, the upcoming hex code from the if-else statements
		 */
		
		var colorOrNumber = new Scanner(System.in);
		String colOrNumInp =  colorOrNumber.nextLine().toUpperCase();
		System.out.println("Your choice is: " + colOrNumInp);
		
		
		String currentHexCode= "";
		
		
		/**
		 * if statements part 1: Preset colors
		 * <p>
		 * I chose to put the list of color options in another class for organization
		 * <p>
		 * userInput asks for the number from the printed choices
		 * 
		 *pass colorChoice  choice of Color passed to dictColor
		 *<p>
		 *to get the hexadecimal value; also updates currentHexCode for Hexadecimal value / error catcher if number is out of bounds
		 */
		if (colOrNumInp.equals("A")) {
			
			presetColors cols = new presetColors();
			
			System.out.println("Choose from the following colors (choose a number!): " + cols.colors);
			
			var colorChoiceInp = new Scanner(System.in);
			String colorChoice = colorChoiceInp.nextLine();
			basicColors obj = new basicColors();
			
			currentHexCode = (String)obj.dictColor(colorChoice);
			
			/**
			 *nested if statement in case the user enters a number out of bounds
			 *<p>
			 *loops back to the beginning
			 * 
			 */
			if (currentHexCode.equals("Number of choice is out of bounds")){
				System.out.println(currentHexCode);
				loops = "Y";
				continue;
			}
			
		}
		/**
		 * if statements part 2: personal hexacode input
		 * 
		 * var colorChoiceInp for the currentHexCode to be updated
		 */
		else if (colOrNumInp.equals("B")) {
			System.out.println("Please enter your hexcode in the range of 000000 to FFFFFF!\n"
					+ "(e.g.123abc)");
			var colorChoiceInp = new Scanner(System.in);
			String colorChoice = colorChoiceInp.nextLine();
			currentHexCode = colorChoice;
			
		}
		
		/**
		 * if statements part 3: personal color value input
		 *
		 *String crayola [] is a list that contains the three main color of light
		 *<p>
		 *int RGB [] is a list that holds the values to be converted into Hexadecimals
		 *<p>
		 *for loop is used to ask the value of every color and assigning them to list RGB
		 *<p>
		 *currentHexCode will be updated to a string of every value put together
		 *<p>
		 *Integer.toHexString converts the numbers to Hexadecimals with String data type
		 */
		
		else if (colOrNumInp.equals("C")) {
			String crayola[] = {"Red","Green","Blue"};
			int RGB [] = {0,0,0};
			
			System.out.println("Please input your value for every color (0-255)\n");
			for (int i = 0; i < 3 ; i++) {
				System.out.println(crayola[i] + ": ");
				Scanner colorInp = new Scanner(System.in);
				int colorValue = colorInp.nextInt();
				RGB [i] = colorValue;
			}
			currentHexCode = Integer.toHexString(RGB[0]).format("%02X",RGB[0])
					+Integer.toHexString(RGB[1]).format("%02X",RGB[1])
					+Integer.toHexString(RGB[2]).format("%02X",RGB[2]);
			
			
		}
		System.out.println("The Hexcode is: #"+currentHexCode);
		
		/**
		 *var oppOrTriad user input for the next segment of if-else statements
		 *<p>
		 *var yesOrNah user input for the do while loop
		 *
		 *<p>
		 *Some key terms:
		 *<p>
		 *Opposite = Complementary color on the other side of the color wheel
		 *<p>
		 *Triadic = 3 Hex codes distanced equally from each other that form a triangle on the color wheel
		 */
		
		var oppOrTriad = new Scanner(System.in);
		var yesOrNah = new Scanner(System.in);
		
		String loopForOppTriad = "";
		
			do {
				
				var yesOrNah2 = new Scanner(System.in);
		
				
				
				System.out.println("Would You like to:\n"
						+ "A. Get the opposite complementary color to my Hex Code!\n"
						+ "B. Get the triadic complementary colors to my Hex Code!\n"
						+ "C. Get out of here!  \n");
				
				
				
				String oppOrTriadInp =  oppOrTriad.nextLine().toUpperCase();
				System.out.println("Your choice is: " + oppOrTriadInp);
				
				/**
				 * if statements 2 electric boogaloo Option A : 'Opposite'
				 * 
				 * oppositeOrTridaic oppo creates a vraiable forthe oppositeOrTriadic() method
				 * 
				 *pass currentHexCode to oppositeOrTriadic
				 *to get the opposite value of the Hexcode
				 * 
				 * <p>
				 * rinse and repeat for Option B: 'Triadic'
				 * <p>
				 * Option C just let's you leave the loop  
				 */
				
				if (oppOrTriadInp.equals("A")) {
					oppositeOrTriadic oppo = new oppositeOrTriadic();
					
					String oppositeHexcode = (String)oppo.opposite(currentHexCode);
					
					System.out.println(oppositeHexcode);
				}
				else if (oppOrTriadInp.equals("B")) {
					oppositeOrTriadic triad = new oppositeOrTriadic();
					
					String triadicHexcode = (String)triad.triadic(currentHexCode);
					
					System.out.println(triadicHexcode);
				}
				
				else if (oppOrTriadInp.equals("C")) {
					System.out.println("Ok bye thank");
				}
			
			/**
			 * String weLooping asking for a value; expecting a Y in order to loop back through the Opposite/Triadic questions
			 * <p>
			 * Press any key to exit loop
			 * <p>
			 * Same applies for the do while loop(for the ENTIRE program) in the next lines of code
			 */
			System.out.println("Wanna choose the other option? Press Y to continue; Press any key to exit");
			String weLooping = yesOrNah2.nextLine().toUpperCase();
			loopForOppTriad = weLooping;
				
				
			} while (loopForOppTriad.equals("Y"));
		
		System.out.println("From the top? Press Y to continue; Press any key to exit");
		String areWeLooping = yesOrNah.nextLine().toUpperCase();
		loops = areWeLooping;
		
		} while (loops.equals("Y"));
		
	
	}
}
