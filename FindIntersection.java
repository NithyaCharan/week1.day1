package week.day2.assignments.mandatory;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int[] arr3 = new int[6];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[k] = arr1[i];
					System.out.println(arr3[k]);
					k++;
				} else {
					continue;
				}
			}
		}
	}

}
