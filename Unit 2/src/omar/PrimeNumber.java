package omar;
import java.util.Scanner;
public class PrimeNumber {
	
	/**
	 * PrimeNumber.java
	 * Finds out whether a number is prime or not
	 * @author Omar Fakih
	 * April 4th, 2017
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		if (isDivisible(num) == true){
			System.out.println(isDivisible(num) + ", this number is a prime number.");
		}
		else {
			System.out.println(isDivisible(num) + ", this number is not a prime number.");
		}

	}

	public static boolean isDivisible(int x){
		int answer = 0;
		for (int i = 2; i < x/2; i++){
		
			answer = x % i;
			if (x <= 1 )
			{
				return false;
			}
			else if (answer == 0)
			{
				return false;
			}
		}
		return true;
	
	}
		
}
