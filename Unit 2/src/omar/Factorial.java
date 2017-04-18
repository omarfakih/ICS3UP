package omar;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = s.nextInt();
		System.out.println(Factorial(num));
	}
	
	
	public static int Factorial(int x){
	if (x < 0)
	{
		return -1;
	}
	else if(x == 0)
	{
		return 1;
	}
	else
	{
		int product = x;
	while (x > 1){
		product = product * (x-1);
		x--;
	}
		return product;
	}
	}
	
}
