package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  1  1..  1  1
* 2  2  2..  2  0
* 3  3  3..  0  0
* .  .  ..   .  .
* .  .  ..   .  .
* .  .  ..   .  .
*n-1 n-1 0   0  0
* n  0   0   0  0 }
*/

public class Zadacha5 {

	public static void main(String[] args) {
		int n;
		int[][] mass;
		int num;

		n = enterFromConsole("Введите n, при условии,что n-четное");
		num = n;
		mass = new int[n][n];

		for (int i = mass.length - 1; i >= 0; i--) {
			for (int j = 0; j < mass.length - i; j++) {
				mass[i][j] = num;
			}
			num--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int enterFromConsole(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();
		return x;
	}
}
