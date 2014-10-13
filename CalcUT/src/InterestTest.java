import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;

import mainpackage.Interest;

public class InterestTest {

	@Test
	public void testInterest() {
		Interest test = new Interest(10000, 3, 3.25);
		
		assertEquals(11007.03, test.getValue(), 1);
	}

}