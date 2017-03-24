package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//Test Suite
@RunWith(Suite.class)
@SuiteClasses({ AccuPercentageCalculationTest.class, AccuPercentageFaultTest.class, AccuPercentageTest.class })
public class AllTests {

}
