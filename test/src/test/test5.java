package test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input first number: " );
		a = scanner.nextInt();
		
		System.out.print("input second number: ");
		b = scanner.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "%" + b + "=" + (a % b));
	}
}
