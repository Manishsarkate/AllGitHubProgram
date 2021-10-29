package functionprogram;

import java.util.Scanner;

public class method2 {
	
	public static void main(String[] args) {

		int a, b, add, sub, mult;
		float divide;

		Scanner s = new Scanner(System.in);// object created

		System.out.println("Enter the first Number :");// user though first input
		a = s.nextInt();// access value scanner object in heap memory

		System.out.println("Enter the second Number :");// user though second input
		b = s.nextInt();// access value scanner object in heap memory

		add = a + b;
		sub = a - b;
		mult = a * b;
		divide = (float) a / b;

		System.out.println("addition :" + add);
		System.out.println("sub :" + sub);
		System.out.println("mult :" + mult);
		System.out.println("divide :" + divide);
	}

}
