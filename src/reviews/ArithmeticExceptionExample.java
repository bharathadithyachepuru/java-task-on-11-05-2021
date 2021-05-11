package reviews;

// This program is written for understanding how Arithmetic exception occurs when a number is divided by '0'

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integer numbers");
		
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		
		
  }

}
