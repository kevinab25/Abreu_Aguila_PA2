import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a 4 digit number:");
		
		int userInput = sc.nextInt();
		
		int d = userInput % 10;
		int c = (userInput % 100) / 10;
		int b = (userInput % 1000) / 100;
		int a = (userInput / 1000);
		int temp;
		
		System.out.println(userInput);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);


		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		System.out.println(userInput);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		temp = a;
		a = c;
		c = temp;
		temp = b;
		b = d;
		d = temp;
		
		System.out.println(userInput);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
