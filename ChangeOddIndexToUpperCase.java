package week.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char toPrint;
		
		char[] testArr = test.toCharArray();
		
		for (int i = 0; i < testArr.length; i++) {
			if (i%2 != 0) {
				toPrint = Character.toUpperCase(testArr[i]);
				System.out.print(toPrint);
			
			} else {
				System.out.print(testArr[i]);
			}
		}
	}

}
