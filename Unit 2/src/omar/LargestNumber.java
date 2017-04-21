package omar;
import java.util.Scanner;
public class LargestNumber {

	/**
	 * LargestNumber.java
	 * Finds the largest number between two numbers
	 * @author Omar Fakih
	 * April 4th, 2017
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		int [] num = new int[5];
		for(int i = 0; i<num.length;i++){
			num[i] = sc.nextInt();
		}
		System.out.println("The largest number is" + LargestNum(num));
	}

	public static int LargestNum(int [] num) {
		int a = num[0];
		for(int i = 0; i<num.length;i++){
			a = Math.max(a, num[i]);
		}
			return a;
	}
}

