package week.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] myArr = text.split(" ");
		String[] finTextArr = new String[text.length()];
		
		for (int i = 0; i < myArr.length; i++) {
			for (int j = i+1; j < myArr.length; j++) {
				if (myArr[i].equalsIgnoreCase(myArr[j])) {
					count++;
				} else {
					continue;
				}
				if (count>0) {
					myArr[i] = "";
				} 
			}
			finTextArr[i] = myArr[i];
			System.out.print(finTextArr[i] + " ");
		}
	}

}
