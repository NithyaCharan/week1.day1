package week.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {

		String pali = "madam";
		char[] paliArr = pali.toCharArray();
		char[] revArr = new char[5];
		int j =0;
		boolean isPali = false;
		int length = paliArr.length;
		
		for (int i = length-1 ; i >=0 ; i--) {
			revArr[j] = paliArr[i];		
			j++;
		}
		
		for (int k = 0; k < revArr.length; k++) {
			if (revArr[k] == paliArr[k]) {
				isPali = true;
			} else {
				isPali = false;
			}
		}
		if (isPali) {
			System.out.println("The string " +pali + " is a Palindrome");
		}
			else {
				System.out.println("The string " +pali + " is not a Palindrome");

			}
	}

}
