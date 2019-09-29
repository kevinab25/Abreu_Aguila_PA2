import java.util.Scanner;

public class arithmeric {

	/*
	 * 2.15 Write an application that asks the user to enter two integers,
	 * obtains them from the user and prints their sum, product, difference and quotient.
	 */
	
	/*
	 * prompt for input 
	 * get numbers from user and store in x and y.
	 * 
	 * store x + z in y
	 * print z 
	 * 
	 * store x * y in w
	 * print w
	 * 
	 */
	
	
	
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
	int n1 = in.nextInt();
	
	System.out.print("Enter the second numer: ");
	int n2 = in.nextInt();
	
	int ans = n1 + n2;
	System.out.printf("%d + %d = %d\n", n1, n2, ans);
	
	ans = n1 - n2;
	System.out.printf("%d - %d = %d\n", n1, n2, ans);
	
	ans = n1 * n2;
	System.out.printf("%d * %d = %d\n", n1, n2, ans);
	
	ans = n1 / n2;
	System.out.printf("%d / %d = %d\n", n1, n2, ans);
	
	in.close();
		
	}
}
