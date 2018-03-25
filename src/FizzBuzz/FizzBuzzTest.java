package FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void shouldDetermineThatNumberIsDividable() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertEquals(true, fizzBuzz.isDividableBy(25, 5));
		assertEquals(true, fizzBuzz.isDividableBy(80, 5));
		assertEquals(true, fizzBuzz.isDividableBy(100, 5));
		
		assertEquals(true, fizzBuzz.isDividableBy(21, 7));
		assertEquals(true, fizzBuzz.isDividableBy(36, 12));
	}
	
	@Test
	void shouldPrintFizzForNumberDividableBy3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertThat(fizzBuzz.getLineText(3), containsString("Fizz"));
		assertThat(fizzBuzz.getLineText(6), containsString("Fizz"));
		assertThat(fizzBuzz.getLineText(9), containsString("Fizz"));
	}

	@Test
	void shouldPrintBuzzForNumberDividableBy5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertThat(fizzBuzz.getLineText(50), containsString("Buzz"));
		assertThat(fizzBuzz.getLineText(25), containsString("Buzz"));
		assertThat(fizzBuzz.getLineText(5), containsString("Buzz"));
	}
	
	@Test
	void shouldPrintFizzBuzzForNumberDividableBy3And5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertThat(fizzBuzz.getLineText(15), containsString("FizzBuzz"));
		assertThat(fizzBuzz.getLineText(30), containsString("FizzBuzz"));
		assertThat(fizzBuzz.getLineText(60), containsString("FizzBuzz"));
	}
	
	@Test
	void shouldPrintNumberWhenThisNumberIsNotDividableBy3Nor5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertThat(fizzBuzz.getLineText(2), containsString("2"));
		assertThat(fizzBuzz.getLineText(89), containsString("89"));
		assertThat(fizzBuzz.getLineText(11), containsString("11"));
	}

}
