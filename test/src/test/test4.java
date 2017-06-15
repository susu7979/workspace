package test;

import java.util.Scanner;

public class test4 {
	public static int sumOf(int[] arr) {
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(args[0]);
		int a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		int[] m = new int[a];
		for (b = 0; b < a; b++) {
			m[b] = scanner.nextInt();
		}


		System.out.println(sumOf(m));
	}
}
