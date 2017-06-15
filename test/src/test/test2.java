package test;

import java.util.Scanner;

public class test2 {
	public static int sumof(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		
		
		
		int m, n, o;
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		n = scanner.nextInt();
		o = scanner.nextInt();

		System.out.print(m + "+" + n + "+" + o + "=");
		System.out.println(sumof(m, n, o));
	}
}
