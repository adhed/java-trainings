package task9;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTableTest {

	@Test
	void shouldCalculateProductFromTwoNumbers() {
		String expectedProduct = "50";
		
		MultiplicationTable multiTable = new MultiplicationTable();
		
		assertThat(multiTable.getNumberValue(5, 10), containsString(expectedProduct));
	}
	
	@Test
	void shouldAddAdditionalSpaceForOneDigitProduct() {
		String expectedProductWithSpace = "6" + "  ";
		
		MultiplicationTable multiTable = new MultiplicationTable();
		
		assertEquals(expectedProductWithSpace, multiTable.getNumberValue(2, 3));
	}

}
