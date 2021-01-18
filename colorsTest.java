package HexColorPlayground;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class colorsTest {

	@Test
	public void testbasicColors() {
		basicColors test = new basicColors();
		String result = (String) test.dictColor("1");
		assertEquals("FF0000", result);
	}

}
