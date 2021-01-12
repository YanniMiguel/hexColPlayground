package HexColorPlayground;
import java.util.*;
public class basicColors {
	//public static void main(String[] args) {
    /**
     * @param colorChosen
     * @return the designated value in dictOfColors based on colorChosen
     * 
     * <p>
     * colorValues contain the values of 2 consecutive colors, as they have a pattern
     * <br>
     * RGB is a placeholder list that will be filled with Hexadecimal codes in RGB order</br>
     * <p>
     * currentColor1 and currentColor2 will contain the indices of the colors needed (e.g. Red and Green, Green and Blue, Blue and Red)
     * <p>
     * 
     * for loop traverses through the 12 colors
     * <br> if statements change the currentColors after every 4th number</br>
     * <br> since there are 4 values, the 12 colors are divided by 4s, hence the modulo
     * <p> 
     * values are converted to hexadecimals, put together, and paried with a 'key' in the dictionary, which is then returned
     * <p>
     * RGB values rested back to zero every time it loops
     */
    public Object dictColor(String colorChosen) 
    { 
    	Hashtable<String, String> dictOfColors = new Hashtable<String, String>();
    	
    	int[][] colorValues = {{255,0},{255,128},{255,255},{128,255}};
    	int[] RGB = {0,0,0};
    	
    	int currentColor1= 0;
    	int currentColor2= 1;
    	
    	
    	if (Integer.parseInt(colorChosen) <= 12) 
    		{
    	//System.out.println(Arrays.toString(RGB));
	    	for (int i = 0; i < 12 ; i++) 
	    		{
	    		if (i>8) {
	    			currentColor1 = 2;
	    			currentColor2 = 0;
	    		}
	    		else if (i>4) {
	    			currentColor1 = 1;
	    			currentColor2 = 2;
	    		}
	
	    		String indexToStr = Integer.toString(i+1);
	    		
	    		int colValPicker = i % 4;
	    		RGB[currentColor1] = colorValues[colValPicker][0];
	    		RGB[currentColor2] = colorValues[colValPicker][1];
	    		
	    		
	    		
	    		
	    		dictOfColors.put(indexToStr, Integer.toHexString(RGB[0]).format("%02X",RGB[0])
	    					+Integer.toHexString(RGB[1]).format("%02X",RGB[1])
	    					+Integer.toHexString(RGB[2]).format("%02X",RGB[2]));
	    		//System.out.println("\nValue at key "+ (i+1) +": "+ dictOfColors.get(""+indexToStr));
	    		RGB[0]=0;
	    		RGB[1]=0;
	    		RGB[2]=0;
	    		}
	    	return dictOfColors.get(colorChosen);
    		}
    	else {
    		return ("Number of choice is out of bounds");
    	}
    	
    	//System.out.println("#" + dictOfColors.get("4"));
  
    	
    } 
} 