package omar;
import java.util.Scanner;
public class GCF {

	/**
	 * GCF.java
	 * Finds the greatest common factor between two numbers
	 * @author Omar Fakih
	 * April 4th, 2017
	 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num = s.nextInt();
		int num2 = s.nextInt();
		System.out.println("The greatest common factor is " + gcf(num, num2));

	}

	public static int gcf(int x, int y){
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		int i = min;
		while (max % i != 0 || min % i != 0)
		{
			i--;
		}
			return i;
	}
 
	public static boolean IsDivisible(int x, int y){
		if (x % y == 0)
		{
			return true;
		}
			return false;
	}
}
