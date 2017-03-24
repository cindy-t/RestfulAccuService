package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import accu.Accu;

public class AccuPercentageCalculationTest {

	//test berekening van het accupercentage
	//uitkomst moet 20 zijn: 80% + 20% = 100%
	@Test
	public void testCalculationAccuPercentage() {
		Accu accu = new Accu();
		int output = accu.calculateAccuPercentageUntilFull(80);
		assertEquals(20, output);
	}
}
