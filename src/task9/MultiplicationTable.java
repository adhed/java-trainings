package task9;

public class MultiplicationTable {
	public void printTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				String value = this.getNumberValue(i, j);
				System.out.print(value);
			}
			System.out.println("");
		}
	}
	
	public String getNumberValue(int number1, int number2) {
		int product = number1 * number2;
		boolean isOneDigit = product < 10;
		
		return isOneDigit ? product + "  " : product + " ";
	}
}
