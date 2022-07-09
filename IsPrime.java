package week.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=21;
		int check =0;
		boolean isPrime = false;
		
		for (int i = 2; i < n-1; i++) {
			check = n%i;
			if (check == 0) {
				isPrime = true;
				break;
			}
		} 
		if (isPrime == true) {
			System.out.println("The number is not Prime");
		} else {
			System.out.println("The number is Prime");
		}
	}

}
