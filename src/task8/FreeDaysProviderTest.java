package task8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FreeDaysProviderTest {

	@Test
	void shouldGiveProperTextForFreeDayInNovember() {
		FreeDaysProvider provider = new FreeDaysProvider();
		
		assertEquals("Wolny", provider.getTextForDay(1));
		assertEquals("Wolny", provider.getTextForDay(11));
		assertEquals("Wolny", provider.getTextForDay(3));
	}
	
	@Test
	void shouldGiveProperTextForWorkingDayInNovember() {
		FreeDaysProvider provider = new FreeDaysProvider();
		
		assertEquals("Pracujący", provider.getTextForDay(5));
		assertEquals("Pracujący", provider.getTextForDay(6));
		assertEquals("Pracujący", provider.getTextForDay(8));
	}
}
