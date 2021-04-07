package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  1  1..  1  1  1
* 0  1  1..  1  1  0
* 0  0  1..  1  0  0
* .  .  ..   .  .  .
* .  .  ..   .  .  .
* .  .  ..   .  .  .
* 0  1  1    1  1  0
* 1  1  1    1  1  1 }
*/

public class Zadacha6 {

	public static void main(String[] args) {
		int[][] mass;
		int n;

		n = enterFromConsole("Введите n, при условии,что n-четное");
		mass = new int[n][n];

		for (int i = 0; i < n; i++) { // Диагонали
			for (int j = 0; j < n; j++) {
				mass[i][mass.length - i - 1] = 1;
				mass[i][i] = 1;
			}
		}
		for (int i = 0; i < n; i++) { // Верхний треугольник
			for (int j = i + 1; j < n - i; j++) {
				mass[i][j] = 1;
			}
		}
		for (int i = mass.length - 1; i > 0; i--) { // Нижний треугольник
			for (int j = i - 1; j > n - i - 1; j--) {
				mass[i][j] = 1;
			}
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
