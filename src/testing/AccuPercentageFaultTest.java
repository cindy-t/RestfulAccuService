package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import accu.Accu;

public class AccuPercentageFaultTest {

	//test output van een fout ingevoerde accupercentage
	//moet 0 teruggeven
	@Test
	public void testCalculationAccuPercentage() {
		Accu accu = new Accu();
		int output = accu.calculateAccuPercentageUntilFull(120);
		assertEquals(0, output);
	}
}
