package omar;
import java.util.Scanner;
public class SumDigits {

	/**
	 * SumDigits.java
	 * Finds the sum of all the digits inputed by the user
	 * @author Omar Fakih
	 * April 4th, 2017
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		System.out.println(SumOfDigits(num));


	}

	public static int SumOfDigits(int x) {
		
		int total = 0;
		while (x > 0)
		{
			total = total + (x % 10);
			x = x/10;
		}
			return total;
	}
}
