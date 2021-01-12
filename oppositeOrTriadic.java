package HexColorPlayground;
import java.util.*;
public class oppositeOrTriadic {
	//public static void main(String[] args) {
	/**
	 * @param colorChosen
	 * @return the hexedecimal value opposite of the current color
	 * <p> this is done by splitting the string in by pair (RGB),converting them to decimal, and subtracting them from 255 (max color value) 
	 * <br>
	 * then they get converted back to Hexadecimal and return the value</br>
	 */
	public final Object opposite(String colorChosen)
	{
		String x = colorChosen.substring(0,2);
		int Red = 255 - Integer.parseInt(colorChosen.substring(0,2),16);
		int Blue = 255 - Integer.parseInt(colorChosen.substring(2,4),16);
		int Green = 255 - Integer.parseInt(colorChosen.substring(4,6),16);
		return (Integer.toHexString(Red).format("%02X",Red)
				+Integer.toHexString(Blue).format("%02X",Blue)
				+Integer.toHexString(Green).format("%02X",Green));
	}
	/**
	 * @param colorChosen
	 * @return the hexadecimal values that are in the 2 other ends in the triangle formation on the color wheel
	 * 
	 *<p> the Hexadcimal color code is sliced into pairs (RGB) all moved one position after (e.g. from 123 to 312 to 231)
	 *<br>pairs are put back together and returned </br>
	 *
	 */
	public final Object triadic(String colorChosen) {

		String triad1 = colorChosen.substring(2,4) + colorChosen.substring(4,6) + colorChosen.substring(0,2);
		String triad2 = triad1.substring(2,4) + triad1.substring(4,6) + triad1.substring(0,2);
		//System.out.println("#" + triad1.toUpperCase() + " and #"+ triad2.toUpperCase());
		return ("#" + triad1.toUpperCase() + " and #"+ triad2.toUpperCase());
	}
}
