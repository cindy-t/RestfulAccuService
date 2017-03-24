package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import accu.Accu;

public class AccuPercentageTest {
	
	//test of het huidige accupercentage terug wordt gegeven
	@Test
	public void testPercentage() {
		Accu accu = new Accu();
		accu.setPercentage(40);
		int output = accu.getPercentage();
		assertEquals(40, output);
	}
}
