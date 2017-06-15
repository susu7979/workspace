package test;

import java.util.Scanner;

public class a005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (0 <= a && a <= 20) {
			int[][] array = new int[a][5];

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < 4; j++) {
					array[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < a; i++) {

				if ((array[i][3] - array[i][2]) == (array[i][2] - array[i][1])
						&& (array[i][2] - array[i][1]) == (array[i][1] - array[i][0])) {

					array[i][4] = array[i][3] + (array[i][3] - array[i][2]);
				} else if (array[i][3] / array[i][2] == array[i][2] / array[i][1]
						&& array[i][2] / array[i][1] == array[i][1] / array[i][0]) {
					array[i][4] = array[i][3] * (array[i][3] / array[i][2]);
				}

				for (int d = 0; d < 5; d++) {
					System.out.print(array[i][d] + " ");
				}
				System.out.println();
			}
		}
	}
}
