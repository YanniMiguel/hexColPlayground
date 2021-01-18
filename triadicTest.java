package HexColorPlayground;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class triadicTest {

	@Test
	public void testoppositeOrTriadicTest() {
		oppositeOrTriadic test = new oppositeOrTriadic();
		String result = (String) test.triadic("123abc");
		assertEquals("#3ABC12 and #BC123A", result);
	}

}
