package HexColorPlayground;
import java.util.*;

public class hexColPlay {

	
	public static void main(String[] args)
	{
		
		
		var colorOrNumber = new Scanner(System.in);
		
		System.out.println("Welcome to Yanni's Hex Color Playground!\n"
				+ "Would you like to choose a color or input your own Hex code?\n"
				+ "A) Color\n"+ "B) I'll input my own hex color code, thanks.\n");
		
		String colOrNumInp =  colorOrNumber.nextLine().toUpperCase();
		System.out.println("Your choice is: " + colOrNumInp);
		
		
		String currentHexCode= "";
		
		if (colOrNumInp.equals("A")) {
			presetColors cols = new presetColors();
			
			System.out.println("Choose from the following colors (choose a number!): " + cols.colors);
			
			var colorChoiceInp = new Scanner(System.in);
			String colorChoice = colorChoiceInp.nextLine();
			basicColors obj = new basicColors();
			
			currentHexCode = (String)obj.dictColor(colorChoice);
			
		}

		else if (colOrNumInp.equals("B")) {
			System.out.println("Please enter your hexcode in the range of 000000 to FFFFFF!\n"
					+ "(e.g.123abc)");
			var colorChoiceInp = new Scanner(System.in);
			String colorChoice = colorChoiceInp.nextLine();
			currentHexCode = colorChoice;
			
		}
		
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
		
		System.out.println("Would You like to:\n"
				+ "A. Get the opposite complementary color to my Hex Code!\n"
				+ "B. Get the triadic complementary colors to my Hex Code!\n"
				+ "C. Get out of here! (Type 'N' in the input) \n");
		
		If 
		//String str = decToHex();
		//System.out.println("Method 1: Decimal to hexadecimal: "+str);
		
		
		// creating a My HashTable Dictionary
		/*Hashtable<String, String> my_dict = new Hashtable<String, String>();

    // Using a few dictionary Class methods
		// using put method
		int[] RGB = {69,0,0};
		
		int p = 10;
		String stri = Integer.toString(p);
		my_dict.put("1", "Apple");
		
		
		
		
		my_dict.put(Integer.toString(p), Integer.toString(RGB[0])+ Integer.toString(RGB[1]));
		
		// using get() method
		System.out.println("\nValue at key = 10 : " + my_dict.get(Integer.toString(p))); 
		
	
		wow obj = new wow();
		System.out.println(obj.z);*/
	}
}
