package week.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] myArr = test.split(" ");
		String[] finTextArr = new String[myArr.length];
		
		for (int i = 0; i < myArr.length; i++) {
			if (i%2 != 0) {
				finTextArr[i] = myArr[i];
				System.out.print(finTextArr[i] + " ");
		} else {
				char[] revArr = myArr[i].toCharArray();
				char[] revToArr = new char[myArr[i].length()];
				int k = 0;
				for (int j = revArr.length-1; j >=0 ; j--) {
					revToArr[k] = revArr[j];
					k++;
				}
				String st = new String(revToArr);
				finTextArr[i] = st;
				System.out.print(finTextArr[i] + " ");
			}
		}
	}

}
