package HexColorPlayground;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class oppositeTest {
	@Test
	public void testoppositeOrTriadicTest() {
		oppositeOrTriadic test = new oppositeOrTriadic();
		String result = (String) test.opposite("000000");
		assertEquals("FFFFFF", result);
	}

}
