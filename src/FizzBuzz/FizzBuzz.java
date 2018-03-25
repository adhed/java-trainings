package FizzBuzz;

public class FizzBuzz {
	public void printLine(String line) {
		System.out.println(line);
	}
	
	public void printLines(Integer numberOfLines) {
		for (int i = 1; i <= numberOfLines; i++) {
			String line = this.getLineText(i);
			this.printLine(line);
		}
	}
	
	public String getLineText(Integer index) {
		boolean isDividableBy3 = this.isDividableBy(index, 3);
		boolean isDividableBy5 = this.isDividableBy(index, 5);
		String fizzBuzzText = "";
	
		if (isDividableBy3) {
			fizzBuzzText += "Fizz";
		}
		if (isDividableBy5) {
			fizzBuzzText += "Buzz";
		}
		
		return fizzBuzzText.isEmpty() ? index.toString() : fizzBuzzText;
	}
	
	public boolean isDividableBy(int number, int divider) {
		return number % divider == 0;
	}
}
