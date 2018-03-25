package FizzBuzz;

public class FizzBuzz {
	public void printLine(String line) {
		System.out.println(line);
	}
	
	public void printLines(Integer numberOfLines) {
		for (Integer i = 1; i <= numberOfLines; i++) {
			String line = this.getLineText(i);
			this.printLine(line);
		}
	}
	
	public String getLineText(Integer index) {
		Boolean isDividableBy3 = this.isDividableBy(index, 3);
		Boolean isDividableBy5 = this.isDividableBy(index, 5);
		
		if (isDividableBy3 || isDividableBy5) {
			String text = isDividableBy3 ? "Fizz" : "";
			
			return isDividableBy5 ? text += "Buzz" : text;
		}
		return index.toString();
	}
	
	public Boolean isDividableBy(Integer number, Integer divider) {
		return number % divider == 0;
	}
}
