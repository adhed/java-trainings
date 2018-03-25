package task8;

public class FreeDaysProvider {
	private static final int[] FREE_DAYS = new int[]{ 1, 3, 4, 10, 11, 17, 18, 24, 25 };
	
	public void printFreeDays() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + " listopada " + this.getTextForDay(i));
		}
	}
	
	public String getTextForDay(int dayNumber) {
		boolean isFreeDay = contains(FreeDaysProvider.FREE_DAYS, dayNumber);
		return isFreeDay ? "Wolny" : "Pracujący";
	}
	
	public static boolean contains(final int[] array, final int v) {
        boolean result = false;

        for (int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
}
