package test;

import java.util.Arrays;
import java.util.Scanner;

public class a016 {

	public static boolean checkRow(int[] num) {
		int a;
		for (int i = 1; i < 10; i++) {
			Arrays.sort(num);
			a = Arrays.binarySearch(num, i);
			if (a >= 0)
				continue;
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] num = new int[9][9];
		int[][] num2 = new int[9][9];
		int[][] square = new int[9][9];
		while (scan.hasNext()) {
			// Get num 2-dim array
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					num[i][j] = scan.nextInt();
				}
			}

			// Get num2 2-dim array
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					num2[i][j] = num[j][i];
				}
			}

			// for (int i = 0; i < 3; i++) {
			// for (int j = 0; j < 3; j++) {
			// square[0][j+i*3] = num[i][j];
			// }
			// }

			for (int k = 0; k < 9; k++) {
				int add = 0;
				int iStart;
				if (k < 3) {
					iStart = 0;
				} else if (k < 6) {
					iStart = 3;
				} else {
					iStart = 6;
				}
				int jStart;
				if (k % 3 == 0) {
					jStart = 0;
				} else if (k % 3 == 1) {
					jStart = 3;
				} else {
					jStart = 6;
				}
				for (int i = iStart; i < (iStart + 3); i++) {
					for (int j = jStart; j < (jStart + 3); j++) {
						square[k][add] = num[i][j];
						add = add + 1;
						// System.out.print(square[k][add]);
					}
				}
			}

			boolean a, b, c;
			for (int i = 0; i < 9; i++) {
				a = checkRow(num[i]);
				b = checkRow(num2[i]);
				c = checkRow(square[i]);
				if (!(a && b && c)) {
					System.out.println("no");
					return;
				}
			}
			System.out.println("yes");
		}

		scan.close();
	}
}
